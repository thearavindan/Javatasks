package task8java;

public class Qn05_primeornot {
	public static void main(String[] args) {
	
	int i, n = 13;
    boolean isprime = true;

    if (n < 2)
      {
         isprime = false;
      }
    else
      {
         for (i = 2; i < n; i++)
          {
           if (n % i == 0)
            {
             isprime = false;
                 break;
               }
       }
      }

    String result = isprime ? "Prime" : "not Prime";
    System.out.println ("The number " + n + " is : " + result);

}
}
