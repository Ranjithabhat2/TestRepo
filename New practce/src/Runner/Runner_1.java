package Runner;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Generic_FWK.Generic_class;
import Generic_FWK.Generic_read_excel;
import POM.POMScript;

public class Runner_1  extends Generic_class{
	//@Test(dataProvider="test1")
		@Test
	//public void login(String email,String pwd) throws InterruptedException, EncryptedDocumentException, IOException
		

		public void login() throws InterruptedException, EncryptedDocumentException, IOException
	{
		POMScript p=new POMScript(driver);
		//p.passdata1(email);
		Thread.sleep(2000);
		//Assert.fail();
		//p.passdata2(pwd);
		p.passdata1(Generic_read_excel.get_data("Sheet1", 1, 1));
		Thread.sleep(2000);
		p.passdata2(Generic_read_excel.get_data("Sheet1", 1, 1));
		Thread.sleep(2000);
		p.enter();
	}
	}


