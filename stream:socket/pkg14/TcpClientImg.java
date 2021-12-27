package pkg14;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TcpClientImg {
    public static void main(String[] args) throws IOException {

        Socket s = new Socket("127.0.0.1", 5500);
        FileOutputStream fos = new FileOutputStream("/Users/dyobi/Desktop/hi2.png");
        DataInputStream dis = new DataInputStream(s.getInputStream());
        BufferedImage bufferedImage = ImageIO.read(dis);

        ImageIO.write(bufferedImage, "jpg", fos);
        System.out.println("jpg로  저장됨");

        s.close();
        System.out.println("끝~~~");

    }
}
