package piguLt.pages;

import org.openqa.selenium.By;

public class Locators {

    public static class PiguLt{
        public static class Cookies{
            public static By coockieBlog = By.xpath("//*[@id='cookie_block']");
            public static By coockieAceptButton = By.xpath("//*[@id=\"cookie_block\"]/div/div/div[2]/button");
        }
        public static class Login{
            public static By loginForm = By.xpath("//*[@id=\"loginModal\"]/div[1]/div[1]/form");
            public static By inputEmail = By.xpath("//*[@id=\"loginModal\"]/div[1]/div[1]/form/div[2]/input");
            public static  By inputPassword = By.xpath("//*[@id=\"passwordCont\"]/input");
            public static By prisijungtiButton = By.xpath("//*[@id=\"loginModal\"]/div[1]/div[1]/form/div[5]/input");
            public static  By profilePage = By.xpath("/html/body/div[10]/div/section[2]/div/h1");
            public static By paragraphName = By.xpath("/html/body/div[10]/div/section[2]/div/h1");
            public static By errorMessage = By.xpath ("<div class=\"error-message\">Neteisingi prisijungimo duomenys</div>");

        }
        public static class Search{
            public static By doubleClick = By.xpath("//*[@id=\"searchInput\"]");
            public static By inputItemname = By.xpath("//*[@id=\"searchInput\"]");
            public static By searchButton = By.xpath("//*[@id=\"main-search-form\"]/button[2]/i");
            public static By searchedItem = By.xpath("//*[@id=\"productBlock49514933\"]/div/div/div[4]");
            public static By loadednNewPage = By.xpath("//*[@id=\"galleryThumbnails44424153\"]/div[2]/div/div[1]/div/img");
            public static By searchedItemName = By.xpath("//*[@id=\"productPage\"]/section[1]/div[1]/h1");
        }
        public static class Cart{
            public static By section = By.xpath("//*[@id=\"productPage\"]/section[1]/div[1]/div[2]/div[3]/div[5]/div[2]/div/input");
            public static By AddToCartButton = By.xpath("//*[@id=\"productPage\"]/section[1]/div[1]/div[2]/div[3]/div[5]/div[2]/button");
            public static By cartForm = By.xpath("//*[@id=\"modal\"]/div/div/div/div[2]");
            public static By closeButton = By.xpath("//*[@id=\"close\"]");
            public static By cartIcon = By.xpath("//*[@id=\"cartWidget\"]/a/i");
            public static By cartPage = By.xpath("//*[@id=\"sliceBlock124274801\"]");
            public static By itemName = By.xpath("//*[@id=\"productSliceBlock363493696\"]/td[2]/div[1]");




        }
    }
}
