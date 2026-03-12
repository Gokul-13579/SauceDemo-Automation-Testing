package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseClass.baseSauceDemo;

public class overView extends baseSauceDemo {
	 
	public overView totPrice() throws InterruptedException {
		Thread.sleep(3000);
		WebElement price = driver.findElement(By.xpath("//div[@data-test='total-label']"));
	    System.out.println(price);
	    return this;
	
	}
	
	public finish clkfin() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Finish']")).click();
		return new finish ();
	}
	
	 

}
