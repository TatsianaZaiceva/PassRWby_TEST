package PassRwBy.tests.ui.set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DriverSet {
    public static WebDriver driver;
    public static WebDriver createDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--remote-allow-origins=*", "--incognito");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(27));
        return driver;
    }
    public static void closeDriver() {
        driver.quit();
        driver = null;
    }
}
