package task10java;

public class Person {
	String name;
	int age;
	Person() {
 name = "Aravind";
 age = 26;
		}
	public String getname(){
		return name;
	}
	public int getage(){
		return age;
	}
	public static void main(String[] args) {
		Person obj = new Person();
		System.out.println("The name is : " +obj.getname());
		System.out.println("Age is : " +obj.getage());

	}

}
