package pkg6;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPMainClass {
    public static void main(String[] args) throws UnknownHostException {
        // InetAddress 클래스는 자바클래스로 IP주소 표현을 위해 사용
        InetAddress inet1 = InetAddress.getLocalHost();
        // class.static 메소드()
        // => 자신이 사용중인 localhost의 InetAddress 객체 리턴

        // IP Address
        System.out.println(inet1.getHostAddress()); // String
        // getHostAddress() 는 IP주소를 문자열로 반환

        System.out.println(inet1.getHostName()); // String
        // Host name 은 문자열로 반환
        // 로컬 컴퓨터 이름 ex) DESKTOP-F3JTTT

        InetAddress inet2 = InetAddress.getByName("www.naver.com");
        System.out.println(inet2); // www.naver.com/223.130.195.200

        InetAddress[] inet3 = InetAddress.getAllByName("www.naver.com");
        for (int i = 0; i <inet3.length; i++) {
            System.out.println(inet3[i]);
        }


        // IP Address(getAddress) to byte 배열, byte 배열 to 십진주소
        // getAddress() : byte[] 배열로 return
        byte[] byte1 = inet1.getAddress();

        for (int i = 0; i < byte1.length; i++) {
            System.out.print(((int)byte1[i] < 0 ? (int)byte1[i] + 256 : (int)byte1[i]) + "" + "\t");
        }
        System.out.println();
    }
}
