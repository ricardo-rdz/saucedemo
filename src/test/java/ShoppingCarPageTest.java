import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class ShoppingCarPageTest extends ShoppingCarPageFlow{


    public ShoppingCarPageTest() throws IOException {
    }


    @Test
    public void validateErrorMessage(){
        sc.clickCheckoutBtn();
        String checkOutTittle = cp.getTittlePage().getText();
        Assert.assertEquals(checkOutTittle, "Checkout: Your Information");
      }
}
