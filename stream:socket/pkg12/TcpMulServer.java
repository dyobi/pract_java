package pkg12;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

class ServerClass {

    ArrayList<ThreadServerClass> threadList = new ArrayList<ThreadServerClass>();
    Socket socket; // 클라이언트를 받아 저장할곳
    DataOutputStream outputStream; // 바이트 출력 스트림 [채팅 및 파일]

    // 생성자를  만나게 해야 port번호같은 초기치 처리
    public ServerClass(int portno) throws IOException {
        Socket s1 = null;
        ServerSocket ss1 = new ServerSocket(portno); // 서버소켓 생성
        System.out.println("서버가동...."); // listen

        while (true) {
            s1 = ss1.accept();
            System.out.println("접속주소: " + s1.getInetAddress() + " , 접속포트: " + s1.getPort());
            ThreadServerClass threadServerClass = new ThreadServerClass(s1); // s1 초기치
            threadServerClass.start(); // run()호출
            threadList.add(threadServerClass); // 컬렉션에 add

            System.out.println("접속자수: " + threadList.size() + " 명");
        }
    }

    class ThreadServerClass extends Thread {
        Socket socket1;
        DataInputStream inputStream;
        DataOutputStream outputStream;

        public ThreadServerClass(Socket s1) throws IOException {
            socket1 = s1;
            inputStream = new DataInputStream(s1.getInputStream());
            outputStream = new DataOutputStream(s1.getOutputStream());
            // 입출력 스트림
        }

        @Override
        public void run() {
            String nickname = "";
            try {
                if (inputStream != null) {
                    nickname = inputStream.readUTF();
                    sendChat(nickname + " 님 입장~~~~");
                }
                while (inputStream != null) {
                    sendChat(inputStream.readUTF());
                    // 이번에는 별명이 아니라 클라이언트가 보낸 채팅 내용을 접속한 모두에게 보냄
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                for (int i = 0; i < threadList.size(); i++) {
                    if (socket1.equals(threadList.get(i).socket1)) {
                        threadList.remove(i); // 퇴장시 remove
                        try {
                            sendChat(nickname + " 님 퇴장~~~~");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
                System.out.println("접속자 수  : " + threadList.size() + " 명");
            }
        }

        public void sendChat(String chat) throws IOException {
            for (int i = 0; i < threadList.size(); i++) {
                threadList.get(i).outputStream.writeUTF(chat);
                // 각각의 회원을 찾아가서 별명 or 채팅 내용을 보냄
            }
        }

    }

}

public class TcpMulServer {
    public static void main(String[] args) throws IOException {

        if (args.length != 1) {
            System.out.println("사용법 : 서버실행은 'java 패키지명.파일명 포트번호' 형식으로 입력");
        } else {
            new ServerClass(Integer.parseInt(args[0]));
        }

    }
}
