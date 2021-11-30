package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class contact_us{
	
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="id_order")
	WebElement orderref;
	
	@FindBy(id="message")
	WebElement message_Text;
	

	By heading = By.id("id_contact");
	By ChooseFile= By.id("fileUpload");
	
	
public contact_us(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setemail(String email_) {
		email.sendKeys(email_);	
	}
	
	public void setorder(String order) {
		orderref.sendKeys(order);	
	}
	
	public void setmessage(String msgtxt) {
		message_Text.sendKeys(msgtxt);	
	}
	
	
	
	
}
