package task11;

import java.util.Scanner;

public class HandetheException {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
		System.out.println("Enter the First number");
		int a = input.nextInt();
		System.out.println("Enter the second number");
		int b = input.nextInt();
		if( b==0) {
			throw new ArithmeticException("Division by zero is not allowed.");
		}
		 int c = a / b;
         System.out.println("Result of division: " + c);
     } catch (ArithmeticException e) {
         System.out.println("Error: " + e.getMessage());
     } finally {
         input.close();
     }
 }	
}