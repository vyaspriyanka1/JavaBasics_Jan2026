package day6_loops;

public class LoopsConcept {

	public static void main(String[] args) {

/*Printing Hello multiple times
 * 
 * or anything repeating multiple times, we will use 
for
for (initialization;condition;increment/decrement){}

While
While(condition){
}
dp while {}


 */
		int i;
		for (i=0;i<=5;i++)
		{ 
			System.out.println("Hello");
		}
		System.out.println("Print values form 10 to 5");//10 8 6 4 2 
		for (i =10;i>=2;i=i-2 )
		{
			System.out.println(i); // new line output
			System.out.print(i+" "); // same line with space
			
		}
		//while()

	}

}
