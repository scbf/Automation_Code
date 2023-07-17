package mainRunPage;

import org.openqa.selenium.interactions.Actions;
import com.customer.allVariables.dynamicVariables;
import com.customer.allVariables.webLocators;

public class PickUpPageRun {
	AddingProducts add = new AddingProducts();
	dynamicVariables values = new dynamicVariables();
	webLocators locators = new webLocators(AddingProducts.driver);

	public void clkOnPickUpBtn() throws InterruptedException {
		Thread.sleep(5000);
		Actions action = new Actions(AddingProducts.driver);
		action.moveToElement(locators.pickupBtn).click().perform();
	}

	public void enterPickUpDetails() throws InterruptedException {
		Thread.sleep(2000);
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
