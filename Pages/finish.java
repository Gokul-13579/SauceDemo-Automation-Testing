package Pages;

import static org.testng.Assert.*;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import BaseClass.baseSauceDemo;

public class finish extends baseSauceDemo {
	
	public finish scrsht() throws InterruptedException, IOException {
		
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    File snp = ts.getScreenshotAs(OutputType.FILE);
	    File dest=new File("./snp/img.png");
	    FileHandler.copy(snp, dest);
	    
	    String text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Thank you for your order!']"))).getText();
	    String expectedText ="Thank you for your order!";
	    String actualText = (text);
	    assertEquals(expectedText, actualText);
		return this;
	}

}
