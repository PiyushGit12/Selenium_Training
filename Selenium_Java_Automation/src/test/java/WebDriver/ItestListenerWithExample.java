package WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(testNGListeners.Listeners.class)
public class ItestListenerWithExample {
	
	WebDriver d1=new ChromeDriver();
	
	// Test to pass as to verify listeners .		
		@Test(priority=1)	
		public void TestToPass()				
		{	
		    System.out.println("This method to pass test");	
		    d1.get("http://www.leafground.com/pages/Calendar.html");	
		    d1.getTitle();
		    d1.quit();
		}	
		
		//Used skip exception to skip the test
		@Test(priority=2)
		public void TestToSkip ()
		{
	            System.out.println("This method to skip test");
		    throw new SkipException("Skipping - This is not ready for testing ");
		}
		
		
		// In the above method, we have already closed the browser. So we could not get the title here. It is to forcefully fail the test			
		@Test(priority=3)		
		public void TestToFail()				
		{		
		    d1.getTitle();
		    System.out.println("This method to test fail");				
		}
	
     
	
	
	
}
	

