package greatestcommondivisorlab;
import java.util.Scanner;


public class GCDRunner
{
	//main method
	public static void main(String[] args)
	{
		//instantiate Scanner object
		Scanner keyboard = new Scanner(System.in);
		
		//prompt user for numerator
		System.out.print("Numerator: ");
		
		//assign user input to variable
		int numerator = keyboard.nextInt();
		
		//prompt user for denominator
		System.out.print("Denominator: ");
		
		//assign user input to variable
		int denominator = keyboard.nextInt();
		
		//instantiate GCD object
		GCD gcd1 = new GCD(numerator, denominator);
		
		//call toString() method
		System.out.println(gcd1);
		//print fraction in lowest term
		System.out.println("The fraction in lowest terms is "+gcd1.numeratorSimplified()+"/"+gcd1.denominatorSimplified());
	}
}