package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Element {
	

	public static WebElement firstName(WebDriver d1) {
	
		return d1.findElement(By.name("firstName"));
	}
	
    public static WebElement lastName(WebDriver d1) {
	
    	return d1.findElement(By.name("lastName"));
	}
    
    public static WebElement phone(WebDriver d1) {
    	
    	return d1.findElement(By.name("phone"));
	}
    
    public static WebElement Address(WebDriver d1) {
    	
    	return d1.findElement(By.xpath("//input[@name='address1']"));
	}
    
    

    
}
