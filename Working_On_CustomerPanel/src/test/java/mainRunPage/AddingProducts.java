package mainRunPage;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.customer.allVariables.dynamicVariables;
import com.customer.allVariables.webLocators;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddingProducts {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		WebDriverManager.chromedriver().setup();
		System.out.println("Please Select 1 for Delivery and 2 for PickUp \n");
		int userSelection = sc.nextInt();
		
		
		driver = new ChromeDriver();
		dynamicVariables values = new dynamicVariables();
		webLocators locators = new webLocators(driver);
		Actions action = new Actions(driver);
		PickUpPageRun pickUpPage = new PickUpPageRun();
		deliveryPageRun dpPage = new deliveryPageRun();

		driver.get(values.baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		action.moveToElement(locators.branchClkBtn).click().perform();

		if (userSelection == 1) {
			System.out.println("Using Delivery");
			Thread.sleep(3000);
			dpPage.enterDeliveryDetails();
			dpPage.clkOnSubmitBtn();
			System.out.println("Your Order is Conformed");

		}

		else if (userSelection == 2) {
			Thread.sleep(3000);
			System.out.println("Using PickUp");
			pickUpPage.clkOnPickUpBtn();
			pickUpPage.enterPickUpDetails();
			pickUpPage.clkOnPickUpSbmtBtn();
			System.out.println("Your Order is Conformed");
		} else {
			System.out.println("Please Check Your Entry....!" + "\n" + "Please come again");
			driver.quit();
		}
		sc.close();
	}
}
