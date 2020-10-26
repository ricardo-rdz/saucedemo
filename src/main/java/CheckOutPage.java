import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends BasePage{

   @FindBy(css="div.subheader")
           WebElement getYIPageTitle;
   @FindBy(css="#first-name")
           WebElement getFirstNameInput;
    @FindBy(css="#last-name")
            WebElement getSecondNameInput;
    @FindBy(css="#postal-code")
            WebElement getZipCInput;
    @FindBy(xpath = "//*[@value = 'CONTINUE']")
            WebElement getContinueBtn;
   @FindBy(css = ".error-button")
           WebElement getErrorBtn;

    public CheckOutPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    public WebElement getTittlePage(){
        return getYIPageTitle;
    }

    public void fillInfo(){
        if (getYIPageTitle.isDisplayed()){
            getFirstNameInput.sendKeys("first");
            getSecondNameInput.sendKeys("second");
            getZipCInput.sendKeys("45060");
            }
    }

    public void clickContinue(){
        getContinueBtn.click();
    }

    public WebElement erroMessage(){
        return getErrorBtn;
    }

}
