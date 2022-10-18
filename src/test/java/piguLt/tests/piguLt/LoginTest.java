package piguLt.tests.piguLt;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import piguLt.pages.piguLt.LoginPage;
import piguLt.tests.TestBase;

public class LoginTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        LoginPage.open("https://pigu.lt/lt/u/login");
        LoginPage.acceptPrivacyConfirmation();
    }

    @Test
    private void testLoginWithCorrectData(){
        String insertEmail = "apallinarija@gmail.com";
        String insertPassword = "12345";
        String exeptedRezult = "Mano profilis";
        String actualRezult = null;

        LoginPage.waitForLoginFormVisabilyti();
        LoginPage.enetrEmail(insertEmail);
        LoginPage.enerPassword(insertPassword);
        LoginPage.clickOnPrisijungtiButton();
        LoginPage.waitForProfilePageLoad();
        LoginPage.submitCookies();
        LoginPage.clickProfileIcon();

        actualRezult= LoginPage.readParagraphName();

        Assert.assertTrue(actualRezult.contains(exeptedRezult),
                String.format("Actual [%s]; Expected [%s]",
                        actualRezult,
                        exeptedRezult)
        );

    }
    @Test
    private void testLoginWithWrongPassword(){
        String insertEmail = "apallinarija@gmail.com";
        String insertWrongPassword = "12346";
        String exeptedMessage = "Neteisingi prisijungimo duomenys";
        String actualMessage = null;

        LoginPage.waitForLoginFormVisabilyti();
        LoginPage.enetrEmail(insertEmail);
        LoginPage.enterWrongPasswor(insertWrongPassword);
        LoginPage.clickOnPrisijungtiButton();
        LoginPage.waitForErrorMassage();

        actualMessage = LoginPage.readErrorMessage();
        Assert.assertTrue(actualMessage.contains(exeptedMessage),
                String.format("Actual [%s]; Expected [%s]",
                        actualMessage,
                        exeptedMessage)
        );
    }


}
