package pkg11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// 1:1 채팅
class ThreadSend extends Thread { // 주기

    Socket s; // From client
    DataOutputStream dos;
    // out -> "방가방가"를 보낼것이므로 기본 데이터 타입별로 처리하기
    // ex) writeInt, writeUTF

    String what; // 채팅시 맨  앞에 나올 문자열

    ThreadSend(Socket s) throws IOException {
        this.s = s;
        dos = new DataOutputStream(s.getOutputStream()); // send를 위한 i/o 스트림
        what = "미팅중 ~~>"; // 대화시 앞에 항상 붙는단어
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        while (dos != null) { //chat 있으면
            try {
                dos.writeUTF(what + sc.nextLine());
                // i/o stream을 통해  상대에게 chat 보내기
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

class ThreadRcv extends Thread { // 받기

    Socket s;
    DataInputStream dis;
    // what ~~> 보내는 쪽이처리하므로 안씀

    ThreadRcv(Socket s)  throws IOException {
        this.s = s; // network input stream
        dis  =  new DataInputStream(s.getInputStream()); // read
    }

    public void run() {
        while (dis != null) {
            try {
                System.out.println(dis.readUTF());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

public class TcpServer {
    public static void main(String[] args) throws IOException {

        if (args.length != 1) {
            System.out.println("사용법은 java 파일명 포트번호");
            System.exit(1);
        } else {
            // listen
            ServerSocket ss = new ServerSocket(Integer.parseInt(args[0]));
            System.out.println("서버 준비 완료!");

            while (true) {
                System.out.println("미팅 대화 기다리는 중 .....");
                Socket s = ss.accept(); // connect 를 받자

                // 아래는 원래 receive / send 가 오는 자리
                // 여기에 thread를 사용
                ThreadSend threadSend = new ThreadSend(s); // 초기치 // 주거니
                ThreadRcv threadRcv = new ThreadRcv(s); // 받거니

                threadSend.start();
                threadRcv.start();
            }
        }

    }
}
