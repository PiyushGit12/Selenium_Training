package upload_download_files;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;



public class Download_File {
	
	@Test
    public void download_files() throws IOException  {
    	
   
    	FileInputStream st=new FileInputStream("src\\test\\java\\Config_properties\\Config.properties");
		Properties prop=new Properties();
		
prop.load(st);
		
		String browser_name=prop.getProperty("browser");
		String driver_path=prop.getProperty("Driverlocation");
		WebDriver d1;
		if (browser_name.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",driver_path);
			d1=new ChromeDriver();
		}
		else if(browser_name.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",driver_path);
		    d1=new FirefoxDriver();
		}
		else
		{
			System.setProperty("webdriver.ie.driver",driver_path);
		    d1=new InternetExplorerDriver();
		}
		
		
		d1.get("http://www.leafground.com/pages/download.html");
		d1.findElement(By.linkText("Download Excel")).click();
		
		File list_files=new File("C:\\Users\\Piyush\\Downloads");
		
		File[] total_files=list_files.listFiles();
		for (File file_required:total_files)
		{
			if(file_required.getName().equalsIgnoreCase("testleaf (4).xlsx"))
			{
				System.out.println("File is downloaded");
				break;
			}
		}
	}		
}
