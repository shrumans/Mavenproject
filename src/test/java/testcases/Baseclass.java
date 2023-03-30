package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void Setup() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","chromedriver1.exe");
		driver = new ChromeDriver();
		driver.get("https://www.simplilearn.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	@AfterMethod
	public void Quitbrowser() throws InterruptedException{
		driver.quit();
	}
}
