package piguLt.tests.piguLt;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import piguLt.pages.piguLt.GiftCardPage;
import piguLt.tests.TestBase;

public class GiftCardTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        GiftCardPage.open("https://pigu.lt/lt/dovanu-kuponai");
        GiftCardPage.acceptPrivacyConfirmation();
    }
    @Test
    private void testAddGiftCard(){
        String maxPrice = "50";

        GiftCardPage.clickOnPiguLtKuponai();
        GiftCardPage.waitForPiguLtKuponaiPage();
        GiftCardPage.clickOnFiltraiButton();
        GiftCardPage.doubleClickOnPrice();
        GiftCardPage.enetrMaxPrice(maxPrice);
        GiftCardPage.clickToCloseFiltrai();

    }
}
