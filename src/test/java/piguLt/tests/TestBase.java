package piguLt.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import piguLt.pages.Common;
import piguLt.utils.TestListener;

@Listeners(TestListener.class)
public class TestBase {
    @BeforeMethod
    public void setUp() {
        Common.setUpDriver();
    }

    @AfterMethod
    public void tearDown() {
        Common.closeDriver();
    }

}
