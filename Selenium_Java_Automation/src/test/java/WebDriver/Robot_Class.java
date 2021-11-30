package WebDriver;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Robot_Class {
	
	@Test
	public void Login() throws AWTException, IOException {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Piyush\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	WebDriver d1;
    	d1=new ChromeDriver();
    	d1.get("http://leafground.com/pages/Alert.html");
    	d1.manage().window().maximize();
    	
    	// Click on button to show Alert
        d1.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
    	// Switch to Alert to perform some operation
        Alert a1=d1.switchTo().alert();	
        
        Robot r1=new Robot();
        Dimension var1=Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rec1=new Rectangle(var1);
        BufferedImage src=r1.createScreenCapture(rec1);
        File dest=new File(".//ScreenShot/Alert_Shot");
        ImageIO.write(src, "jpeg", dest);
        
        String msg=a1.getText();
        System.out.println("Alert-Popup_Box_msg -"+msg);
        
//        Accept alert
        d1.switchTo().alert().accept();
	}
}
