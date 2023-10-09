package task10java;

public class Tea {
	private boolean isprepared;
	private boolean hasmilk;
	private boolean hassugar;
	Tea(){
		isprepared = false;
		hasmilk = false;
		hassugar = false;
	}
	
public void preparetea() {
	if(!isprepared) {
		System.out.println("pour hot water and tea leaves in a vessel to prepare tea");
		isprepared = true;
	}else
		System.out.println("preparing a basic Tea with hot water and tea leaves");
	}
public void addmilk() {
	if(!isprepared) {
		if(!hasmilk) {
		System.out.println("adding milk to the basic tea");
		hasmilk = true;
	}else {
			System.out.println("milk alreay added to the basic tea");
	}
		}else {
			System.out.println("add milk to the the basic tea");
		}
	}
public void addsugar() {
	if(!isprepared) {
		if(!hasmilk) {
			System.out.println("adding sugar to the tea");
			hassugar = true;
		}else {
			System.out.println("sugar already added to the tea");
		}
	}else {
		System.out.println("add sugar to the tea");
	}
}



	public static void main(String[] args) {
		Tea obj = new Tea();
		obj.preparetea();
		obj.addmilk();
		obj.addsugar();
		

	}

}
