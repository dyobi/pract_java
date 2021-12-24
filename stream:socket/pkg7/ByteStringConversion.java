package pkg7;

public class ByteStringConversion {
    public static void main(String[] args) {
        String name1 = "Ondal";

        byte[] byteArr = new byte[1024];
        byteArr = name1.getBytes(); // String to byte

        String name2 =  new String(byteArr); // byte to String

        System.out.println(name2);
    }
}
