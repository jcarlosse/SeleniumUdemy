package day2;

public class Operators {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		// Arithmetic operators --> + - * / %

		System.out.println("Sum of a and b is: " + (a + b));
		System.out.println("Diff of a and b is: " + (b - a));
		System.out.println("Mul of a and b is: " + (a * b));
		System.out.println("Div of a and b is: " + (b / a));
		System.out.println("Mod div of a and b is: " + (a % b));
		
		//Relational operators (Comparison operators) ---> == < > <= >= !=
		// always return boolean value
		
		System.out.println(a==b); //false
		System.out.println(a>b); //false
		System.out.println(a<b); //true
		System.out.println(a>=b); //false
		System.out.println(a<=b); //true
		System.out.println(a!=b); //true
		
		//Logical Operators && || !
		//works with two booleans
		
		boolean x = true;
		boolean y = false;
		
		System.out.println(x&&y); //false
		System.out.println(x||y); //false
		System.out.println(!x); //false
	}

}
