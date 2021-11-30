package JavaScript_Executors;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Horizaltal_Scroll {

	@Test
    public void Scrol_HZ() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Piyush\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	WebDriver d1;
    	d1=new ChromeDriver();
    	d1.manage().window().maximize();
    	
    	d1.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
    	
    	WebElement Scrol_HZ=d1.findElement(By.xpath("//div[@id='mCSB_5_container']"));
    	
    	JavascriptExecutor jse1=(JavascriptExecutor) d1;
    	jse1.executeScript("arguments[0].scrollIntoView(true);",Scrol_HZ);
    	
	
       List	<WebElement> el2=d1.findElements(By.xpath("//div[@id='mCSB_5_container']/ul"));
       
       for (WebElement list:el2) {
    	
    	System.out.println("All_List"+list.getText());   
       }
	}	
}
