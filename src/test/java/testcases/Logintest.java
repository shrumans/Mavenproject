package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.Loginpage;

public class Logintest extends Baseclass {

	@Test
	public void Loginfailure() throws InterruptedException{
		
		Loginpage login= new Loginpage();
		login.LoginFunction("shruthimanjesh@outlook.com", "Shruthi123");
		
		WebElement Errormsg = driver.findElement(By.id("msg_box"));
		String Actmsg=Errormsg.getText();
		System.out.println("Actual Message is :"+Actmsg);
		String Expmsg="The email or password you have entered is invalid.";
		Assert.assertEquals(Actmsg, Expmsg);
	}
	
	
	@Test
	public void LoginSuccess() throws InterruptedException{
		
		Loginpage login1=new Loginpage();
		login1.LoginFunction("shruthi@gmail.com","Manjesh123");
	}
	
	
	@Test
	@Parameters({"Userval","Passval"})
	public void parameterTest(String Usernameval, String Passwordval) throws InterruptedException{
		
	Loginpage login2=new Loginpage();
	login2.LoginFunction(Usernameval, Passwordval);
	}
}
