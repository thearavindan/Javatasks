package task10java;

public class Employee {
	private int id;
	private String firstname;
	private String lastname;
	private int salary;
	public Employee(int id, String firstname, String lastname, int salary) {
		this.id = id ;
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
		}
	public int  getID() {
		return  id;
	}
	public String  getFirstname() {
		return  firstname;
	}
    public String getLastnme() {
	return lastname;
}
    public String getName() {
    	return firstname+ " " +lastname;
    }
     public int Getsalary() {
    	 return salary;
     }

  void setsalary(int salary) {
	  this.salary = salary;
  }
public int getAnnualsalary() {
	 return  salary*12;
 }

void raisesalary(int percentage) {
	double hike = (100 + percentage)/100;
	 salary = (int) (salary*hike);
	
}
public String toString() {
	return "Employee [ID=" + id + ", Name=" + getName() + ", Salary=" + salary + "]";
	
}




	public static void main(String[] args) {
		
Employee emp1 = new Employee(001, "John", "David", 50000);
System.out.println(emp1);
       System.out.println(emp1.getAnnualsalary());
       emp1.raisesalary(10);
       System.out.println( emp1.getAnnualsalary());
	}

}
