package pkg10;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws IOException {

        Socket s = new Socket("127.0.0.1", 7780);

        DataInputStream dis = new DataInputStream(s.getInputStream());
        System.out.println("네  말대로 " + dis.readUTF());
        System.out.println(dis.readUTF() + " 그래 그렇게 하자");

        dis.close();
        s.close();
        System.out.println("전화 끊어짐");

    }
}
