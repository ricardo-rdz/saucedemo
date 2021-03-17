import PageClases.BasePage;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest extends BasePage {


    public BaseTest() throws IOException {
        prop = new Properties();
        FileInputStream fil = new FileInputStream("./src/test/resources/properties/data.properties");
        prop.load(fil);

        }


    @Before
    // method to select the browser to use
    public WebDriver initializeBrowser() throws IOException {

         String browserName = prop.getProperty("browser");


        switch (browserName) {
            case "chrome":

                System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
                driver = new ChromeDriver();

                break;
            case "firefox":

                System.setProperty("webdriver.gecko.driver", "./src/test/resources/drivers/geckodriver.exe");
                driver = new FirefoxDriver();

                break;
            case "IE":

                System.setProperty("webdriver.ie.driver", "./src/test/resources/drivers/IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                break;

            case "edge":

                System.getProperty("webdriver.edge.driver", "./src/test/resources/drivers/msedgedriver.exe");
                driver = new EdgeDriver();
                break;
        }


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        return driver;
    }




   /* @AfterMethod
    public void closeWindow(){
        driver.close();
    }*/
}
