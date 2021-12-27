package pkg13;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageIOFile {
    public static void main(String[] args) throws IOException {

        File file1 = new File("/Users/dyobi/Desktop/hi.png");
        BufferedImage bufferedImage1 = ImageIO.read(file1); // 기존파일을 read하여 이미지화

        File file2 = new File("/Users/dyobi/Desktop/hi2.jpg"); //  .jpg에 이미지를 write
        ImageIO.write(bufferedImage1, "jpg", file2);
        System.out.println("jpg 저장됨");

        File file3 = new File("/Users/dyobi/Desktop/hi3.gif");
        ImageIO.write(bufferedImage1, "gif", file3);
        System.out.println("gif 저장됨");

        File file4 = new File("/Users/dyobi/Desktop/hi4.png");
        ImageIO.write(bufferedImage1, "png", file4);
        System.out.println("png 저장됨");

    }
}
