package task10java;

class BlackTea extends Tea {
   
    public void preparetea() {
        super.preparetea();
        System.out.println("Brewing black tea for 3 minutes.");
    }
}

class GreenTea extends Tea {
    
    public void preparetea() {
        super.preparetea();
        System.out.println("adding mint and ginder for green tea");
        
        System.out.println("Brewing green tea for 5 minutes.");
    }
}

class HerbalTea extends Tea {
 
    public void preparetea() {
        super.preparetea();
        System.out.println("add tulsi, mint leaves along with ginger, lemongrass and spices for herbal tea");
        System.out.println("Brewing herbal tea for 10 minutes.");
    }
}
	
class MainTea {	
	
	public static void main(String[] args) {
		BlackTea blacktea = new BlackTea();
		GreenTea greentea = new GreenTea();
		HerbalTea herbalTea = new HerbalTea();
		 
		blacktea.preparetea();
		greentea.preparetea();
		herbalTea.preparetea();

	}

}
 