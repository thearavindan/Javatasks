package task9;

import java.util.Scanner;

public class Qn05_gradingsystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the mark: ");
        int mark = scanner.nextInt();
        System.out.println("your Grade is : ");
        if(mark==100) {
        	System.out.println("S");
        }
        else if(mark>=90 && mark<=99 ) {
        	System.out.println("A");
        } else if(mark>=80 && mark<=89) {
        	System.out.println("B");
        } else if(mark>=70 && mark<=79) {
        	System.out.println("C");
        }else if(mark>=60 && mark<=69) {
            	System.out.println("D");
        }else if(mark>=50 && mark<=59) {
        	System.out.println("E");
        } else if(mark>=0 && mark<50) {
        	System.out.println("F");
	}else{
	System.out.println("invalid mark"); 
	}
	}
	}
	
	

