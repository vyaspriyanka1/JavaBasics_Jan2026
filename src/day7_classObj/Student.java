package day7_classObj;
/* Properties - variables
 * Behavior - Methods
 * Methods attend session submitProject
 * 
 * 
 */
public class Student {

	String name;
	int id;
	String pancard;
	char grade;
	char section;

	public void attendSession()
	{
		System.out.println("Student attends a session");
	}
	
	public void SubmitsProj()
	{
		System.out.println("Student submits a session");
	}
	

	
	public static void main(String[] args) 
	{
		
		Student S1 = new Student(); // creating Object
		S1.id = 011 ;
		S1.name = "Priyanka";
		S1.grade = 'A';
		S1.pancard = "AKDNN9982";
		System.out.println(S1.name);
		S1.attendSession();
		S1.SubmitsProj();
		
		
		Student S2 = new Student(); //sec Object
		S2.id = 012 ;
		S2.name = "Shree";
		S2.grade = 'A';
		S2.pancard = "AKDNN9932";
		System.out.println(S2.name);
		
		S2.attendSession();
		S2.SubmitsProj();
	}

}
