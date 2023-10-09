package task11;


import java.io.FileOutputStream;
import java.io.IOException;

public class Filesample {
	
	public static void main(String[] args) {
		try {
			FileOutputStream file =new FileOutputStream("abc.txt");
			throw new IOException("error");
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}	
		System.out.println("exception handled");
	}
}
