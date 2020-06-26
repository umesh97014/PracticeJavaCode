package OopsConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(30, 40);
		
		//we can overload the main method also

	}
	//you cannot create a method inside a method
	//duplicate method-->i.e.same method name with same number of arguments are not allowed
	//method overloading-->when the method name is same with different argument or input parameters within the same class
	public void sum() {//0 input param
		System.out.println("Sum method--zero param");
	}
	
	public void sum(int i) {//1 input param
		System.out.println("Sum method--one input param");
		System.out.println(i);
	}
	
	public void sum(int x, int y) {//2 input param
		System.out.println("Sum method--two input param");
		System.out.println(x+y);
	}

}
