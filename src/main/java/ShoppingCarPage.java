import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ShoppingCarPage extends BasePage{


    @FindBy(css=".subheader")
            WebElement getSCPageTitle;
    @FindBy(css="div.inventory_item_name")
            WebElement getItemName;
    @FindBy(css=".btn_action.checkout_button")
            WebElement getChkBttn;
    @FindBy(css="div.inventory_item_name")
            List<WebElement> getProductsList;


    public ShoppingCarPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public ShoppingCarPage() {

    }

    public WebElement getTittlePage() {
        return getSCPageTitle;
    }

    public WebElement getProducts(){
        return getItemName;
        /*for (WebElement itemsSelected:getItemName) {
            String items = itemsSelected.getText();
            System.out.println(items);
        }*/
    }

    public List<WebElement> getlistofProducts(){
       /* for (WebElement itemsSelected:getProductsList) {
            String items = itemsSelected.getText();
            System.out.println(items);
            }*/
        return getProductsList;
    }

    public void clickCheckoutBtn(){
        if(getChkBttn.isDisplayed()){
            getChkBttn.click();
        }
    }
}
