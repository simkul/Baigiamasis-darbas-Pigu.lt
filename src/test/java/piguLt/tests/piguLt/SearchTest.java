package piguLt.tests.piguLt;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
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

    @Test
    private void testSearchinSearchLine(){
        String expectedItem = "60303 LEGO® City Advento kalendorius";
        String actualItem = null;

        SearchPage.doubleClickOnSearchLine();
        SearchPage.enterItemName(expectedItem);
        SearchPage.clickOnSearchButton();
        SearchPage.waitForSearchPageLoad();

        actualItem = SearchPage.readSearchedItemName();
        Assert.assertTrue(actualItem.contains(expectedItem),
                String.format("Actual [%s]; Expected [%s]",
                        actualItem,
                        expectedItem)
        );
    }

}
