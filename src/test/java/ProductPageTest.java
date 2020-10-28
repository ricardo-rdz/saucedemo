import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class ProductPageTest extends ProductPageFlow {


    public ProductPageTest() throws IOException {
    }

    @Test(priority = 1)
    public void navigateShoppingCarValidation() {
        pp.clickShoppingCar();
        String scTittle = sc.getTittlePage().getText();
        Assert.assertEquals(scTittle , "Your Cart");
        System.out.println("4th validation: The User navigates to " + scTittle+ " Page");
    }

    @Test(dependsOnMethods = {"navigateShoppingCarValidation"})
    public void singleProductValidation(){
        pp.selectOneProduct();
        pp.clickShoppingCar();
        String product = sc.getProducts().getText();
        Assert.assertEquals(product,"Sauce Labs Fleece Jacket");
        System.out.println("5th validation: "+product+" has been added to the shoping car");
    }

    @Test(dependsOnMethods = {"singleProductValidation"})
    public void multipleProductsValidation() throws IOException {
       pp.selectMultipleProducts();
        pp.clickShoppingCar();
        List<WebElement> product = sc.getlistofProducts();
        for (WebElement prod: product) {
            Assert.assertEquals(prod.getText(),prod.getText());
            System.out.println("6th validation: "+prod.getText()+" has been added to the shoping car");
        }
    }


    //bonus: select a random product
    @Test
    public void randomProductsValidation() throws IOException {
        pp.selectRandomProduct();
        pp.clickShoppingCar();
        List<WebElement> product = sc.getlistofProducts();
        for (WebElement prod: product) {
            Assert.assertEquals(prod.getText(),prod.getText());
            System.out.println("bonus validation: Select a Product random");
        }
    }



}
