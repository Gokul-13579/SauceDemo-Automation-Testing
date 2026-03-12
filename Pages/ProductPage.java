package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BaseClass.baseSauceDemo;

public class ProductPage extends baseSauceDemo {
	
	public swagLabs clickBag() throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Sauce Labs Backpack']"))).click();
		return new swagLabs();
		
		}

}
