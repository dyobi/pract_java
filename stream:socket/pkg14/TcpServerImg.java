package pkg14;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerImg {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(5500);
        System.out.println("Server is listening on 5500");

        while (true) {
            System.out.println("Waiting .....");
            Socket s = ss.accept();
            System.out.println("Connected by " + s.getInetAddress());

            File file1 = new File("/Users/dyobi/Desktop/hi.png");
            FileInputStream fis = new FileInputStream(file1);
            DataInputStream dis = new DataInputStream(fis);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            // File file1 =  new File("Users/dyobi/Desktop/hi.png");
            BufferedImage bufferedImage = ImageIO.read(dis); // 기존 파일 read하여 이미지화 한다음
            ImageIO.write(bufferedImage, "jpg", dos); // socket i/o stream을 통해 보냄

            s.close();
            System.out.println("Completely sent jpg file");
        }

    }
}
