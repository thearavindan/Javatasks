package task9;

import java.util.Scanner;

public class Qn_06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter no. of month : " );
		int month = scanner.nextInt();
		float tariff = 1500;
		System.out.println("rent for one day is : " +tariff );
		System.out.println("The room rent is 20% high during seasons [April-June, November-December]: " +(tariff*1.2) );
		
		System.out.println("enter no. of days : "  );
		int days = scanner.nextInt();
		float billone = tariff*days;
		
		switch(month) {
		case 1 : System.out.println("amount to be paid : " +billone); break;
		case 2 : System.out.println("amount to be paid : " +billone); break;
		case 3 : System.out.println("amount to be paid : " +billone); break;
		case 4 : System.out.println("amount to be paid : " +(billone*1.2)); break;
		case 5 : System.out.println("amount to be paid : " +(billone*1.2)); break;
		case 6 : System.out.println("amount to be paid : " +(billone*1.2)); break;
		case 7 : System.out.println("amount to be paid : " +billone); break;
		case 8 : System.out.println("amount to be paid : " +billone); break;
		case 9 : System.out.println("amount to be paid : " +billone); break;
		case 10 : System.out.println("amount to be paid : " +billone); break;
		case 11 : System.out.println("amount to be paid : " +(billone*1.2)); break;
		case 12 : System.out.println("amount to be paid : " +(billone*1.2)); break;
		default : System.out.println("invalid input");
		}
		
scanner.close();
	}

}
