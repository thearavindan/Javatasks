package task8java;

public class Qn04_swap {
	public static void main(String[] args) {
	int a = 10;
	int b = 20;

	System.out.println("Original values of a is " + a + " and b is " + b);

	int temp = a;
	a = b;
	b = temp;

	
	System.out.println("Swapped values of a is " + a + " and b is " + b);

}
}
