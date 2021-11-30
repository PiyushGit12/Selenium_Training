package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handle_frames {
	
	@Test
	public void Frames() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Piyush\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	WebDriver d1;
    	d1=new ChromeDriver();	
//    	d1.get("http://leafground.com/pages/frame.html");
//    	d1.manage().window().maximize();
//    	
//    	d1.switchTo().frame(0);
//    	d1.findElement(By.id("Click")).click();
//    	
//    	//Switch back to the main window
//    	d1.switchTo().defaultContent();
//    	
//    	///////////////////   Nested-Frame              ////////////////////////
    	
//    	d1.switchTo().frame(1);
//    	d1.switchTo().frame("frame2");
//    	d1.findElement(By.id("Click1")).click();
    	
    	d1.get("https://demoqa.com/frames");
    	WebElement frm1=d1.findElement(By.id("frame1"));
    	
    	d1.switchTo().frame(frm1);
    	
    	WebElement frame1Heading= d1.findElement(By.id("sampleHeading"));
    	 String frame1Text=frame1Heading.getText();
    	 
    	 System.out.println("Text of the frame1 heading is:"+frame1Text);
    	 
    	
    	
	}
}
