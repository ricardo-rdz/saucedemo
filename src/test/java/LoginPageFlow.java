import PageClases.LoginPage;
import PageClases.ProductPage;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class LoginPageFlow extends BaseTest{
    public LoginPageFlow() throws IOException {
    }


    @BeforeMethod
    public void initialize() throws IOException {
        initializeBrowser();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("URL"));
        lp = new LoginPage(driver);
        pp = new ProductPage(driver);
        }


}
