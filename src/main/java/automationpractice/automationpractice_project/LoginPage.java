package automationpractice.automationpractice_project;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	

	@FindBy(xpath="//nav/div/a[@class='login']//..") 
	WebElement signin;

	@FindBy(xpath="//input[@id='email']") 
	WebElement email;
	
	@FindBy(xpath="//input[@id='passwd']") 
	WebElement passwd;
	
	@FindBy(xpath="//button[@id='SubmitLogin']") 
	WebElement submit;
	
	public void Logincredential(String user, String pwd) {
	
		Assert.assertTrue(signin.isDisplayed());
		signin.click();
		//implicitWait(30);
		email.sendKeys(user);
		passwd.sendKeys(pwd);
		submit.click();
}
}
