package automationpractice.automationpractice_project;

import java.awt.AWTException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProductPage extends BasePage{

	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	public WebElement tshirtLink;
	
	@FindBy(xpath="//div[@class='product-image-container']/a/img")
	public WebElement clickonProduct;
	
	@FindBy(xpath="//p[@id='add_to_cart']/button")
	public WebElement addCart;
	
	@FindBy(xpath="//h2[contains(.,'Product successfully added to your shopping cart')]")
    //@FindBy(xpath="//*[@id='layer_cart']/div[1]/div[1]/h2")
	public WebElement productadded;
	
	@FindBy(xpath="//div[@class='button-container']/a/span")
	public WebElement proceedtoCheckout;
	
	@FindBy(xpath="//span[@id='layer_cart_product_title']")
    public WebElement productTitle;
	
	@FindBy(xpath="//span[@id='layer_cart_product_attributes']")
    public WebElement productAttribute;
	
	@FindBy(xpath="//span[@id='layer_cart_product_quantity']")
    public WebElement productQuantity;
	
	@FindBy(xpath="//span[@id='layer_cart_product_price']")
    public WebElement productPrice;
	
	
	public void selectCategory() throws AWTException, InterruptedException {	
	tshirtLink.click();
	scrollUsingRobot();
	clickonProduct.click();
	addCart.click();
	Thread.sleep(3000);
	Assert.assertTrue(productadded.isDisplayed());
	//productadded.click();
	proceedtoCheckout.click();
	
	
	System.out.println(productQuantity.getAttribute("innerHTML")); 
	System.out.println(productPrice.getText()); 
	System.out.println(productAttribute.getAttribute("outerText")); 
	System.out.println(productTitle.getAttribute("innerText")); 
	}
}
