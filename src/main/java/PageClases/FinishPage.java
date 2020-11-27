package PageClases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinishPage extends BasePage{

    public FinishPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(css="div.subheader")
    WebElement getFinishTittle;


    public WebElement getPageTittle(){
        return getFinishTittle;
    }



}
