package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Itime_fill {
	
	@Test
	public void Login() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Piyush\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	WebDriver d1;
    	d1=new ChromeDriver();
    	d1.get("https://login.microsoftonline.com/189de737-c93a-4f5a-8b68-6f4ca9941912/wsfed?wa=wsignin1.0&wtrealm=https%3a%2f%2fwww.myhcl.com%2fbprhome%2fDefault.aspx&wctx=rm%3d0%26id%3dpassive%26ru%3d%252fbprhome%252fHome%252fIndex&wct=2021-10-26T13%3a07%3a08Z&wreply=https%3a%2f%2fwww.myhcl.com%2fbprhome%2fDefault.aspx&sso_reload=true");
    	d1.findElement(By.xpath("//*[@id=\"i0116\"]")).sendKeys("piyush.sonkar@hcl.com");
//    	d1.findElement(By.id("txtSearch")).sendKeys("itime");
    
    	
	}
}
