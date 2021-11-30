package Cookies;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


public class Handling_cookies {
	
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
		
		d1.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fyour-account%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		d1.findElement(By.id("ap_email")).sendKeys("piyushTest");
		
		d1.findElement(By.id("continue")).click();
		File f1=new File("C:\\Users\\Piyush\\eclipse-workspace\\Selenium_Java_Automation\\Reports\\cookies.data");
		
		
		try
		{
			
		f1.createNewFile();
		FileWriter fw=new FileWriter(f1);
		BufferedWriter bw=new BufferedWriter(fw);     //// Take Collections of Characters to store in a Give_File     //////
 		
		for(Cookie ck:d1.manage().getCookies())
		{
			bw.write((ck.getDomain()+";"+ck.getName()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.getValue()+";"+ck.isSecure()));
			bw.newLine();
		}
		bw.close();
		fw.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
        d1.close();
	}
}
