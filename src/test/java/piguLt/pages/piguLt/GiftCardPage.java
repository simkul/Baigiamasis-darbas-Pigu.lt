package piguLt.pages.piguLt;

import piguLt.pages.Common;
import piguLt.pages.Locators;

public class GiftCardPage {
    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void acceptPrivacyConfirmation() {
        Common.waitForElementChangeVisability(Locators.PiguLt.Cookies.coockieBlog);
        Common.clickElement(Locators.PiguLt.Cookies.coockieAceptButton);
    }

    public static void waitForPage() {
        Common.waitForElementChangeVisability(Locators.PiguLt.GiftCard.piguLtGiftCard);
    }

    public static void clickOnPiguLtKuponai() {
        Common.clickElement(Locators.PiguLt.GiftCard.piguLtGiftCard);
    }

    public static void waitForPiguLtKuponaiPage() {
        Common.waitForElementChangeVisability(Locators.PiguLt.GiftCard.waitLoadPage);
    }


    public static void doubleClickOnPrice() {
        Common.doubleClickByActions(Locators.PiguLt.GiftCard.priceWindow);
    }

    public static void enetrMaxPrice(String maxPrice) {
        Common.sendKeysToElement(
                maxPrice,
                Locators.PiguLt.GiftCard.priceWindow);
    }

    public static void waitForGiftCardPage() {
        Common.waitForElementChangeVisability(Locators.PiguLt.GiftCard.aktyvusFiltraiText);
    }

    public static void clickOnNeededGiftCard() {
        Common.clickElement(Locators.PiguLt.GiftCard.neededGiftCard);
    }

    public static void waitFor50EUGifCardPageLoad() {
        Common.waitForElementChangeVisability(Locators.PiguLt.GiftCard.giftCardFor50Eu);
    }

    public static String readGiftCardName() {
        return Common.getElementText(Locators.PiguLt.GiftCard.paragraphText);
    }

    public static void clickOnPage() {
        Common.clickElement(Locators.PiguLt.GiftCard.clickOnKuponaiPage);
    }
}
