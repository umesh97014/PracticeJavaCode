package myproject;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		double firstNumber, secondNumber, answer;
		System.out.println("Enter the first number?");
		firstNumber = scan.nextDouble();
		System.out.println(firstNumber);
		System.out.println("Enter the second number?");
		secondNumber = scan.nextDouble();
		System.out.println(secondNumber);
		answer = firstNumber + secondNumber;
		System.out.println("Sum of the first and second number is ");
		System.out.print(answer);		

	}

}
