package WebDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


@Test
public class Windows_handle {
	
	@Test
	public void Frames() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Piyush\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	WebDriver d1;
    	d1=new ChromeDriver();	
    	
    	d1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	d1.manage().window().maximize();
//    	d1.get("http://leafground.com/pages/Window.html");
//    	
//    	d1.findElement(By.id("home")).click();
//    	System.out.println(d1.getTitle());
//    	
//    	Set<String> window_value=d1.getWindowHandles();
//    	Iterator<String> iters=window_value.iterator();
//    	
//    	String w1=iters.next();
//    	String w2=iters.next();
//    	
//    	System.out.println(w1);
//    	System.out.println(w2);
//    	
//    	d1.switchTo().window(w2);
//    	System.out.println(d1.getTitle());
    	
    	
    	
    	d1.get("https://demoqa.com/browser-windows");
    	d1.findElement(By.id("tabButton")).click();
    	System.out.println("Element found using text: " +d1.getTitle());
    	
    	// Open new child window within the main window
    	d1.findElement(By.id("windowButton")).click();
    	
    	String mainWindowHandle = d1.getWindowHandle();
        Set<String> allWindowHandles = d1.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        
     // Here we will check if child window has other child windows and will fetch the heading of the child window
        while (iterator.hasNext())
        {
            String ChildWindow = iterator.next();
                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow))
                {
                d1.switchTo().window(ChildWindow);
                WebElement text = d1.findElement(By.id("sampleHeading"));
                System.out.println("Heading of child window is " + text.getText());
                }
    	
	    }
       }
}
