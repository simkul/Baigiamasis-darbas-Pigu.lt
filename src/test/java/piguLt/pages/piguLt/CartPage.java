package piguLt.pages.piguLt;

import piguLt.pages.Common;
import piguLt.pages.Locators;

public class CartPage {
    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void acceptPrivacyConfirmation() {
        Common.waitForElementChangeVisability(Locators.PiguLt.Cookies.coockieBlog);
        Common.clickElement(Locators.PiguLt.Cookies.coockieAceptButton);
    }

    public static void clickDouble() {
        Common.doubleClickByActions(Locators.PiguLt.Cart.section);
    }
    public static void enterNeededAmount(String neededAmount) {
        Common.sendKeysToElement(neededAmount,
                Locators.PiguLt.Cart.section);
    }

    public static void clickOnAddButto() {
        Common.clickElement(Locators.PiguLt.Cart.AddToCartButton);
    }

    public static void waitForCartForm() {
        Common.waitForElementChangeVisability(Locators.PiguLt.Cart.cartForm);
    }

    public static void closeCartForm() {
        Common.clickElement(Locators.PiguLt.Cart.closeButton);
    }

    public static void clickOnCartIcon() {
        Common.clickElement(Locators.PiguLt.Cart.cartIcon);
    }

    public static void waitForCarPageLoad() {
        Common.waitForElementChangeVisability(Locators.PiguLt.Cart.cartPage);
    }

    public static String readItemName() {
        return Common.getElementText(Locators.PiguLt.Cart.itemName);
    }
}
