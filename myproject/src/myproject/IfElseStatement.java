package myproject;

public class IfElseStatement {

	public static void main(String[] args) {
		/* Types of Conditions
		 == equals to
		 != not equals to
		 >  greater than
		 >= greater than equals to
		 <  less than
		 <= less than equals to		
		*/
		
		int x = 10;
		// '==' equals to
		if (x==10) {
			System.out.println("The value of x is 10");
		}
		
		int y = 20;
		// '==' equals to
		if (y==15) {
			System.out.println("The value of y is 15");
		}else {
			System.out.println("The value of y is not equals to 15");
			System.out.println("The value of y is " + y);
		}
		
		int z = 16;
		// '!=' not equals to 
		if (z!=11) {
			System.out.println("The value of z is not equals to 11");
		}else {
			System.out.println("The value of Z is not equals to 11");
		}

	}

}
