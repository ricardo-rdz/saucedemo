import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class CheckOutPageTest extends CheckOutPageFlow {

    public CheckOutPageTest() throws IOException {
    }


    @Test(priority = 2)
    public void errorMessageValidation() {
        cp.clickContinue();
        Assert.assertTrue(cp.erroMessage().isDisplayed());
        System.out.println("7th validation: Validate error message is displayed on the user’s information page.");
    }

    @Test(dependsOnMethods = "errorMessageValidation", dataProvider = "userInfo", dataProviderClass = DataProviderClass.class)
    public void fillUserInfoValidation(String firstName, String secondName, String ZIP) {
        cp.fillInfo(firstName, secondName, ZIP);
        cp.clickContinue();
        String overviewTittle = op.getTittle().getText();
        Assert.assertEquals(overviewTittle, "Checkout: Overview");
        System.out.println("8th Validation: The user navigates to " + overviewTittle + " Page");
    }


}
