package mainRunPage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import com.customer.allVariables.dynamicVariables;
import com.customer.allVariables.webLocators;

public class deliveryPageRun  {

	AddingProducts add = new AddingProducts();
	dynamicVariables values = new dynamicVariables();
	webLocators locators = new webLocators(AddingProducts.driver);

	

	public void enterDeliveryDetails() throws InterruptedException {

		locators.deliveryName.sendKeys(values.deliveryName);
		Thread.sleep(2000);
		locators.deliveryNumber.sendKeys(values.deliveryPhoneNumber);
		Thread.sleep(2000);
		locators.deliveryEmail.sendKeys(values.deliveryEmail);
		Thread.sleep(2000);
		locators.deliveryLocation.sendKeys(values.deliveryAddress);
		Thread.sleep(2000);
		Actions action = new Actions(AddingProducts.driver);
		action.moveToElement(locators.deliveryLocation).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		locators.deliveryAddressLine.sendKeys(values.deliveryAddressLine);
		action.moveToElement(locators.deliveryDate).click().perform();
		Thread.sleep(2000);
		action.moveByOffset(0, 100).click().perform();
		Thread.sleep(2000);
		action.moveToElement(locators.deliveryTime).click().perform();
		Thread.sleep(2000);
		action.moveByOffset(0, 100).click().perform();
		Thread.sleep(2000);
		// locators.deliverySbmtBtn.click();
	}

	public void clkOnSubmitBtn() {
		locators.deliverySbmtBtn.click();

		// driver.quit();
	}
	public void clkOnPickUpBtn() throws InterruptedException {
		Thread.sleep(5000);
		Actions action = new Actions(AddingProducts.driver);
		action.moveToElement(locators.pickupBtn).click().perform();
	}

	public void enterPickUpDetails() throws InterruptedException {
		locators.pickUpName.sendKeys(values.pickUpName);
		Thread.sleep(2000);
		locators.pickUpNumber.sendKeys(values.pickUpNumber);
		Thread.sleep(2000);
		locators.pickUpEmail.sendKeys(values.pickUpEmail);
		Thread.sleep(2000);
		Actions action = new Actions(AddingProducts.driver);
		action.moveToElement(locators.pickUpDate).click().perform();
		Thread.sleep(2000);
		action.moveByOffset(0, 100).click().perform();
		Thread.sleep(2000);
		action.moveToElement(locators.pickUpTime).click().perform();
		Thread.sleep(2000);
		action.moveByOffset(0, 100).click().perform();
		Thread.sleep(2000);
	}

	public void clkOnPickUpSbmtBtn() {
		locators.pickUpSbmtBtn.click();
		// driver.quit();
	}

}
