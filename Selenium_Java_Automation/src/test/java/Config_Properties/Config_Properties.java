package Config_Properties;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Config_Properties {
	
	@Test
    public void Config_prop() throws IOException {
    	
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
		
		
		d1.get("http://demo.automationtesting.in/Datepicker.html");
		JavascriptExecutor jse=(JavascriptExecutor) d1;
		jse.executeScript("document.getElementById('datepicker1').value='23/07/1996'");
	
		
}
	}
