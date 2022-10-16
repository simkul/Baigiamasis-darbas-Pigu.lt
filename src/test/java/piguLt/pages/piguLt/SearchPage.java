package piguLt.pages.piguLt;

import piguLt.pages.Common;
import piguLt.pages.Locators;

public class SearchPage {
    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void acceptPrivacyConfirmation() {
        Common.waitForElementChangeVisability(Locators.PiguLt.Cookies.coockieBlog);
        Common.clickElement(Locators.PiguLt.Cookies.coockieAceptButton);
    }

    public static void doubleClickOnSearchLine() {
        Common.doubleClickByActions(Locators.PiguLt.Search.doubleClick);
    }

    public static void enterItemName(String expectedItem) {
        Common.sendKeysToElement(
                expectedItem,
                Locators.PiguLt.Search.inputItemname
        );
    }

    public static void clickOnSearchButton() {
        Common.clickElement(Locators.PiguLt.Search.searchButton);
    }

    public static void waitForSearchPageLoad() {
        Common.waitForElementChangeVisability(Locators.PiguLt.Search.searchedItem);
    }

    public static void clickOnSearchedItem() {
        Common.doubleClickByActions(Locators.PiguLt.Search.searchedItem);

    }

    public static void waitForItemPageLoad() {
        Common.waitForElementChangeVisability(Locators.PiguLt.Search.loadednNewPage);
    }

    public static String readSearchedItemName() {
        return Common.getElementText(
                Locators.PiguLt.Search.searchedItemName
        );
    }
}

