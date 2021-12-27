package pkg15;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws IOException {

        Socket s = new Socket("127.0.0.1", 1212);
        DataInputStream dis = new DataInputStream(s.getInputStream());

        int len = dis.readInt(); // 서버가 보낸 파일 길이 먼저 받아옴
        byte[] arr = new byte[len];
        dis.readFully(arr); // 내용을 받아 바이트 배열로

        FileOutputStream fos = new FileOutputStream(new File("/Users/dyobi/Desktop/"));
        fos.write(arr);

        System.out.println("Done!");

    }
}
