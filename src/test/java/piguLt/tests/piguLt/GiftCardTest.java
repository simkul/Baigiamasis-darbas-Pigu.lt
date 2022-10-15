package piguLt.tests.piguLt;

import org.testng.annotations.BeforeMethod;
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
}
