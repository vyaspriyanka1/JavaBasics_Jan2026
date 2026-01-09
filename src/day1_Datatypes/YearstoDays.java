package day1_Datatypes;

public class YearstoDays {

	public static void yToD()
	{
		int d,y=6;
		System.out.println("No of years to convert = " +y);
		d =y*365;
		System.out.println("Days = " +d);
		
	}
	
	public static void yToDLeap()
	{
		int d,y =6;
		System.out.println("No of years to convert = " +y);
		int leapyear = y/4;
		d = y *365 + leapyear;
		System.out.println("Days including Leap year = " +d);
		
	}
	
	
	
	public static void main(String[] args) {
		
		yToD();
		yToDLeap();
	}

}
