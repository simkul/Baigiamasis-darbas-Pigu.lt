package piguLt.tests.piguLt;

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
    }

    @Test
    private void testAddToCartItem(){


    }
}
