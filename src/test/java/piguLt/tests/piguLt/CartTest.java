package piguLt.tests.piguLt;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import piguLt.pages.piguLt.CartPage;
import piguLt.tests.TestBase;

public class CartTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        CartPage.open("https://pigu.lt/lt/kvepalai-pigiau/kvepalai-moterims/tualetinis-vanduo-dolce-gabbana-3-limperatrice-edt?id=538670");
        CartPage.acceptPrivacyConfirmation();
    }

    @Test
    private void testAddToCartItem(){
        String neededAmount = "1";
        String expectedItem = "Tualetinis vanduo Dolce & Gabbana 3 L'Imperatrice EDT moterims 100 ml";
        String actualItem = null;


        CartPage.waitForPriceWindow();
        CartPage.clickDouble();
        CartPage.enterNeededAmount(neededAmount);
        CartPage.clickOnAddButto();
        CartPage.waitForCartForm();
        CartPage.closeCartForm();
        CartPage.clickOnCartIcon();

        actualItem = CartPage.readItemName();

        Assert.assertTrue(actualItem.contains(expectedItem),
                String.format("Actual [%s]; Expected [%s]",
                        actualItem,
                        expectedItem)
        );
    }
}
