package pkg8;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientSide {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        Socket s = new Socket("127.0.0.1", 7112); // Connect

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        while (true) {
            System.out.println("글자 넣어봐");
            String in = sc.nextLine();

            if (in.length() == 0) {
                break;
            }
            bw.write(in, 0, in.length());
            // server로 보냄, 키보드 받은것을 0번째부터 모든 길이만큼 모두다 전송
            bw.newLine(); // 줄바꿈도 보냄
            bw.flush(); // 무조건 서버로 전송한 후 buffer 비움
            String out = br.readLine(); // server로 부터 받음
            System.out.println("서버로부터 다시 왔다는 ~~ " + out);
        }
        s.close();
        // 실행은 서버먼저 run 후 클라이언트 run

    }
}
