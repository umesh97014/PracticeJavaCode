package OopsConceptPart1;

public class LocalVsGlobalVariables {
    //global variables-->class variables
	String name = "Tom";
	int age = 25;
	public static void main(String[] args) {
		
		int i = 10;//local variable for main method
		System.out.println(i);
		
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);
		
		System.out.println(obj.age);

	}
	
	public void sum() {
		int i = 10;//local varibale for sum method
		int j = 20;
		int age = 25;
	}

}
