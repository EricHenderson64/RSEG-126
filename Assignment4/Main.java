import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter maximum integer: ");
        int max = sc.nextInt();
        boolean prime[] = sieveOfEratosthenes(max);
       //Print all prime numbers   
    	System.out.println("All prime numbers less than or equal to " + max + ":");
	      for(int i = 2; i <= max; i++)
	      {
	          if(prime[i] == true)
	              System.out.print(i + " ");
	      }
	      for(int i = 0; i <= max; i++)
	      {
	         
	              System.out.println(prime[i]);
	      }
	}
	
	static boolean[] sieveOfEratosthenes(int max)
    {
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        boolean prime[] = new boolean[max+1];
        for(int i=0;i<=max;i++)
            prime[i] = true;
         
        for(int p = 2; p*p <=max; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == true)
            {
                // Update all multiples of p
                for(int i = p*p; i <= max; i += p)
                    prime[i] = false;
            }
        }
        return prime;
    }

}
