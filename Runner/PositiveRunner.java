package Runner;

import java.io.IOException;
import org.testng.annotations.Test;

import BaseClass.baseSauceDemo;
import Pages.LoginPage;

public class PositiveRunner extends baseSauceDemo {
	
	
	
	@Test 
	
	public void posRunner () throws InterruptedException, IOException {
		
		LoginPage lg=new LoginPage();
		lg.UName().PWord().LogButton().clickBag().clickATC().cartIcon().ClkChk().FName()
		.LName().PCode().cont().totPrice().clkfin().scrsht();
		
	
	}
}