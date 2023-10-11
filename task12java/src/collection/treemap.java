package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class treemap {
	public static void main(String[] args) {
		TreeMap<Integer, String> emp = new TreeMap<Integer, String>();
		emp.put(107, "dinesh");
		emp.put(106, "Aravind");
		emp.put(105, "cathrine");
		emp.put(104, "vijay");
		emp.put(103, "ram");
		emp.put(102, "leo");
		emp.put(101, "zara");
		 List<String> values = new ArrayList<>(emp.values());
		 Collections.sort(values);
		 System.out.println("employee names in Alphabetical Order:");
	        for (String value : values) {
	            System.out.println(value);

		
		
		}
	}
}
