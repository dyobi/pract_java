package pkg11;

import java.io.IOException;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws IOException {

        if (args.length != 2) {
            System.out.println("사용법은 java 파일명 ip주소 포트번호");
            System.exit(1);
        } else {
            Socket s = new Socket(args[0], Integer.parseInt(args[1])); // connect 작업
            // 서버 클래스 3개 중 ThreadSend, ThreadRcv 클래스를 클라이언트가 공유하여 사용함
            // 즉, 새로 클래스를 만들 필요 없음
            ThreadSend threadSend = new ThreadSend(s);
            ThreadRcv threadRcv = new ThreadRcv(s);

            threadSend.start();
            threadRcv.start();
        }

    }
}
