package OopsConceptPart2;

public class BMW extends Car{//is a relationship
	
	//method overriding: when same method is present in the parent class as well as in the child class with same name/number of arguments
	public void start() {//overridden method
		System.out.println("BMW---Start");
	}
	
	public void theftsafety() {
		System.out.println("BMW---theftsafety");
		
	}

}
