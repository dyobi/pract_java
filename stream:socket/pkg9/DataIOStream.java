package pkg9;

import java.io.*;

public class DataIOStream {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("/Users/dyobi/Desktop/aa.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        // int, char 형  등의 기본 자료형을 Byte 스트림으로 입출력 가능
        dos.writeInt(35);
        //  파일엗서 4바이트 확보하여 10진수 35를 파일에 2진으로 넣고

        dos.writeDouble(Double.MAX_VALUE);
        dos.writeByte(Byte.MIN_VALUE);
        dos.writeChar('학');
        dos.writeBoolean(false);
        dos.writeUTF("라떼  is horse"); // 문자열 처리

        dos.close();
        fos.close();

        // --------------------------------------------------

        FileInputStream fis = new FileInputStream("/Users/dyobi/Desktop/aa.txt");
        DataInputStream dis = new DataInputStream(fis);

        System.out.println(dis.readInt() + "\t" + dis.readDouble());
        System.out.println(dis.readByte() + "\t" + dis.readChar());
        System.out.println(dis.readBoolean() + "\t" + dis.readUTF());

        dis.close();
        fis.close();

    }
}
