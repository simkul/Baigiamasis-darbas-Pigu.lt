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

    public static void clickOnPiguLtKuponai() {
        Common.clickElement(Locators.PiguLt.GiftCard.piguLtGiftCard);
    }

    public static void waitForPiguLtKuponaiPage() {
        Common.waitForElementChangeVisability(Locators.PiguLt.GiftCard.waitLoadPage);
    }

    public static void clickOnFiltraiButton() {
        Common.clickElement(Locators.PiguLt.GiftCard.filtraiButto);
    }

    public static void doubleClickOnPrice() {
        Common.doubleClickByActions(Locators.PiguLt.GiftCard.priceWindow);
    }

    public static void enetrMaxPrice(String maxPrice) {
        Common.sendKeysToElement(
                maxPrice,
                Locators.PiguLt.GiftCard.priceWindow);
    }

    public static void clickToCloseFiltrai() {
        Common.clickElement(Locators.PiguLt.GiftCard.closeButton);
    }

    public static void waitForFiltraiPage() {
        Common.waitForElementChangeVisability(Locators.PiguLt.GiftCard.filtraiPage);
    }

    public static void waitForGiftCardPage() {
        Common.waitForElementChangeVisability(Locators.PiguLt.GiftCard.aktyvusFiltraiText);
    }

    public static void clickOnNeededGiftCsrd() {
        Common.clickElement(Locators.PiguLt.GiftCard.needeGiftCard);
    }

    public static void waitFor50EUGifCardPageLoad() {
        Common.waitForElementChangeVisability(Locators.PiguLt.GiftCard.giftCardFor50Eu);
    }
}
