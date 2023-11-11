package greatestcommondivisorlab;

public class GCD
{
	//instance variables - DO NOT ADD ANY MORE INSTANCE VARIABLES
	private int numerator;
	private int denominator;
	
	//default constructor
	public GCD() {
		numerator = 39;
		denominator = 91;
	}
	
	//initialization constructor
	public GCD(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	//modifier method for numerator
	public void setNumerator(int num) {
		numerator = num;
	}
	
	//modifier method for denominator
	public void setDenominator(int num) {
		denominator = num;
	}
	
	//accessor method for numerator
	public int getNumerator() {
		return numerator;
	}
	
	//accessor method for denominator
	public int getDenominator() {
		return denominator;
	}
	
	//method to determine gcd called calcGCD
	public int calcGCD() {
		int n1 = numerator;
		int n2 = denominator;
		while(n1 != n2) {
			if(n1 > n2) {
				n1 = n1 - n2;
			}
			else {
				n2 = n2 - n1;
			}
		}
		return n2;
	}
	
	//method to determine lowest term of numerator called numeratorSimplified
	public int numeratorSimplified() {
		return numerator/calcGCD();
	}
	
	//method to determine lowest term of denominator called denominatorSimplified
	public int denominatorSimplified() {
		return denominator/calcGCD();
	}
	
	// toString() method that only returns the GCD
	public String toString() {
		return "The GCD is: " + calcGCD();
	}
}
