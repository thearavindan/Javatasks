package task8java;

import java.util.Scanner;

public class Qn09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        int currentYear = 2023;
        int age = currentYear - birthYear;

        if (age >= 65) {
            System.out.println("You are a senior citizen.");
        } else {
            System.out.println("You are not a senior citizen.");
        }
		
		
		
		

	}

}
