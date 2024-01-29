package Testig;

import POM.BaseClass;
import POM.FirstPagePOM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Testing extends BaseClass {
    /*    @Test
    //First Task Selecting The radio button with Visible text
        public void testing()
    {
        WebDriverWait wait = new WebDriverWait(BaseClass.getWebDriver(), Duration.ofMillis(5000));
        FirstPagePOM first = new FirstPagePOM();
        wait.until(ExpectedConditions.elementToBeClickable(BaseClass.getWebDriver().findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[6]/div/div[2]/div[2]/div/div[6]/div/div"))));
        first.getRadioButton("Govt. Employee").click();
    }*/
    @Test
    //Second Task Finding all Radio Buttons and Select one of them with the visible text
    public void testingSecondMethod() {
        WebDriverWait wait = new WebDriverWait(BaseClass.getWebDriver(), Duration.ofMillis(5000));
        wait.until(ExpectedConditions.elementToBeClickable(BaseClass.getWebDriver().findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[6]/div/div[2]/div[2]/div/div[6]/div/div"))));
        List<WebElement> radioButtons = BaseClass.getWebDriver().findElements(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-1loqt21.r-18u37iz.r-15d164r.r-1otgn73"));
        System.out.println("The number of the elements = " + radioButtons.size());
        int i = 0;
        for (WebElement radioButton : radioButtons) {
            WebElement label = radioButton.findElement(By.cssSelector(".css-76zvg2"));
            if (label.getText().equals("Govt. Employee")) {
                radioButton.click();
                break;
            }
        }
    }
}
