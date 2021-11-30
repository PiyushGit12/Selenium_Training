package WebDriver;

import java.awt.AWTException;
import java.awt.Robot;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Handle_popup {
	

	@Test
	public void Login() throws AWTException {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Piyush\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	WebDriver d1;
    	d1=new ChromeDriver();
    	d1.get("http://leafground.com/pages/Alert.html");
    	d1.manage().window().maximize();
    	
    	// Click on button to show Alert
        d1.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
    	// Switch to Alert to perform some operation
        Alert a1=d1.switchTo().alert();	
        
        String msg_01=a1.getText();
        System.out.println("Alert-Popup_Box_msg_01 -"+msg_01);
        
//        Accept alert
        d1.switchTo().alert().accept();
        
    	
        
        d1.get("http://leafground.com/pages/Alert.html");        
        d1.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
        
     // Switch to Alert to perform some operation
        Alert a2=d1.switchTo().alert();
        
        String msg1=a2.getText();
        System.out.println("Alert-Popup_Box_msg1 -"+msg1);
	
     // Dismiss alert
        d1.switchTo().alert().dismiss();
        

        d1.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
        Alert a3=d1.switchTo().alert();
        a3.sendKeys("Hcl-Technologies");

        String msg2=a3.getText();
        System.out.println("Alert-Popup_Box_msg2 -"+msg2);
        a3.accept();
        
   
//        d1.quit();
      
      
        
	}
}
