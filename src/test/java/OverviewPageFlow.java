import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class OverviewPageFlow extends BaseTest{
    String user = prop.getProperty("user");
    String psw =  prop.getProperty("pass");

    public OverviewPageFlow() throws IOException {
    }

    @BeforeMethod
    public void initializeFlowPP() throws IOException {
        initializeBrowser();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("URL"));
        lp = new LoginPage(driver);
        pp = new ProductPage(driver);
        sc = new ShoppingCarPage(driver);
        cp = new CheckOutPage(driver);
        op = new OverviewPage(driver);
        fp = new FinishPage(driver);


        lp.loggin(user,psw);
        pp.selectOneProduct();
        pp.clickShoppingCar();
        sc.clickCheckoutBtn();
        cp.fillInfo();
        cp.clickContinue();

    }
}
