package piguLt.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Map;

public class Driver {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void setDriver() {
        WebDriverManager.chromedriver().setup();

        driver.set(new ChromeDriver(setUpOptions()));
        driver.get().manage().deleteAllCookies();
        driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    private static ChromeOptions setUpOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=2000,3000");
        return options;
    }

    public static void close() {driver.get().quit();
    }

    public static WebDriver getDriver() {
        return driver.get();
    }
}
