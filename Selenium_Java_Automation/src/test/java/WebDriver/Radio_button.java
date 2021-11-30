package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Radio_button {
	
	@Test
	public void Login() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Piyush\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	WebDriver d1;
    	d1=new ChromeDriver();
    	d1.get("http://leafground.com/pages/radio.html");
        WebElement Male_bttn=d1.findElement(By.id("yes"));
        
        Male_bttn.click();
        
     // Radio button is present in web page then return boolean value-True
        boolean status_1 = Male_bttn.isDisplayed();
        System.out.println("Button is Present on Web_page: " +status_1);
        
//        Radio button is Enabled in web page then return boolean value-True
        boolean status_2 = Male_bttn.isEnabled();
        System.out.println("Button is Enabled on Web_page: " +status_2);
        
//      Radio button is Selected in web page then return boolean value-True        
        boolean status_3 = Male_bttn.isSelected();
        System.out.println("Button is Selected on Web_page: " +status_3);
        
     

}

}
