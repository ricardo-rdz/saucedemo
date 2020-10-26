import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class CheckOutPageTest extends CheckOutPageFlow {

    public CheckOutPageTest() throws IOException {
    }


    @Test
    public void errorMessageValidation(){
        cp.clickContinue();
        Assert.assertTrue(cp.erroMessage().isDisplayed());
        System.out.println("7th validation: Validate error message is displayed on the user’s information page.");
    }

    @Test
    public void fillUserInfoValidation(){
        cp.fillInfo();
        cp.clickContinue();
        String overviewTittle = op.getTittle().getText();
        Assert.assertEquals(overviewTittle, "Checkout: Overview");
        System.out.println("8th Validation: The user navigates to "+overviewTittle +" Page");
    }


}
