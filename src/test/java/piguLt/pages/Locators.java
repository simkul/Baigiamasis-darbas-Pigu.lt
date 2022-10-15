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






        }
    }
}
