package Generic_FWK;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utils.Fetchproperties;

public class Generic_class implements FW_Constants {
	public WebDriver driver;
@BeforeMethod
public void Openapp() throws FileNotFoundException, IOException
{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");

}
@AfterMethod
public void closeapp()
{
	System.out.println("test exec completed1");
	driver.close();
}

}


