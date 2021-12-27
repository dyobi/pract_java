package pkg12;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

class ThreadClientSendClass implements Runnable {

    Socket socket;
    DataOutputStream outputStream;
    String nickname;

    public ThreadClientSendClass(Socket socket, String nickname) throws IOException {
        this.socket = socket;
        this.nickname = nickname;
        outputStream = new DataOutputStream(socket.getOutputStream());
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        try {
            if (outputStream != null) outputStream.writeUTF(nickname);
            while (outputStream != null) {
                outputStream.writeUTF("(**" + nickname + "**)" + sc.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

class ThreadClientRcvClass implements Runnable {

    Socket socket;
    DataInputStream inputStream;

    public ThreadClientRcvClass(Socket socket) throws IOException {
        this.socket = socket;
        inputStream = new DataInputStream(socket.getInputStream());
    }

    @Override
    public void run() {
        while (inputStream != null) {
            try {
                System.out.println(inputStream.readUTF());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

public class TcpMulClient {
    public static void main(String[] args) throws IOException {

        if (args.length != 3) {
            System.out.println("사용법 : 클라이언트 실행은 'java 패키지명.파일명 ip주소 닉네임' 형식으로 입력");
            System.exit(1);
        } else {
            Socket s1 = new Socket(args[0], Integer.parseInt(args[1]));
            System.out.println("서버에 연결...");

            ThreadClientSendClass threadClientSendClass = new ThreadClientSendClass(s1, args[2]);
            ThreadClientRcvClass threadClientRcvClass = new ThreadClientRcvClass(s1);

            Thread tsend1 = new Thread(threadClientSendClass);
            Thread trcv1 = new Thread(threadClientRcvClass);

            tsend1.start();
            trcv1.start();
        }

    }
}
