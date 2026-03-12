package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BaseClass.baseSauceDemo;

public class swagLabs extends baseSauceDemo {
	
	public swagLabs clickATC() throws InterruptedException {
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		return this; 
	}
	public chkOut cartIcon() throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='shopping_cart_link']"))).click();
		return new chkOut ();
	}
	 

}
