public class Tabulation
{
	public static void main(String[] args)
	{
		fact(7); // call factorial method
		fibo(8); // call fibonacci method
	}
	
	// Using tabulation to find the factorial 
	// of a given number.
	// run time is O(n) 
	public static void fact(int n)
	{
		int [] factArr = new int[n+1]; // array to store the results
		factArr[0] = 1; // base case;
		
		for(int i = 1; i <= n; ++i)
		{
			factArr[i] = factArr[i -1] * i;
		}
		
		// optional to display the result
		for(int x = 0; x < factArr.length; ++x)
			System.out.println("Factorial of " + x + " is " + factArr[x]);
		
	}
	
	// Using tabulation to find the fibonacci sequence 
        // of a given number.
        // run time is O(n) 
	public static void fibo(int n)
	{
		int [] fiboArr = new int [n +1]; // array to store the results
		
		fiboArr[0] = 0;   // base case
		fiboArr[1] = 1;   // base case
		
		for(int i = 2; i <= n; ++i)
		{
			fiboArr[i] = fiboArr[i -1] + fiboArr[i -2];
		}
		
		// optional to display the results
		for(int x = 0; x < fiboArr.length; ++x)
			System.out.println("Fibonacci of " + x + " is " + fiboArr[x]);
		
	}
	
	
	
}
