package Cookies;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class All_Cookies {

	@Test
	public void Login() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Piyush\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	WebDriver d1;
    	d1=new ChromeDriver();
    	d1.manage().window().maximize();
    	
    	d1.get("https://www.amazon.in/");
    	
    	File f1=new File("C:\\Users\\Piyush\\eclipse-workspace\\Selenium_Java_Automation\\Reports\\cookies.data");
    	
    	try {
    		f1.createNewFile();
    		FileWriter fw=new FileWriter(f1);
    		BufferedWriter bw=new BufferedWriter(fw); 
    	
    	
    	Set<Cookie> cookiesList =  d1.manage().getCookies();
    	System.out.println("Size of Cookies:"+cookiesList.size());
    	
    	System.out.println(d1.manage().getCookieNamed("session-id-time"));
    	
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
    	
    	//delete the newly created cookie
    	d1.manage().deleteCookie(cobj);
    	Set<Cookie> New_cookies_list=d1.manage().getCookies();
    	System.out.println("After deleting the Newly Created Cookies_Size:"+New_cookies_list.size());
    	
    	for(Cookie ck1:New_cookies_list) 
    	{
    	 System.out.println(ck1.getName()+":"+ck1.getValue());
    	}
    	
    	//delete All cookies
    	d1.manage().deleteAllCookies();
    	Set<Cookie> Del_cookies=d1.manage().getCookies();
    	System.out.println("After deleting all the Cookies_Size:"+Del_cookies.size());
    	
    	}
    	catch(Exception e)
		{
			System.out.println(e);
		}
    	
    	d1.quit();
}
}