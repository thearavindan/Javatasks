package task10java;

public class Circle {
	
	private float radius;
	
 Circle(){
	radius = 5;
}
 
Circle(float radius1){
	this.radius = radius1;
}
public float  circumferance() {
	float cir = (float) (2*Math.PI*radius);
	return cir ;
	
}

public static void main(String[] args) {
	Circle obj  = new  Circle();
	System.out.println("Radius of the circle : " +obj.radius);
	System.out.println("Circumferance : " +obj.circumferance());
	Circle obj1  = new  Circle(6);
	System.out.println("Radius of the circle : " +obj1.radius);
	System.out.println("Circumferance : " +obj1.circumferance());
}
}