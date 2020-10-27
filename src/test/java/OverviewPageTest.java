import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class OverviewPageTest extends OverviewPageFlow{


    public OverviewPageTest() throws IOException {
    }

    @Test
    public void finalOrderValidation(){
        Assert.assertEquals(sc.getProducts().getText(), op.getItemsAdded().getText());
        System.out.println("9th Validation: User Navigates: "+op.getTittle().getText()+" Page and Validates"+op.getItemAdded.getText()+" Product matches Product added");
    }

    @Test
    public void completePurchaseValidation(){
        op.clickFinishButton();
        String finishPageTittle = fp.getPageTittle().getText();
        Assert.assertEquals(finishPageTittle, "Finish");
        System.out.println("10th Validation: User navigates to "+finishPageTittle+" Page");
    }
}
