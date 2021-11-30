package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Locators {
	
	@Test
	public void Login() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Piyush\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	WebDriver d1;
    	d1=new ChromeDriver();
    	d1.get("https://demoqa.com/automation-practice-form");
    	
        d1.findElement(By.className("practice-form-wrapper"));
    	
    	
    	d1.findElement(By.id("firstName")).sendKeys("Testing");
    	
    	d1.findElement(By.cssSelector("input[id='lastName']")).sendKeys("Automate");
    	
    	d1.findElement(By.id("userNumber")).sendKeys("9807172827");
    	
    
    	d1.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Testing123@gmail.com");
    	
    	d1.findElement(By.name("gender"));
    	
    	
    	d1.get("http://leafground.com/pages/Link.html");
    	d1.findElement(By.linkText("Go to Home Page")).click();
    	System.out.println(d1.getCurrentUrl());
    	
   
    	

	}
}
