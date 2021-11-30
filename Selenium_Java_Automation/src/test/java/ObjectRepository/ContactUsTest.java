package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class ContactUsTest {
	
	
	@Test
	public void mainTest() {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Piyush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1 = new ChromeDriver();
		
		contact_us cntc=new contact_us(d1);
		
		d1.manage().window().maximize();
		
	    d1.get("http://automationpractice.com/index.php?controller=contact"); 
	    
	    cntc.setemail("Testing@gmail.com");
	    cntc.setorder("order_01");
	    cntc.setmessage("Testing Check meassage");
		
	}
	
	
		
	
}
