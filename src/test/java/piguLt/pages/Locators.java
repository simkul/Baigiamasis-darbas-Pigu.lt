package piguLt.pages;

import org.openqa.selenium.By;

public class Locators {

    public static class PiguLt{
        public static class Cookies{
            public static By coockieBlog = By.xpath("//*[@id='cookie_block']");
            public static By coockieAceptButton = By.xpath("//button[@class='button agree']");
        }
        public static class Login{
            public static By loginForm = By.xpath("//*[@id=\"loginModal\"]/div[1]/div[1]/form");
            public static By inputEmail = By.xpath("//*[@id=\"loginModal\"]/div[1]/div[1]/form/div[2]/input");
            public static  By inputPassword = By.xpath("//*[@id=\"passwordCont\"]/input");
            public static By prisijungtiButton = By.xpath("//*[@id=\"loginModal\"]/div[1]/div[1]/form/div[5]/input");
            public static  By profilePage = By.xpath("/html/body/div[10]/div/section[2]/div/h1");
            public static By paragraphName = By.xpath("<div class=\"error-message\">Neteisingi prisijungimo duomenys</div>");
            public static By errorMessage = By.xpath ("<div class=\"error-message\">Neteisingi prisijungimo duomenys</div>");

        }
        public static class Search{
            public static By searchLine = By.xpath("//input[@id='searchInput']");
            public static By searchButton = By.xpath("//i[@class='c-icon--search']");
            public static By searchedItem = By.xpath("//*[@id='productBlock49514933']");

        }
        public static class Cart{
            public static  By waitSection = By.xpath("//*[@id=\"productPage\"]/section[1]/div[1]/div[2]/div[3]/div[5]/div[2]/div/input");
            public static By section = By.xpath("//*[@id=\"productPage\"]/section[1]/div[1]/div[2]/div[3]/div[5]/div[2]/div/input");
            public static By AddToCartButton = By.xpath("//*[@id=\"productPage\"]/section[1]/div[1]/div[2]/div[3]/div[5]/div[2]/button");
            public static By cartForm = By.xpath("//*[@id=\"modal\"]/div/div/div/div[2]");
            public static By closeButton = By.xpath("//*[@id=\"close\"]");
            public static By cartIcon = By.xpath("//*[@id=\"cartWidget\"]/a/i");
            public static By itemName = By.xpath("//div[@class='product-name']/a");

        }
        public static class GiftCard{
            public static By piguLtGiftCard = By.xpath("//*[@id='categoriesGrid']/div[2]");
            public static By waitLoadPage = By.xpath("//*[@class='site-block clearfix']");
            public static By priceWindow = By.xpath("//input[@class='price-to']");
            public static  By clickOnKuponaiPage = By.xpath("//*[@id='leafControl']//*[@class='list-section']");
            public static By aktyvusFiltraiText = By.xpath("//*[text()='Aktyvūs filtrai']");
            public static By neededGiftCard = By.xpath("//*[@id=\"productBlock8439434\"]/div/div/div[3]/a/img");
            public static By giftCardFor50Eu = By.xpath("//*[@id='gallery6388196']");
            public static By paragraphText = By.xpath("//h1[text()='El. Dovanų kuponas, €50']");

        }
    }
}
