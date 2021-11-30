package JavaScript_Executors;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrolling_page {
	
	 @Test
	    public void Login() {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Piyush\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    	WebDriver d1;
	    	d1=new ChromeDriver();
	    	d1.manage().window().maximize();
	    	
	    	d1.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
	    	
	    	JavascriptExecutor jse=(JavascriptExecutor) d1;
	    	jse.executeScript("scroll(100,650)");
	    	
	
}
}