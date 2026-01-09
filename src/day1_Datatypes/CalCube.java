package day1_Datatypes;

/*Write code ro calculate cube of a numner and print it on the console */


public class CalCube {
	
	public static int cal(int c)
	{
		System.out.println("Calculating cube of a number..");
		return c*c*c;
	}


	public static void main(String[] args) {
		
		int a = 25;
		int CC = cal(a);
		System.out.println("Value of cube ="+ CC);
	}

}
