package task9;

public class Qn01 {
	public static void main(String[] args) {
		String a ="malayalam", b = "";
		int aLength =a.length();
		for (int i=(aLength-1);i>=0;--i) {
			b = b+a.charAt(i);
		}
		if(a.toLowerCase().equals(b.toLowerCase())) {
			System.out.println(a+ " is a palindrome");
		}
		else {
			System.out.println(a+ " is not a palindrome");
			
		}
	}
}
