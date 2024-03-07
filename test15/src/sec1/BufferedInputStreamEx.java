package sec1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamEx {

	public static void main(String[] args) throws IOException {
		BufferedInputStream input = null;
		//input = new BufferedInputStream(new FileInputStream("a.txt"));
		try {
			input = new BufferedInputStream(new FileInputStream("a.txt"));
		} catch(Exception e) {
			while(input.available() > 0) {
				System.out.println((char)input.read());
			}
		}catch
	}

}
