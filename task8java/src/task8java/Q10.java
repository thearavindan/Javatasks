package task8java;

public class Q10 {
	public static void main(String[] args) {
		
	      int count = 0;
	      int num = 1234567;
	      System.out.println("the count of the given number " +num+ " is :");
	      while(num!=0){
	         num = num/10;
	         count++;
	      }
	      System.out.println(+count);
	   }
	}
