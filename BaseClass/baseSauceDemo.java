package BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseSauceDemo {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	@BeforeMethod
	public void precon() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		 
		driver=new ChromeDriver(options);
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
	}
	@AfterMethod
	public void postcon() {
		driver.close();
	}
	

}
