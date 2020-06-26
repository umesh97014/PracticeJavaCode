import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// In order to create any test case(class) - need to create driver object for chrome browser
		//https://www.selenium.dev/selenium/docs/api/java/index.html
		
		//selenium code-
		//we will strictly implement methods for chrome browser
		/*Class name = ChromeDriver
		x driver = new.x();*/
		//invoke .exe file first
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\umekumar2\\eclipse-workspace\\automationpractice\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");//hit url on the browser
        System.out.println(driver.getTitle()); //validate if your page title is correct
        System.out.println(driver.getCurrentUrl());//validate if you are landed on correct url
//        System.out.println(driver.getPageSource());
        driver.get("http://yahoo.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.close();//closes the current browser opened by the selenium
        driver.quit();//closes all the browsers opened by selenium
	}

}
