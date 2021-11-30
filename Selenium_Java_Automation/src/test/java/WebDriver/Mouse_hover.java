package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouse_hover {
	

	
	@Test
	public void hover() {
    	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Piyush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
    	
    	d1.get("http://leafground.com/pages/Edit.html");
    	
    	WebElement ele1=d1.findElement(By.id("email"));
    	
    	//Creating object of an Actions class
    	Actions act1=new Actions(d1);
    	
    	//Performing the mouse hover action on the target element.
    	act1.sendKeys(ele1,"PiyushTest@gmail.com")
    	.doubleClick().contextClick().build().perform();
  	
   
}
//	@Test
//	public void Hover_Test(){
//		
//	
//		d1.get("http://leafground.com/pages/mouseOver.html");
//		
//		WebElement mainMenu=d1.findElement(By.xpath("//a[@class='btnMouse']"));
//		
//		Actions act2=new Actions(d1);
//		act2.moveToElement(mainMenu).perform();
//		
//		
//	}
//	
}
