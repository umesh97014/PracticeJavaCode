package automationpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
/*import org.testng.annotations.BeforeSuite;*/
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tutorial {
//@BeforeMethod
//@AfterMethod
//@BeforeTest
//@AfterTest
//@BeforeSuite
//@AfterSuite
//@Test
//@BeforeClass
//@AfterClass

	
//	XMLParser xml = Xml// Object Create - Path XML File
	
	@Test(dataProvider = "dataProviderName")
	public void testName(String name, String Oid) {
			System.out.println(name);
				System.out.println(Oid);
	}
	/*
	 * @BeforeSuite public void beforesuite() { System.out.println("Before Suite") }
	 */ 

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite method");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test method");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class method");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	
	
	@DataProvider
	public Object[][] dataProviderName() {
		xml //  size of Employee find out
	
		//size is equal to s
		
		Object [] [] obj = new Object[s][];
		
		for(int i = 0 ; i<s ; i++)
			{obj[i][0] = Employee.name;// i = 1 , Umesh
			obj[i][1] = Employee.Oid// i= 1, 3456
			}
		return obj;
		
	}

}

<Employee>
<name>Piyush</name>
<oid>12345</oid>
</Employee>


<Employee>
<name>Umesh</name>
<oid>12345</oid>
</Employee>