package JavaScript_Executors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrolling_with_IN_page {
	
	@Test
    public void Login() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Piyush\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	WebDriver d1;
    	d1=new ChromeDriver();
    	d1.manage().window().maximize();
    	
    	d1.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
    	
    	WebElement el1=d1.findElement(By.xpath("/html/body/div[2]/section/div[3]/div[1]/div/p[9]/textarea"));
    	
    	JavascriptExecutor jse=(JavascriptExecutor) d1;
    	
    	jse.executeScript("arguments[0].scrollIntoView(true);",el1);
    	el1.sendKeys("= Sent_This Msg within the page");

}
}