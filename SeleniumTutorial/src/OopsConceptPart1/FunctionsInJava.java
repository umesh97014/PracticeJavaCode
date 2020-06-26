package OopsConceptPart1;

public class FunctionsInJava {
    
	//main method-->starting point of execution
	public static void main(String[] args) {
		FunctionsInJava obj = new FunctionsInJava();
		//one object will be created, obj is the reference variable, referring to this object
		//after creating the object, the copy of all the non static methods will be given to this object
        obj.test();
        
        int l = obj.pqr();
        System.out.println(l);
        
        String s1 = obj.qa();
        System.out.println(s1);
        
        int d1 = obj.division(20,4);
        System.out.println(d1);
        
        //main method is void-->never returns a value
	}
	//non static methods
	
	//void -- doesnot return any value
	//return type of test = void
	public void test() {//no input, no output
		System.out.println("test method");
	}
    
	//return type = int
	public int pqr() {//no input, some output
		System.out.println("pqr method");
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;
	}
	//return type--> String
	public String qa() {//no input, some output
		System.out.println("qa method");
		String s = "Selenium";
		return s;
		
	}
	//return type--> int
	//x,y input parameter/arguments
	public int division(int x, int y) {
		System.out.println("division method");
		int d = x/y;
		return d;
	}
}