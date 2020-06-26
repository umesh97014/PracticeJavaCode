package myproject;

import java.util.Scanner;

public class logicalOperator14 {

	public static void main(String[] args) {
		/* Logical Operator
		 && AND operator
		 || OR operator
		 */
		//Comparing if the students is passed in the subjects
		Scanner scan = new Scanner(System.in);
		
		double maths, science;
		System.out.println("Enter the marks obtained in subject maths ");
		maths = scan.nextDouble();
		System.out.println("Enter the marks obtained in subject science");
		science = scan.nextDouble();
		if (maths >= 35) {
			System.out.println("The student is passed in maths subject");
		}else {
			System.out.println("The student is failed in the maths subject");
		}
		
		if (science >= 35) {
			System.out.println("The student is passed in science subject");
		}else {
			System.out.println("The student is failed in the science subject");
		}
		
		System.out.println("The student scored in maths subject is " + maths);
		System.out.println("The student scored in science subject is " + science);
		
		if ((maths >= 35) && (science >= 35)) {
			System.out.println("The student is passed");
		}else {
			System.out.println("The student is failed");
		}
		
		if ((maths >= 35) || (science >= 35)) {
			System.out.println("The student is passed");
		}else {
			System.out.println("The student is failed");
		}

	}

}
