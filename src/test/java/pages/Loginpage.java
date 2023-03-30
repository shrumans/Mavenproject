package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testcases.Baseclass;

public class Loginpage {
	WebDriver driver=Baseclass.driver;
	
    public void LoginFunction(String Usernameval,String Passwordval) throws InterruptedException{
    	
    	
    	driver.findElement(By.className("login")).click();
    	driver.findElement(By.name("user_login")).sendKeys(Usernameval);
    	driver.findElement(By.id("password")).sendKeys(Passwordval);
    	driver.findElement(By.className("rememberMe")).click();
    	driver.findElement(By.name("btn_login")).click();
    }
	
    
}
