package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Element_Test {

	
	public static WebDriver driver = null;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Piyush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		Element.firstName(driver).sendKeys("Ajun");
		Element.lastName(driver).sendKeys("Sagar");
		Element.phone(driver).sendKeys("9108173987");
		
		
	}
}
