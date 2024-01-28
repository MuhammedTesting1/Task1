package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseClass {
    static WebDriver dr = new ChromeDriver();
    @BeforeTest
    static public void setUp()
    {

        dr.manage().window().maximize();
        dr.get("https://www.spicejet.com/");
    }

    public static WebDriver getWebDriver()
    {
        return dr;
    }
}
