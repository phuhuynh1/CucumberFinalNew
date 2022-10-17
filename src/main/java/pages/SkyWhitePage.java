package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SkyWhitePage {
	public WebDriver driver; 
	public void SkyWhitePage(WebDriver driver) {
		this.driver = driver;
	}

	//Web Elements

	@FindBy(how = How.XPATH, using = "//button[contains(text(), 'Set White Background')]")
	WebElement SkyWhiteBackgroundButton;

	public void changeColorWhiteButton() {
		SkyWhiteBackgroundButton.click();
		System.out.println("Clicked on Sky White button");
	}

	public void whiteButtonCondition() {
		}
}
