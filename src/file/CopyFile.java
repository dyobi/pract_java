package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyFile {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("/Users/dyobi/Desktop/aa.txt"));
		
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("/Users/dyobi/Desktop/bb.txt")));
		
		String tmp = null;
		
		while ((tmp = br.readLine()) != null) {
			pw.println(tmp);
		}
		
		pw.close();
		br.close();

	}

}
