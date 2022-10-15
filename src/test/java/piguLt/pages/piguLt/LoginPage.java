package piguLt.pages.piguLt;

import org.openqa.selenium.WebElement;
import piguLt.pages.Common;
import piguLt.pages.Locators;

public class LoginPage {
    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void acceptPrivacyConfirmation() {
        Common.waitForElementChangeVisability(Locators.PiguLt.Cookies.coockieBlog);
        Common.clickElement(Locators.PiguLt.Cookies.coockieAceptButton);}


    public static void waitForLoginFormVisabilyti() {
        Common.waitForElementChangeVisability(Locators.PiguLt.Login.loginForm);
    }

    public static void enetrEmail(String insertEmail) {
        Common.sendKeysToElement(
                insertEmail,
                Locators.PiguLt.Login.inputEmail
        );
    }

    public static void enerPassword(String insertPassword) {
        Common.sendKeysToElement(
                insertPassword,
                Locators.PiguLt.Login.inputPassword
        );
    }

    public static void clickOnPrisijungtiButton() {
        Common.clickElement(Locators.PiguLt.Login.prisijungtiButton);
    }

    public static void waitForProfilePageLoad() {
        Common.waitForElementChangeVisability(Locators.PiguLt.Login.profilePage);
    }


    public static String readParafraphName() {
        return Common.getElementText(
                Locators.PiguLt.Login.paragraphName);
    }
}

