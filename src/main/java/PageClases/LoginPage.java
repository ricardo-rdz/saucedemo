package PageClases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BasePage {


	//PageClases.LoginPage Locators
	@FindBy(css=".bot_column")
	WebElement botImage;
	//By getLgPageTitle = By.cssSelector(".login_logo");
	//WebElement tittlePage = driver.findElement(getLgPageTitle);
	@FindBy(css="#user-name")
	WebElement userName;
	@FindBy(css="#password")
	WebElement pass;
	@FindBy(css=".btn_action")
	WebElement logginBtn;

	@FindBy(css="button.error-button")
			WebElement error;


	//PageClases.LoginPage Constructor
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		//PageClases.BasePage.driver = driver;
	}

	public LoginPage() {

	}

	//WebElement Methods
	public WebElement getBot() {
		return botImage;
	}


	public ProductPage loggin(String UserID, String Password) {
		if (botImage.isDisplayed()) {

			userName.sendKeys(UserID);
			pass.sendKeys(Password);
			logginBtn.submit();

		} else {
			System.out.println("La pagina no ha cargado ");

		}
		return new ProductPage();
	}

	public WebElement getErrorMessage() {
		return error;
	}




}
