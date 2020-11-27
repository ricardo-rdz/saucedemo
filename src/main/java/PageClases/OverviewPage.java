package PageClases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage extends BasePage{

    @FindBy(css= ".subheader")
           WebElement getOVPageTitle;
    @FindBy(css =".inventory_item_name")
           WebElement getItemAdded;
    @FindBy(css= "a.btn_action.cart_button")
            WebElement getFinishBtn;

    public OverviewPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public WebElement getTittle(){
        return getOVPageTitle;
    }

    public WebElement getItemsAdded(){
        return getItemAdded;
    }

    public void clickFinishButton(){
        getFinishBtn.click();
    }


}
