package pkg10;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(7780);
        System.out.println("전화는 준비되어 있음~~");

        while (true) {
            System.out.println("전화 기다리는중 ..");
            Socket s = ss.accept();
            System.out.println(s.getInetAddress() + " 에서 전화왔넹~~");
            OutputStream out;
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            dos.writeUTF("야~~ 오랬만이네!");
            // 클라이언트에서 readUTF() 추가하고
            // dos.writeUTF("한번 만나자"); 이거  안써주면 무전기 형식처리에서 에러

            dos.close();
            s.close();
        }
    }
}
