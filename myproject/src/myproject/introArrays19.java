package myproject;

public class introArrays19 {

	public static void main(String[] args) {
		// Introduction to Arrays
		
		int num[] = new int[4];
		// here in array 0, 1, 2, 3 are index values - always starts from 0
		num[0] = 45;
		num[1] = 499;
		num[2] = 376;
		num[3] = 5555;
		
		System.out.println(num[3]);
		
		// the other way - in the parenthesis indexing starts with zero only
		int num1[] = {2, 450, 1, 320};
		System.out.println(num1[3]);
	}

}
