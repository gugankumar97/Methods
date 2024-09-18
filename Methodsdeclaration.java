package Methods;

import java.util.Scanner;

public class Methodsdeclaration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Student Marks : ");

		System.out.println("Subject 1 :");
		int sub1Mark = sc.nextInt();

		System.out.println("Subject 2 :");
		int sub2Mark = sc.nextInt();

		System.out.println("Subject 3 :");
		int sub3Mark = sc.nextInt();
		
		System.out.println("Subject 4 :");
		int sub4Mark = sc.nextInt();

		System.out.println("Subject 5 :");
		int sub5Mark = sc.nextInt();

		int total = sum(sub1Mark, sub2Mark, sub3Mark, sub4Mark, sub5Mark);
		
		
		
		
		System.out.println("Total1 :"+total);
		
		
		double total2 = sum(45.5,67.3);
		
		System.out.println(" Total2 : " +total2);

		System.out.println("The total mark is : " + total);
		
		System.out.println("Percentage is : "+percentage(sub1Mark, sub2Mark, sub3Mark, sub4Mark, sub5Mark));
		

	}
	
	private static int sum(int submark1, int sub2Mark, int sub3Mark, int sub4Mark, int sub5Mark) {
		System.out.println("Invokes int datatype method");
		int result = submark1 + sub2Mark + sub3Mark + sub4Mark + sub5Mark;

		return result;
	}
	
	private static int percentage(int mark1, int sub2Mark, int sub3Mark, int sub4Mark, int sub5Mark) {
		System.out.println("Invokes int datatype method");
		int percentage = ((sum(mark1,sub2Mark,sub3Mark,sub4Mark,sub5Mark))/5)%100;

		return percentage;
	}
	
	private static double sum(double mark1,double mark2) {
		System.out.println("Invokes double datatype method");
		double result = mark1 + mark2;

		return result;

	}

}
