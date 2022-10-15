package piguLt.tests.piguLt;

import org.testng.annotations.BeforeMethod;
import piguLt.pages.piguLt.SearchPage;
import piguLt.tests.TestBase;

public class SearchTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        SearchPage.open("https://pigu.lt/lt/");
        SearchPage.acceptPrivacyConfirmation();
    }

}
