package pkg15;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(1212);
        System.out.println("Server is listening on 1212");

        while (true) {
            System.out.println("Waiting...");

            Socket s = ss.accept();
            System.out.println(s.getInetAddress());

            File file1 = new File("/Users/dyobi/Desktop/");
            // .hwp / .docx / .xlsx ok
            FileInputStream fis = new FileInputStream(file1); // open
            DataInputStream dis = new DataInputStream(fis); // helper
            DataOutputStream dos =  new DataOutputStream(s.getOutputStream()); // io network stream

            byte[] arr =  new byte[(int) file1.length()];
            // array based on the file's length
            System.out.println("file --> byte ...");
            dis.readFully(arr);; // 파일내용 -> 바이트 배열

            dos.writeInt(arr.length); // 파일 길이 먼저 전송
            dos.write(arr); // 바이트 배열 전송

            System.out.println("Finished");
        }

    }
}
