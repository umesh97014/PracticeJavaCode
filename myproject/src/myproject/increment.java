package myproject;

public class increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		x = 25;
		x = x+1;
		System.out.println(x);
		
		x = 25;
		x++;
		System.out.println(x);
		
		x = 25;	
		// ++x is pre increment
		System.out.println(++x);
		
		x = 25;	
		// x++ is post increment
		System.out.println(x++);
		System.out.println(x);
		
		x = 25;	
		// x++ is post decrement
		System.out.println(x--);
		System.out.println(x);
		
		x = 25;
		x = x+5;
		System.out.println(x);
		
		x = 25;
		x += 5; //x = x+5
		System.out.println(x);
		
		x = 25;
		x -= 5; //x = x-5
		System.out.println(x);
		
		x = 25;
		x *= 5; //x = x*5
		System.out.println(x);
		
		x = 25;
		x /= 5; //x = x/5
		System.out.println(x);
		
		x = 25;
		x %= 5; //x = x%5
		System.out.println(x);

	}

}
