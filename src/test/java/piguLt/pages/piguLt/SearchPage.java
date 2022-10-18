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
        Common.waitForElementChangeVisability(Locators.PiguLt.Search.searchLine);
        Common.doubleClickByActions(Locators.PiguLt.Search.searchLine);
    }

    public static void enterItemName(String expectedItem) {
        Common.sendKeysToElement(
                expectedItem,
                Locators.PiguLt.Search.searchLine
        );
    }

    public static void clickOnSearchButton() {
        Common.clickElement(Locators.PiguLt.Search.searchButton);
    }

    public static void waitForSearchPageLoad() {
        Common.waitForElementChangeVisability(Locators.PiguLt.Search.searchedItem);
    }

    public static String readSearchedItemName() {
        return Common.getElementText(
                Locators.PiguLt.Search.searchedItem
        );
    }
}

