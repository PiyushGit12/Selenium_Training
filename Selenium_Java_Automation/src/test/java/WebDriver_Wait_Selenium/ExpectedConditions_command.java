package WebDriver_Wait_Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


@Test
public class ExpectedConditions_command {
	
	@Test
	public void Login() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Piyush\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	WebDriver d1;
    	d1=new ChromeDriver();
    	
   ////////////////////////////////         Radio_Button 	          /////////////////////////////////
    	
    	d1.get("http://leafground.com/pages/radio.html");
    	d1.manage().window().maximize();
    	
    	WebDriverWait var1=new WebDriverWait(d1,10);
    	WebElement element =var1.until(ExpectedConditions.visibilityOfElementLocated(By.id("yes")));
    	
    	System.out.println(element);
    	
    	d1.findElement(By.id("yes"));
    	
  //////////////////////////////// Drop_Down 	          /////////////////////////////////   
    	
    	d1.get("http://leafground.com/pages/Dropdown.html");
//    	WebDriverWait var2=new WebDriverWait(d1,10);
//    	var2.until(ExpectedConditions.elementToBeSelected(By.id("dropdown1")));
    	
        Select drop2=new Select(d1.findElement(By.id("dropdown1")));
    	drop2.selectByValue("2");
    	
////////////////////////////////      Alert_Popup  	          ///////////////////////////////// 
    	
    	d1.get("http://leafground.com/pages/Alert.html");
    	WebDriverWait var3=new WebDriverWait(d1,10);
    	d1.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
    	
    	// Wait for Alert to be present
    	var3.until(ExpectedConditions.alertIsPresent());
    	
        Alert a1=d1.switchTo().alert();	
        
        String msg=a1.getText();
        
//        Accept alert
        a1.accept();
        System.out.println("Alert-Popup_Box_msg -"+msg);
        
////////////////////////////////     Frame  	          /////////////////////////////////      
        
        
      
     	
    	
	}
}
