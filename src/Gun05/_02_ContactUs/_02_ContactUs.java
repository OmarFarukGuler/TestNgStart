package Gun05._02_ContactUs;

import _00_Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _02_ContactUs extends GenelWebDriver {

    /*
  1- ContactUs a tıklayınız
  2- Mesaj kutusuna en az 10 karakterlik bir mesaj yazınız.
  3- Submit ettikten sonra Contact US yazısını doğrulayınız.
 */
    @Test
    @Parameters("messageBox")    //xml deki adi
    void ContactUss(String gelenMesaj)//method daki adi
    {
        driver.manage().window().maximize();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        WebElement contactUs=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Contact Us']")));
        contactUs.click();

        WebElement messageBox=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-enquiry")));
        messageBox.sendKeys("eksili yaprak dolmasi yedin mi?");

        WebElement submit=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='btn btn-primary']")));
        submit.click();

        WebElement continuee=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Continue']")));
        continuee.click();

        Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Your Store']")).isDisplayed());





    }
}
