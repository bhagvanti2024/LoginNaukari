package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginNaukari {
	WebDriver driver;
	@FindBy(xpath = "//a[@id='login_Layer']")
	private WebElement login;

	@FindBy(xpath = "//input[@placeholder=\"Enter your active Email ID / Username\"]")
	private WebElement username;

	@FindBy(xpath = "//input[@placeholder=\"Enter your password\"]")
	private WebElement password;

	@FindBy(xpath = "//button[text()='Login']")
	private WebElement logbtn;

	public loginNaukari(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public void login() throws InterruptedException {
		login.click();
		Thread.sleep(3000);
	}

	public void loginpro() throws InterruptedException {
		username.sendKeys("bhagvantikhandate62@gmail.com");
		password.sendKeys("Bhagvanti@123");
		Thread.sleep(5000);
	}

	public void logbtn() throws InterruptedException {
		Thread.sleep(2000);
		logbtn.click();
	}
}
