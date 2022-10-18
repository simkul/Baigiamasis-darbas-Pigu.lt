package piguLt.pages.piguLt;

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
       Common.waitForElementChangeVisability(Locators.PiguLt.Login.inputEmail);}

    public static void enetrEmail(String insertEmail) {
        Common.waitForElementChangeVisability(Locators.PiguLt.Login.inputEmail);
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
        Common.waitForElementChangeVisability(Locators.PiguLt.Login.slapukaiPage);}


    public static void submitCookies() {
        Common.clickElement(Locators.PiguLt.Login.clickSubmitButton);
    }

    public static void clickProfileIcon() {
        Common.waitForElementChangeVisability(Locators.PiguLt.Login.profileIcon);
        Common.clickElement(Locators.PiguLt.Login.profileIcon);
    }

    public static String readParagraphName() {
        return Common.getElementText(
                Locators.PiguLt.Login.profilePage);
    }





    public static void enterWrongPasswor(String insertWrongPassword) {
        Common.sendKeysToElement(
                insertWrongPassword,
                Locators.PiguLt.Login.inputPassword);
    }

    public static void waitForErrorMassage() {
        Common.waitForElementChangeVisability(Locators.PiguLt.Login.errorMessage);
    }

    public static String readErrorMessage() {
        return Common.getElementText(
                Locators.PiguLt.Login.errorMessage);
    }
}

