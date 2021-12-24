package pkg8;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

// SERVER : listen -> accept -> iostream
public class ServerSide {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(7112); // listen

        Socket s = ss.accept();

        InputStream is = s.getInputStream(); // 소켓에서 입력 스트림 얻기
        OutputStream os = s.getOutputStream(); // 소켓에서 출력 스트림 얻기

        int b; // byte stream을 처리
        while (true) {
            b = is.read(); // 1byte씩 문자열 읽기 client => server // read(100) 100byte씩
            if (b == -1) break; // -1은 EOF
            os.write(b); // 문자열 출력 server => client
        }
        // 실행은 서버 먼저 run한 후 클라이언트 run

    }
}
