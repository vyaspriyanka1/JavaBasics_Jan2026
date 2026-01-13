package Assignments;

public class Check_Prime {

	public static boolean isPrime(int n)
	{
		// prime - divisible by itself or 1 
		 //i =2 to i=n-1
		
		for (int i=2; i<n;i++)
		{ 
			
			if(n%i==0)
			{
				return false;
				
			}
		}
		return true;
	
	}
	

	public static void main(String[] args)
	
	{
		
	
		int n =31;
		if (isPrime(n)== true)
				System.out.println("number is Prime");
		else System.out.println("number is not prime");
				;  

	}

}
