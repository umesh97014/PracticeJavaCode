package myproject;

import java.util.Scanner;

public class PrintName {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = scan.nextLine();
	    System.out.println("Hi");
	    System.out.println(name);
	    
	    Scanner scan1 = new Scanner(System.in);
	    
	    System.out.println("What is your age?");
	    int age = scan1.nextInt();
	    
	    System.out.println("Your age is ");
	    System.out.println(age);

	}

}
