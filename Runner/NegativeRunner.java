package Runner;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import BaseClass.baseSauceDemo;
import Pages.LoginPage;



public class NegativeRunner extends baseSauceDemo {
	
	
	@Test
	 public void invalidUsernameTest() throws InterruptedException, IOException {
	        
		 LoginPage lp=new LoginPage() ;
		 lp.InUName().PWord().LogButton();
		 File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 File dest = new File("./Errsnp/img.png");
		 FileHandler.copy(src, dest);
		 
		 
	}
	
	@Test
	public void invalidPwdTest() throws InterruptedException, IOException {
		LoginPage lp=new LoginPage() ;
		lp.UName().InPwd().LogButton();
		 File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 File dest = new File("./Errsnp/img.png");
		 FileHandler.copy(src, dest);
		
		
	}
	    
			 
		 
		
	
	
	
		
		
		
		 
	 	 		
	
}