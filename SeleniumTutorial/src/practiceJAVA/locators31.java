package practiceJAVA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\umekumar2\\eclipse-workspace\\automationpractice\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=au");//hit url on the browser
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("User");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
	}

}
