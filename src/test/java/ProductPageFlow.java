import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class ProductPageFlow extends BaseTest {


    public ProductPageFlow() throws IOException {
    }

    String user = prop.getProperty("user");
    String psw =  prop.getProperty("pass");


    @BeforeMethod
    public void initializeFlowPP() throws IOException {
        initializeBrowser();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("URL"));
        lp = new LoginPage(driver);
        pp = new ProductPage(driver);
        sc = new ShoppingCarPage(driver);


       lp.loggin(user,psw);



    }


}
