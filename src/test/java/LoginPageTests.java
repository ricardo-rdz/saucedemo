import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;


public class LoginPageTests extends LoginPageFlow{


    public LoginPageTests() throws IOException {
    }

    //Login with a valid user
    @Test(priority = 0,dataProvider = "authenticationData", dataProviderClass = DataProviderClass.class)
    public void ValidUserValidation(String UserID, String Password)   {
        lp.loggin(UserID, Password);
        String ppTittle = pp.getTittlePage().getText();
        Assert.assertEquals(ppTittle , "Products");
       System.out.println("1st validation: The User navigates to " + ppTittle + " Page");
    }

     //Login with a invalid user
    @Test(dependsOnMethods = {"ValidUserValidation"},dataProvider = "wrongData", dataProviderClass = DataProviderClass.class)
    public void InvalidUserValidation(String UserID, String Password)   {
       lp.loggin(UserID, Password);
       Assert.assertTrue(lp.getErrorMessage().isDisplayed());
        System.out.println("2nd validation: The User navigates with wrong userName ");
    }

    //Logout from Products Page
    @Test(dependsOnMethods = {"InvalidUserValidation"},dataProvider = "authenticationData", dataProviderClass = DataProviderClass.class)
    public void logoutValidation(String UserID, String Password)   {
        lp.loggin(UserID, Password);
        pp.logout();
        Assert.assertTrue(lp.getBot().isDisplayed());
        System.out.println("3er Validation: Validate the user navigates to the login page");
    }



}
