package myproject;

public class summingArrays21 {

	public static void main(String[] args) {
		// Maths operations - Summing array
		int num[] = {2, 9, 5};
		int sum = 0;
		
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println("Sum = " + sum);

	}

}
