package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {

	public static WebDriver driver;
	
	protected TestBase() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DjanGo\\\\TestingFrameworks\\\\PageFactory\\src\\test\\resources\\driver\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
	}
	
//	public static void initialization(){
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-notifications");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DjanGo\\\\TestingFrameworks\\\\PageFactory\\src\\test\\resources\\driver\\chromedriver.exe");
//		driver = new ChromeDriver(options);
//		driver.manage().window().maximize();
//		driver.get("https://google.co.in");
//	}
	
	@BeforeTest
	public static void openBrowser() {
		driver.get("https://google.co.in");
	}
	
	@AfterTest
	public static void closeBrowser() {
		driver.quit();
	}
}
