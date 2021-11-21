package file;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteFileViewer {		// 그림파일처리 (byte로 하지 않으면 다 깨져벼림)

	public static void main(String[] args) throws IOException {
		
//		FILE INPUT STREAM -----------------------------------------------------
		FileInputStream fis = new FileInputStream("/Users/dyobi/Desktop/aa.txt");
//		-----------------------------------------------------------------------
		
		
//		FILE OUTPUT STREAM ----------------------------------------------------
		int cnt;
		
		while ((cnt = fis.available()) > 0) {	// 입력 스트림에서 read 할 수 있는 byte 수
			
			byte[] b1 = new byte[cnt];
			int tmp = fis.read(b1);		// read()라면 -> 1byte 읽어 tmp 에 넣음
//			read(byte배열) 입력 스트림에서 byte 배열 크기만큼 읽어 byte 뱅열에 저장
//			read한 바이트 수를 tmp에 넣음
//			ex) System.out.println(tmp);
			
			if (tmp == -1) break;	//	END
			
			String str = new String(b1);	//	문자열로 conversion
			System.out.print(str);
			System.out.println("잠깐만요~ 출력하고 가실계요~");
			
		}
//		-----------------------------------------------------------------------
		

//		FILE STREAM CLOSE -----------------------------------------------------
		fis.close();
//		-----------------------------------------------------------------------

	}

}
