package piguLt.tests.piguLt;

import org.testng.annotations.BeforeMethod;
import piguLt.pages.piguLt.LoginPage;
import piguLt.tests.TestBase;

public class LoginTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        LoginPage.open("https://pigu.lt/lt/u/login");
    }
}
