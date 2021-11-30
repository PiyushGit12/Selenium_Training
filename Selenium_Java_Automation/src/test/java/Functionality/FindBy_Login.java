package Functionality;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ObjectRepository.Find_By;

public class FindBy_Login {
	
	@Test
	public void Login_1() throws IOException {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Piyush\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	WebDriver d1;
    	d1=new ChromeDriver();
    	
    	d1.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
    	
    	
    	PageFactory.initElements(d1,Find_By.class);
    	Find_By.email_id.sendKeys("TakenScreen-Shot");
    	Find_By.Continue_button.click();
    	
    	
    	///////////////////   TakescreenShot         //////////////////////////
    	
    	TakesScreenshot screen=(TakesScreenshot) d1;     
    	
    	File source=screen.getScreenshotAs(OutputType.FILE);
    	File destination=new File("C:\\Users\\Piyush\\eclipse-workspace\\Selenium_Java_Automation\\ScreenShot\\sc01.jpg");
    	
    	FileHandler.copy(source, destination);
	}
}
