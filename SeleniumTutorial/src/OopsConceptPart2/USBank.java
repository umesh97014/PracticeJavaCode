package OopsConceptPart2;

public interface USBank {
	
	int min_bal = 100;
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	//only method declaration
	//no method body -- only method prototype
	//in interface, we can declare the variables, variables are by default static in nature
	//variables value will not be changed -- its final/constant in nature
	//no static method in interface
	//no main method in interface
	//we cannot create the object in interface
	//Interface is abstract in nature

}
