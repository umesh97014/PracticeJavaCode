package myproject;

import java.util.Scanner;

public class switchStatement15 {

	public static void main(String[] args) {
		// Switch statement
		
		//int score = 90; or can be input value via scanner
		Scanner scan = new Scanner(System.in);
		
		int score;
		System.out.println("Enter the score ");
		score = scan.nextInt();
		
		switch (score) {
		case 100:
		case 90:
		case 80:
			System.out.println("very good");
			break;
		
		case 60:
			System.out.println("good");
			break;
			
		case 30:
			System.out.println("ok");
			break;
			default:
				System.out.println("No case has been defined for this value");
		}

	}

}
