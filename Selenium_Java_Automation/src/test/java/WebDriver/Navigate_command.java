package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Navigate_command {
	
	@Test
	public void Navigate() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Piyush\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	WebDriver d1;
    	d1=new ChromeDriver();
    	d1.get("http://leafground.com/home.html");
    	
    	d1.navigate().to("http://leafground.com/pages/Window.html");
    	d1.navigate().forward();
    	d1.navigate().back();
    	
    	
	}
}
