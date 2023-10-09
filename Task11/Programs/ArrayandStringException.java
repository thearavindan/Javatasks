package task11;

public class ArrayandStringException {
	public static void main(String[] args) {
		
		try {	
			int[] num = {1,2,3,4,5,6};
		     int index =7;
			int value = num[index];
			System.out.println(value);
			String text = "guvi greek";
			 int count = 20;
			 char character = text.charAt(count);
			 System.out.println("Character at string index " + count + ": " + character);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("the entered value is out of the index in array => " +e.getMessage());
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("the entered value is out of the index in string => " +e.getMessage());
		}
	}
}
