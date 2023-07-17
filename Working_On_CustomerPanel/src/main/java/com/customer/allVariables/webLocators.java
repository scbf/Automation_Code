package com.customer.allVariables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class webLocators {

	WebDriver driver;

	public webLocators(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

//********************************************************USER ENTERING THE DELIVERY DETAILS**********************************************//
	@FindBy(xpath = "//button[@class='custom_hover btn btn-primary']")
	public WebElement branchClkBtn;
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary Mui-selected delivery_tab css-1q2h7u5'] ")
	public WebElement deliveryBtn;
	@FindBy(id = "simple-tab-1")
	public WebElement pickupBtn;
	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	public WebElement deliveryName;
	@FindBy(xpath = "//input[@class='filterme form-control']")
	public WebElement deliveryNumber;
	@FindBy(xpath = "(//input[@class='form-control'])[2]")
	public WebElement deliveryEmail;
	@FindBy(xpath = "//input[@class='location-search-input form-control']")
	public WebElement deliveryLocation;
	@FindBy(xpath = "(//input[@class='form-control'])[3]")
	public WebElement deliveryAddressLine;
	@FindBy(xpath = "(//div[@class=' css-12b2nx-control'])[1]")
	public WebElement deliveryDate;
	@FindBy(xpath = "(//div[@class=' css-1jqq78o-placeholder'])[last()]")
	public WebElement deliveryTime;
	@FindBy(xpath = "//button[@class='proceed_button text-center custom_hover']")
	public WebElement deliverySbmtBtn;

//**************************************************USER ENTERING THE PICKUP DETAILS************************************************//
	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	public WebElement pickUpName;
	@FindBy(xpath = "(//input[@class='filterme form-control'])[1]")
	public WebElement pickUpNumber;
	@FindBy(xpath = "(//input[@class='form-control'])[2]")
	public WebElement pickUpEmail;
	@FindBy(xpath = "(//div[@class=' css-1jqq78o-placeholder'])[1]")
	public WebElement pickUpDate;
	@FindBy(xpath = "(//div[@class=' css-1jqq78o-placeholder'])[last()]")
	public WebElement pickUpTime;
	@FindBy(xpath = "//button[@class='proceed_button text-center custom_hover']")
	public WebElement pickUpSbmtBtn;
}
