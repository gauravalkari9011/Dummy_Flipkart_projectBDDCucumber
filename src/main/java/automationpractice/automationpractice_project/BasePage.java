package automationpractice.automationpractice_project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {

	WebDriver driver = null;
 
	public void driverPage() {

		String exePath = "F:\\jar\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exePath);

		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void implicitWait(int t) {
		driver.manage().timeouts().implicitlyWait(t, TimeUnit.SECONDS);
	}

	public void enterURL(String url) {
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void scrollUsingRobot() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
	}
}
