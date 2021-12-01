package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class CheckBox {
	
	
	@Test
	public void Login() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Piyush\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	WebDriver d1;
    	d1=new ChromeDriver();
    	d1.get("http://leafground.com/pages/checkbox.html");
    	d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[3]/input")).click();
    	d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[2]/input")).click();
    	d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[5]/input")).click();
    	
    	
    	WebElement check=d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[1]/input"));
    	
    	boolean status = check.isSelected();
        System.out.println(status);
 
    	
	}
}
