package WebDriver_Wait_Selenium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

@Test
public class Fluent_Wait {
	
	@Test
	public void Login() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Piyush\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	WebDriver d1;
    	d1=new ChromeDriver();
    	
    	d1.get("http://leafground.com/pages/frame.html");
    	d1.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
    	
//    	Wait var1=new FluentWait(d1)
//    			.withTimeout(20, TimeUnit.SECONDS)
//    			.pollingEvery(5, TimeUnit.SECONDS)
//    			.ignoring(NoSuchElementException.class);
//    	
//    	var1.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@src='default.html']")));
//    	
//        d1.switchTo().frame(0);
    	
	}
}
