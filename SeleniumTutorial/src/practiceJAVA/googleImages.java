package practiceJAVA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleImages {

	public static void main(String[] args) {
		// to use traverse xpath with google images
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\umekumar2\\eclipse-workspace\\automationpractice\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.findElement(By.xpath("//div[@id='gb']/div/div/div/div[1]/div[2]/Images")).click();

	}

}
