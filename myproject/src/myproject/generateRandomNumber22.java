package myproject;

import java.util.Random;

public class generateRandomNumber22 {

	public static void main(String[] args) {
		// How to generate random number
		Random dise = new Random();
		int number;
		
		for (int counter = 1; counter <= 8; counter++) {
			number = dise.nextInt(6);
			System.out.println(number);
		}
		System.out.println("============================================");
		
		//To omit the zero value from the random number generation
		for (int counter = 1; counter <= 5; counter++) {
			int number1 = 1+dise.nextInt(6);
			System.out.println(number1);
		}

	}

}
