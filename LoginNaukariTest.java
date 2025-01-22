package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;

public class LoginNaukariTest {
	WebDriver driver;
	loginNaukari home;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\khand\\Downloads\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Browser is Open...!");
	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		driver.get("https://www.naukri.com/");
		loginNaukari home = new loginNaukari(driver);
		home.login();
	}

	@Test
	public void Loginpro() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		loginNaukari home = new loginNaukari(driver);
		home.loginpro();
		System.out.println("welcome for your account");
	}

	@AfterMethod
	public void loginbtn() throws InterruptedException {
		loginNaukari home = new loginNaukari(driver);
		home.logbtn();
		System.out.println("welcome bhagvanti...................");
	}

	@AfterClass
	public void AfterClass() {
		driver.close();
	}
}
