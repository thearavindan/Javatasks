package task10java;
class BlackTea1 extends Tea {
	   
    public void preparetea() {
        super.preparetea();
        System.out.println("Brewing black tea for 3 minutes.");
    }
}

class GreenTea1 extends Tea {
    
    public void preparetea() {
        super.preparetea();
        System.out.println("adding mint and ginder for green tea");
        
        System.out.println("Brewing green tea for 5 minutes.");
    }
}

class HerbalTea1 extends Tea {
 
    public void preparetea() {
        super.preparetea();
        System.out.println("add tulsi, mint leaves along with ginger, lemongrass and spices for herbal tea");
        System.out.println("Brewing herbal tea for 10 minutes.");
    }
}

public class ArrayofTea {
	public static void main(String[] args) {
		Tea[] teas = new Tea[4];
		teas[0] = new Tea();
		teas[1]= new BlackTea1();
		teas[2] = new GreenTea1();
		teas[3] = new HerbalTea1();
		for (Tea obj : teas) {
			obj.preparetea();
	}

	}
}
