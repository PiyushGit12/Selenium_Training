package Log_4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Log4jDemo {
	
	 
	 
    public static void main(String[] args) {
    	
    	Logger logger = Logger.getLogger(Log4jDemo.class);
    	
    	
    	PropertyConfigurator.configure("log4j2.properties");
    	
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Piyush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1 = new ChromeDriver();
		
		
        logger.info("Browser opened");
        d1.get("https://classic.freecrm.com/index.html");
        d1.manage().window().maximize();
        
        logger.info("pass username");
        d1.findElement(By.name("username")).sendKeys("Testing_Crm");
        
        logger.info("pass password");
        d1.findElement(By.name("password")).sendKeys("testCrm1");
        
        logger.info("clicked on Login button");
        d1.findElement(By.xpath("//input[@class='btn btn-small']")).click();
        System.out.println("Login Successful");
  
       
    }

}
