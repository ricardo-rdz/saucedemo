import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends BasePage{

   @FindBy(css=".subheader")
           WebElement getYIPageTitle;
   @FindBy(css="#first-name")
           WebElement getFirstNInput;
    @FindBy(css="#last-name")
            WebElement getSecondInput;
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


    public void prueba(){
        
    }

}
