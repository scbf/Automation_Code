package StepDefinitonCat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class AddingCategories {
	static WebDriver driver;

	@SuppressWarnings("deprecation")
	@Given("enter the email and password")
	public void enter_the_email_and_password() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

		// User Open the Login Page
		driver.navigate().to("http://www.resgroup.mypreview.xyz/");
		// User Login
		driver.findElement(By.name("email")).sendKeys("robertjames@gmail.com");
		Thread.sleep(2000);
		// User Entering the
		// Pas
		driver.findElement(By.name("password")).sendKeys("123456");
	}

	@Then("click on the signup button")
	public void click_on_the_signup_button() {

		driver.findElement(By.xpath("//*[@id=\"gI_sign_in_form\"]/div[8]/button")).sendKeys(Keys.ENTER);
	}

	@Given("click on menu management")
	public void click_on_menu_management() {
		// clicking on the menu management
		driver.findElement(By.partialLinkText("Menu Management")).click();
	}

	@When("click on categories")
	public void click_on_categories() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Food Menu")).click();
		// Clicking on Categories
		driver.findElement(By.linkText("Categories")).click();
		Thread.sleep(2000);
	}

	@Then("click on add categories button")
	public void click_on_add_categories_button() throws InterruptedException {

		driver.findElement(By.linkText("Add Category")).click();
		Thread.sleep(2000);
	}

	@Given("/^enter (.*) user choice$/")
	public void enter_cat_name_user_choice(String catName) throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/div/div/div/form/div/div[2]/div[1]/div[2]/input"))
				.sendKeys(catName);
	}

	@Then("/^enter (.*) of item$/")
	public void enter_discription_of_item(String discription) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/div/div/div/form/div/div[3]/div[1]/div[2]/input"))
				.sendKeys(discription);
	}

	@Then("/^I need to enter (.*)$/")
	public void i_need_to_enter_disclaimer(String disclaimer) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"kt_tab_pane_1\"]/div/div/form/div/div[2]/div[2]/div[2]/input"))
				.sendKeys(disclaimer);
	}

	@Then("/^I need to enter (.*) correctly$/")
	public void i_need_to_enter_sequel_number_correctly(String sequelNumber) throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"kt_tab_pane_1\"]/div/div/form/div/div[3]/div[2]/div[1]/input"))
				.sendKeys(sequelNumber);
		Thread.sleep(2000);
	}

	@Then("I need to click on save button")
	public void i_need_to_click_on_save_button() throws InterruptedException {

		driver.findElement(By.id("kt_modal_new_address_submit")).click();
		Thread.sleep(5000);
	}
}