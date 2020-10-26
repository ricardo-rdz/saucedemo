import org.testng.annotations.Test;

import java.io.IOException;

public class CheckOutPageTest extends CheckOutPageFlow {

    public CheckOutPageTest() throws IOException {
    }


    @Test
    public void errorMessageValidation(){
        cp.clickContinue();
        String getError = cp.erroMessage().getText();
        System.out.println(getError);
    }
}
