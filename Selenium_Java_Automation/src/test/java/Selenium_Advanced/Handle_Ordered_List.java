package Selenium_Advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test
public class Handle_Ordered_List {
	
	@Test
	public void Login() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Piyush\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	WebDriver d1;
    	d1=new ChromeDriver();
    	d1.manage().window().maximize();
    	
    	d1.get("http://leafground.com/pages/selectable.html");
    	
    	List<WebElement> el1=d1.findElements(By.xpath("//ol[@id='selectable']/li"));
    	System.out.println("Total items are-"+el1.size());
    
    	
    	Actions act1=new Actions(d1);
    	
    	act1.keyDown(Keys.CONTROL).click(el1.get(0))
    	.click(el1.get(2)).click(el1.get(4))
    	.click(el1.get(6)).build().perform();
    	
    	
	}
}
