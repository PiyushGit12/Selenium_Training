package JavaScript_Executors;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePicker {
	
	@Test
    public void Login() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Piyush\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	WebDriver d1;
    	d1=new ChromeDriver();
    	d1.manage().window().maximize();
    	
    	d1.get("http://demo.automationtesting.in/Datepicker.html");

    	JavascriptExecutor jse=(JavascriptExecutor) d1;
    	
    	jse.executeScript("document.getElementById('datepicker1').value='29/08/2017'");
    	
    	jse.executeScript("document.getElementById('datepicker2').value='15/05/1994'");
    	
    	
    	
}
}