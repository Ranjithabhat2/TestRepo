package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMScript {
	
		@FindBy(id="email")
		private WebElement ele1;
		@FindBy(id="pass")
		private WebElement ele2;
		@FindBy(name="Log in")
		private WebElement ele3;
		
		public POMScript(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		public void passdata1(String email)
		{
			ele1.sendKeys(email);
		}
		public void passdata2(String pwd)
		{
			ele2.sendKeys(pwd);
		}
		public void enter()
		{
			
			ele3.click();
		}
		

	}



