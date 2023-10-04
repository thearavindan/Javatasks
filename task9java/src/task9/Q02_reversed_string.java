package task9;

public class Q02_reversed_string {

	public static void main(String[] args) {
		String a="Welcome to Guvi", b="";
		char ch;
		System.out.println("original word is : " +a);
		for(int i=0;i<a.length();i++) {
			ch=a.charAt(i);
			b=ch+b;
			
		}
			
		System.out.println("Reversed word is : " +b);

	}

}
