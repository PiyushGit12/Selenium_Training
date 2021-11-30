package Selenium_Advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handle_UNOrdered_List {
	
	@Test
	public void Login() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Piyush\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	WebDriver d1;
    	d1=new ChromeDriver();
    	d1.manage().window().maximize();
    	
    	d1.get("http://leafground.com/pages/autoComplete.html");
    	d1.findElement(By.id("tags")).sendKeys("SO");
    	
    	Thread.sleep(5000);
    	
    	List <WebElement> el1= d1.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
    	
    	for (WebElement list:el1) 
    	{
    		if (list.getText().equalsIgnoreCase("Protractor"))
    		{
    			list.click();
    			break;
    	}   }

 }
}