package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPicture {

	public static void main(String[] args) throws IOException {

		int tmp = 0;		//	'A' => 문자상수 (문자A이면서 동시에 아스키코드 65)
		FileInputStream fis1 = null;
		FileOutputStream fos1 = null;

//		fis1 = new FileInputStream("aa.jpg");			// 경로명이 없을때 최상위 폴더가 상대주소
		fis1 = new FileInputStream("/Users/dyobi/Desktop/aa.jpg");		// Open
		fos1 = new FileOutputStream("/Users/dyobi/Desktop/bb.jpg", false);		// Open
		
		while ((tmp = fis1.read()) != -1) {
//		read() 괄호안이 비어있으면 한 바이트 단위로 처리
			fos1.write(tmp);
//			System.out.print(tmp + " ");
		}
		
		fis1.close();
		fos1.close();

	}

}