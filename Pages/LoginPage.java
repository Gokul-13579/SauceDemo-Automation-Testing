package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import BaseClass.baseSauceDemo;

public class  LoginPage extends baseSauceDemo {
	
	public LoginPage UName() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		return this;
		
	}
	
	public LoginPage InUName () {
		driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("user-name")).sendKeys("wrong_user");
		return this;
	}
	
	public LoginPage PWord() throws InterruptedException {
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		return this;
		
	}
	
	public LoginPage InPwd () {
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("wrong_pass");
		return this;
		
	}
	public ProductPage LogButton() throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='submit-button btn_action']"))).click();
		String errMsg =driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
		String expMsg ="Epic sadface: Username and password do not match any user in this service";
		String actMsg = errMsg;
		Assert.assertEquals(expMsg, actMsg);
		return new ProductPage();
		
		
	}
	

}
