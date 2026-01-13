package day5;

public class SwitchDemo {

	/*
	 * day1 -Monday
	 * day2- Tuesday
	 * day3 -wednesday
	 * day7 Sunday
	 * day17 - invlalid data 
	 */
	public static void main(String[] args) {
		
		int d =4;
switch (d)
{
	
case 1: 
	System.out.println("Monday");
	
	break;
case 2: 
	System.out.println("Tuesday");
	break;
case 3: 
	System.out.println("Wedneday");
	break;
case 4: 
	
	System.out.println("Thurday");
	break;
case 5: 
	System.out.println("Friday");
	break;
case 6: 
	System.out.println("Saturday");
	break;
case 7: 
	System.out.println("Sunday");
	break;
default: 
		System.out.println("Invalid");
	break;
	}

}
}
