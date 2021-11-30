package WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

@Test
public class Chrome_Launch {
	
    @Test
    public void Login() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Piyush\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	WebDriver d1;
    	d1=new ChromeDriver();
    	d1.get("http://leafground.com/home.html");
    	System.out.println(d1.getTitle());
    	d1.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[4]/a/h5")).click();
    	System.out.println(d1.getCurrentUrl());
//    	d1.quit();
    	
    	
    	d1.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
    	
    	/////////////////    Explicit_Wait for a specific element Max 10 seconds           /////////////////////////
    	
    	@SuppressWarnings("deprecation")
		WebDriverWait var1=new WebDriverWait(d1,10);
    	var1.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_email")));
    	
    	d1.findElement(By.id("ap_email")).sendKeys("Piyush12@gmail.com");
    	
    	d1.findElement(By.id("continue")).click();
    	
   
    }
}
