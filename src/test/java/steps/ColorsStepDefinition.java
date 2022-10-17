package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.SkyBluePage;
import pages.SkyWhitePage;
import util.BrowserFactory;

public class ColorsStepDefinition {
		static WebDriver driver;
		 SkyBluePage skyBluePage;
		 SkyWhitePage skyWhitePage;

		public void ColorsStepDefinition(WebDriver driver) {
			this.driver = driver;
		}

		@Before
		public void setUp() {
			driver = BrowserFactory.browserInit();
			skyBluePage = PageFactory.initElements(driver, SkyBluePage.class);
			skyWhitePage = PageFactory.initElements(driver, SkyWhitePage.class);
		}

		@Given("^Set SkyBlue Background button exists$")
		public void set_SkyBlue_Background_button_exists() {
			 try {
					driver.findElement(By.xpath("//button[contains(text(), 'Set SkyBlue Background')]"));
					System.out.println("The button Sky Blue exists");
				}
				catch(NoSuchElementException e) {
					driver.findElement(By.xpath("//button[contains(text(), 'Set SkyBlue Background')]"));
					System.out.println("The button Sky Blue does not exist");
				}
		}

		@When("^I click on the button on \"([^\"]*)\"$")
		public void i_click_on_the_button_on(String colors) throws Throwable {
		 switch(colors) {
		 case "Sky Blue":
			 skyBluePage.changeColorBlueButton();
			 Thread.sleep(2000);
			 break;
		 case "Sky White":
			 skyWhitePage.changeColorWhiteButton();
			 Thread.sleep(2000);
			 break;
			 default:
				 System.out.println("There was a mistake changing the color");
		 }
		}

		@Then("^the background color will change to sky blue$")
		public void the_background_color_will_change_to_sky_blue() throws Throwable {
		String colorExpected = "#87ceeb";
		String bckColor = driver.findElement(By.xpath("//body[@style='background-color: skyblue;']")).getCssValue("background-color");
		String hexColor = Color.fromString(bckColor).asHex();
		String actual = hexColor;
		Assert.assertEquals("The actual color doesn't match with the expected color", colorExpected, actual);
		System.out.println("The color was changed successfully to Sky Blue");
		Thread.sleep(2000);

		}

		@Given("^Set SkyWhite Background button exists$")
		public void set_SkyWhite_Background_button_exists() throws Throwable {
			try {
				driver.findElement(By.xpath("//button[contains(text(), 'Set White Background')]"));
				System.out.println("The button Sky White exists");
			}
			catch(NoSuchElementException e) {
				driver.findElement(By.xpath("//button[contains(text(), 'Set White Background')]"));
				System.out.println("The button Sky White does not exist");
			}
		}

		@Then("^the background color will change to sky white$")
		public void the_background_color_will_change_to_sky_white() throws Throwable {
		String colorExpectedW = "#ffffff";
		String bcgrColorW = driver.findElement(By.xpath("//body[@style='background-color: white;']")).getCssValue("background-color");
		String hexColorW = Color.fromString(bcgrColorW).asHex();
		String actualW = hexColorW;
		Assert.assertEquals("The actual color doesn't match with the expected color", colorExpectedW, actualW);
		System.out.println("The color was changed successfully to Sky White");
		Thread.sleep(2000);

		}

		@After
		public void tearDown() {
			driver.close();
			driver.quit();
		}
}
