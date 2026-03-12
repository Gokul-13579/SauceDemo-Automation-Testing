package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BaseClass.baseSauceDemo;

public class chkOut extends baseSauceDemo {
	
	public chkOut ClkChk() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkout"))).click();
		return this;
	}
	
	public chkOut FName () throws InterruptedException {
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("first-name"))).sendKeys("Gokul");
		return this;
	}
	public chkOut LName() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("last-name")).sendKeys("R");
		return this;
	}
	public chkOut PCode() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("postal-code")).sendKeys("123456");
		return this ;
	}
	public overView cont() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("continue")).click();
		return new overView ();
	}

}
