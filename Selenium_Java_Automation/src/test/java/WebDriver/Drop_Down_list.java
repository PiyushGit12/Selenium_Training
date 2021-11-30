package WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

@Test
public class Drop_Down_list {
	
	@Test
	public void Login() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Piyush\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	WebDriver d1;
    	d1=new ChromeDriver();
    	d1.get("http://leafground.com/pages/Dropdown.html");
    	d1.manage().window().maximize();
    	Select drop2=new Select(d1.findElement(By.name("dropdown2")));
    	
    	drop2.selectByValue("3");
    	
    	WebElement firstEle= drop2.getFirstSelectedOption();
    	System.out.println("first-element-"+ firstEle.getText());
        
        d1.get("http://leafground.com/pages/Dropdown.html");
        Select drop1=new Select(d1.findElement(By.id("dropdown1")));
        
        if(drop1.isMultiple()) {
        	
        	drop1.selectByIndex(0);
        	drop1.selectByIndex(2);
        	
        	drop1.selectByVisibleText("Appium");
        	drop1.selectByVisibleText("Loadrunner");
        		
        }
        
    	Select select=new Select(d1.findElement(By.name("dropdown2")));
    	List<WebElement> listoptions=select.getOptions();
    	
    	for(WebElement WebElement : listoptions) {
    		System.out.println("options -"+WebElement.getText());
    
    
    	
    		
    	}	
	}

}
