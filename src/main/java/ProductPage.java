import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import java.util.List;
import java.util.Properties;


public class ProductPage extends BasePage {



    @FindBy(css=".product_label")
           WebElement productPageTittle;
    @FindBy(css="div.bm-burger-button")
            WebElement getBurgerBtn;
    @FindBy(css="#logout_sidebar_link")
            WebElement getLogOutLink;
    @FindBy(css= "#shopping_cart_container > a > svg")
            WebElement getShoppingCar;
    @FindBy(css="div.inventory_item_name")
            List<WebElement> getListofProducts;
    @FindBy(css="button.btn_primary.btn_inventory")
            List<WebElement> getAddCarBtn;
    @FindBy(css="button.btn_primary.btn_inventory")
            WebElement addCartBtn;




    public ProductPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    public ProductPage() {
    }

    public WebElement getTittlePage() {
        return productPageTittle;
    }


    public LoginPage logout(){
        if(getBurgerBtn.isDisplayed()){
            getBurgerBtn.click();
            getLogOutLink.click();
        }else{
            System.out.println("WebElement not found");
        }
        return new LoginPage();
    }


    public ShoppingCarPage clickShoppingCar(){
        if(getShoppingCar.isDisplayed()){
            getShoppingCar.click();
       }
        return new ShoppingCarPage();
    }


    public void selectOneProduct(){
        int j=0;
        for (int i = 0; i<getListofProducts.size(); i++) {
                String nameProducts = getListofProducts.get(i).getText();
                if(nameProducts.contains("Sauce Labs Fleece Jacket")){
                getAddCarBtn.get(i).click();
                    j++;
                    if(j==1){
                        break;
                    }
            }
        }
    }


    public void selectMultipleProducts() throws IOException {
        prop = new Properties();
        FileInputStream fil = new FileInputStream("./src/test/resources/properties/products.properties");
        prop.load(fil);
        List<WebElement> productsList = getListofProducts;
        int j=0;

        for (int i = 0; i<productsList.size(); i++) {
            String nameProducts = productsList.get(i).getText();
            String[] productsSelected = {prop.getProperty("prod1"), prop.getProperty("prod3")/*, prop.getProperty("prod6")*/};
            List itemsAdded = Arrays.asList(productsSelected);

            //System.out.println(nameProducts);
            if(itemsAdded.contains(nameProducts)) {
                getAddCarBtn.get(i).click();
                //System.out.println(itemsAdded);
                j++;
                if(j==2){
                    break;
                }
            }
        }
    }
}
