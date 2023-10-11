package collection;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListosStrings {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("apple");
		fruits.add("grapes");
		fruits.add("orange");
		fruits.add("mango");
		System.out.println("the name of the fruits are : " +fruits);
		System.out.println("now using iterator");
		Iterator<String> it = fruits.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		fruits.clear();
		System.out.println("after clearing the arrylist : " +fruits);
	}

}
