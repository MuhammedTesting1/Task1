package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static POM.BaseClass.dr;

public class FirstPagePOM {
    public WebElement getRadioButton(String radioButtonVisibleText) {
        return dr.findElement(By.xpath(String.format("//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-15d164r r-1otgn73' and .//*[normalize-space(text())='%s']]", radioButtonVisibleText)));
    }
    public void gettingAllRadioButtons()
    {
        // Click the radio button
            // You can add additional logic here if needed
    }

}
