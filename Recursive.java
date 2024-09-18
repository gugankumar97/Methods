package Methods;

import java.util.Scanner;

public class Recursive {

	public static void main(String[] args) {
		/*
		 * Recursive method - To find Factorial of a given number
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to find its factorial :");
		int number = sc.nextInt();

		//6! = 6*(6-1)*(5-1)*(4-1)*(3-1)*(2-1)
		int factorialOfNumber = findFactorialRecursive(number);

		System.out.print("The factorial of the number  is: " + factorialOfNumber);

	}



	private static int findFactorialRecursive(int number) {

		if (number != 0) 
			return number * findFactorialRecursive(number - 1); // 6*5*4*3*2*1*1
		else 
			return 1;
		
	}

}


