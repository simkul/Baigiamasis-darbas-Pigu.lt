package piguLt.pages;

import piguLt.utils.Driver;

public class Common {

    public static void setUpDriver() {Driver.setDriver();}

    public static void closeDriver() {
        Driver.close();
    }

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }
}
