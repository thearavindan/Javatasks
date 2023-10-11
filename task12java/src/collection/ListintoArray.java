package collection;

import java.util.ArrayList;

public class ListintoArray {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		Integer[] num1 = num.toArray(new Integer[num.size()]);
		
		
		System.out.println("Array elements:");
        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);
        }
		

	}

}
