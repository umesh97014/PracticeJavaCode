package practiceJAVA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookXpathLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\umekumar2\\eclipse-workspace\\automationpractice\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        // Xpath syntax - //tagname[@attribute='value']
        /*driver.findElement(By.xpath("//*[@type='email']")).sendKeys("email id");//Xpath is used
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");//Xpath is used
        driver.findElement(By.xpath("//*[@value='Log In']")).click();//Xpath is used
        */
        //By using CSS now - Syntax: tagname[attribute = 'value'] or [attribute = 'value'] or tagname#id(can be used only if html has id with it) or tagname.classname
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("email id");
        driver.findElement(By.cssSelector("[id='pass']")).sendKeys("password");
        driver.findElement(By.cssSelector("[value='Log In']")).click();
        

	}

}
