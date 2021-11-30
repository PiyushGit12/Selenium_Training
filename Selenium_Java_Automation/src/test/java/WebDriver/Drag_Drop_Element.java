package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Drag_Drop_Element {

	@Test
	public void Login() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Piyush\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	WebDriver d1;
    	d1=new ChromeDriver();
    	d1.manage().window().maximize();
    	
    	d1.get("http://leafground.com/pages/drag.html");
    	
    	WebElement ele1=d1.findElement(By.id("draggable"));
    	
    	Actions act1=new Actions(d1);
    	
    	act1.dragAndDropBy(ele1, 250, 50).build().perform();
    	
 
    	d1.get("http://leafground.com/pages/drop.html");
    	WebElement drag=d1.findElement(By.id("draggable"));
    	WebElement drop=d1.findElement(By.id("droppable"));
    	
    	
    	Actions act2=new Actions(d1);
    	Thread.sleep(1000);
    	act2.dragAndDrop(drag, drop).build().perform();
    	
    	d1.quit();
	
 }
}