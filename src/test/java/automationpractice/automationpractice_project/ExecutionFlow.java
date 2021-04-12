package automationpractice.automationpractice_project;

import java.awt.AWTException;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class ExecutionFlow extends LoginPage{

@Test	
public void test() throws AWTException, InterruptedException {
	
	driverPage();
	enterURL("http://Automationpractice.com");
	Assert.assertEquals("My Store", driver.getTitle());
	implicitWait(10);
	
	LoginPage LoginPage = PageFactory.initElements(driver, LoginPage.class);
	 
	ProductPage ProductPage = PageFactory.initElements(driver, ProductPage.class);
	
	LoginPage.Logincredential("jetblue@grr.la","jetblue");
	
	ProductPage.selectCategory();
	
	
	
}	

}
