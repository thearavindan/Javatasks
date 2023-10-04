
package task9;

import java.util.Scanner;

public class Q7_LargestNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = scanner.nextInt();
		System.out.println("Enter the second number : ");
		int b = scanner.nextInt();
		System.out.println("Enter the third number : ");
		int c = scanner.nextInt();
        if( a > b && a> c) 
            System.out.println(a + " is the largest number.");

        else if (b >a && b > c) 
            System.out.println(b + " is the largest number.");
      
        else 
        	System.out.println(c + " is the largest number.");
}
}