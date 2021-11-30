package upload_download_files;

import java.io.FileInputStream;
import java.io.IOException;

import java.awt.event.KeyEvent;

import java.util.Properties;
import java.awt.Toolkit;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


public class Upload_File {

	
	@Test
    public void upload_files() throws IOException, AWTException, InterruptedException  {
    	
   
    	FileInputStream st=new FileInputStream("src\\test\\java\\Config_properties\\Config.properties");
		Properties prop=new Properties();
		
prop.load(st);
		
		String browser_name=prop.getProperty("browser");
		String driver_path=prop.getProperty("Driverlocation");
		WebDriver d1;
		if (browser_name.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",driver_path);
			d1=new ChromeDriver();
		}
		else if(browser_name.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",driver_path);
		    d1=new FirefoxDriver();
		}
		else
		{
			System.setProperty("webdriver.ie.driver",driver_path);
		    d1=new InternetExplorerDriver();
		}
		
		d1.get("https://www.ilovepdf.com/word_to_pdf");
		d1.findElement(By.id("pickfiles")).click();
		
		
		Thread.sleep(40000);
		
		String file="C:\\Users\\Piyush\\Downloads\\test.doc";
				
		
		StringSelection select1 =new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select1, null);
			
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_V);
		r1.keyRelease(KeyEvent.VK_V);
		r1.keyRelease(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}		
}
