package Cookies;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Add_Cookies {
	
	@Test 
	public void login() throws InterruptedException, IOException
	{
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
		else
		{
			System.setProperty("webdriver.ie.driver",driver_path);
		    d1=new InternetExplorerDriver();
		}
		
		
        d1.get("https://www.amazon.in/");
    	File f1=new File("C:\\Users\\Piyush\\eclipse-workspace\\Selenium_Java_Automation\\Reports\\cookies.data");
    	
    	try 
    	{
    		f1.createNewFile();
    		FileWriter fw=new FileWriter(f1);
    		BufferedWriter bw=new BufferedWriter(fw);
    		
    		Set<Cookie> cookiesList =  d1.manage().getCookies();
        	System.out.println("Size of Cookies:"+cookiesList.size());
    	
    // 	add new cookies to the browser    //////////// For creating a new cookie we should pass the name of the cookie and its value
        	Cookie cobj=new Cookie("Browser_cookie134","1234567890");
        	d1.manage().addCookie(cobj);
        	
        	Set<Cookie> cookies1 =  d1.manage().getCookies();
        	System.out.println("After adding Cookies_Size:"+cookies1.size());
        	
        	for(Cookie ck:cookies1)
        	{
        		bw.write(ck.getName()+":"+ck.getValue());
        		bw.newLine();
        	}
        	bw.close();
    		fw.close();
    		
    
	    }
    	catch(Exception e)
		{
			System.out.println(e);
		}
    	
    	d1.quit();	}	
}
