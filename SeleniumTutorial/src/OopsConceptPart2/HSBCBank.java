package OopsConceptPart2;

public class HSBCBank implements USBank, BrazilBank{//we are achiving multiple inheritance
	//is a relationship	
	
	//If a class is implementing any interface, then its mandatory to define/override all the methods of interface
	//overriding from US Bank
	public void credit() {
		System.out.println("HSBC---credit");
	}
	
	public void debit() {
		System.out.println("HSBC---debit");
	}
	
	//seperate methods of HSBC Bank
	public void transferMoney() {
		System.out.println("HSBC---transferMoney");
	}
	
	public void educationLoan() {
		System.out.println("HSBC---educationLoan");
	}
	
	public void carLoan() {
		System.out.println("HSBC---carLoan");
	}
	
	//Brazil Bank method: overriding from Brazil Bank
	public void mutualFund() {
		System.out.println("HSBC---mutualFund");
	}

}
