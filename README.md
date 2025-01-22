# LoginNaukari

package POM; import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement; import org.openqa.selenium.interactions.Actions; import org.openqa.selenium.support.FindBy; import org.openqa.selenium.support.PageFactory; public class loginNaukari { WebDriver driver; @FindBy(xpath = "//a[@id='login_Layer']") private WebElement login; @FindBy(xpath = "//input[@placeholder=\"Enter your active Email ID / Username\"]") private WebElement username; @FindBy(xpath = "//input[@placeholder=\"Enter your password\"]") private WebElement password; @FindBy(xpath = "//button[text()='Login']") private WebElement logbtn; public loginNaukari(WebDriver driver1) { this.driver = driver1; PageFactory.initElements(driver, this); } public void login() throws InterruptedException { login.click(); Thread.sleep(3000); } public void loginpro() throws InterruptedException { username.sendKeys("bhagvantikhandate62@gmail.com"); password.sendKeys("Bhagvanti@123"); Thread.sleep(5000); } public void logbtn() throws InterruptedException { Thread.sleep(2000); logbtn.click(); } } package POM; import java.time.Duration; import org.openqa.selenium.WebDriver; import org.openqa.selenium.chrome.ChromeDriver; import org.testng.annotations.BeforeClass; import org.testng.annotations.BeforeMethod; import org.testng.annotations.AfterClass; import org.testng.annotations.AfterMethod; import org.testng.annotations.Test; public class LoginNaukariTest { WebDriver driver; loginNaukari home; @BeforeClass public void beforeClass() { System.setProperty("webdriver.chrome.driver", "C:\\Users\\khand\\Downloads\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe"); driver = new ChromeDriver(); driver.manage().window().maximize(); driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); System.out.println("Browser is Open...!"); } @BeforeMethod public void beforeMethod() throws InterruptedException { driver.get("https://www.naukri.com/"); loginNaukari home = new loginNaukari(driver); home.login(); } @Test public void Loginpro() throws InterruptedException { driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); loginNaukari home = new loginNaukari(driver); home.loginpro(); System.out.println("welcome for your account"); } @AfterMethod public void loginbtn() throws InterruptedException { loginNaukari home = new loginNaukari(driver); home.logbtn(); System.out.println("welcome bhagvanti..................."); } @AfterClass public void AfterClass() { driver.close(); } } please give the description regarding program to add the github
Here's a detailed description of your new Selenium WebDriver program for automating the login process on Naukri.com.The program uses the Page Object Model (POM) design pattern and the TestNG framework.

Description:
loginNaukari (Page Object Model Class):

This class represents the elements and actions required for the login process on Naukri.com.

Attributes:

WebDriver driver: The WebDriver instance for browser interactions.

WebElement login: Locator for the login button.

WebElement username: Locator for the username input field.

WebElement password: Locator for the password input field.

WebElement logbtn: Locator for the login button.

Methods:

public loginNaukari(WebDriver driver1): Constructor to initialize WebDriver and PageFactory elements.

public void login() throws InterruptedException: Method to click the login button.

public void loginpro() throws InterruptedException: Method to enter the username and password.

public void logbtn() throws InterruptedException: Method to click the login button after entering credentials.

LoginNaukariTest (TestNG Test Class):

This class contains the test setup and test methods using the TestNG framework.

Attributes:

WebDriver driver: The WebDriver instance for browser interactions.

loginNaukari home: Instance of the POM class.

Methods:

@BeforeClass public void beforeClass(): Method to set up the WebDriver and initialize the POM class.

@BeforeMethod public void beforeMethod() throws InterruptedException: Method to navigate to the Naukri.comURL and click the login button.

@Test public void Loginpro() throws InterruptedException: Test method to enter login credentials and verify the login process.

@AfterMethod public void loginbtn() throws InterruptedException: Method to click the login button after entering credentials.

@AfterClass public void AfterClass(): Method to close the WebDriver instance.
