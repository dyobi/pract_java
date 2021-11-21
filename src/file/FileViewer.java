package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileViewer {
	
//		file은 무조건 throws IOException!!
	public static void main(String[] args) throws IOException {
		
//		OPEN ------------------------------------------------------------------
		
		FileReader fr = new FileReader("/Users/dyobi/Desktop/aa.txt");
//		heap memory에 객체가 만들어지고 aa.txt가 들어감
//		참고적으로 input, output, stream 이 보이면 byte stream
//		reader, writer 가 보이면 문자 stream
		
		BufferedReader br = new BufferedReader(fr);
//		Open의 도우미 (Enhancing speeds)
//		임시방에 버퍼링한 후 한줄 처리	
		
//		-----------------------------------------------------------------------
		
//		READ ------------------------------------------------------------------
		
		String s = null;
//		file read - 화면출력(write) / byte경우는 readInt
		while ((s = br.readLine()) != null) {	// 한줄의 끝: null / 한글자씩의 끝: eof, -1
			System.out.println(s);
		}

//		-----------------------------------------------------------------------
		
//		CLOSE -----------------------------------------------------------------
		
		br.close();
		fr.close();

//		-----------------------------------------------------------------------
		
	}

}
