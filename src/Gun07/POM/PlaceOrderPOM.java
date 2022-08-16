package Gun07.POM;

import _00_Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class PlaceOrderPOM extends GenelWebDriver {
    @Test
    void ProceedToCheckout(){

        PlaceOrderElements e=new PlaceOrderElements(driver);

        driver.manage().window().maximize();
        e.searchBox.sendKeys("ipod");
        wait.until(ExpectedConditions.visibilityOf(e.searchBox));
        e.searchButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(e.searchButton));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        e.checkout.click();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        wait.until(ExpectedConditions.elementToBeClickable(e.checkout));
        e.continyu1.click();
        wait.until(ExpectedConditions.elementToBeClickable(e.continyu1));
        e.continyu2.click();
        wait.until(ExpectedConditions.elementToBeClickable(e.continyu2));



        e.continyu3.click();
        wait.until(ExpectedConditions.elementToBeClickable(e.continyu3));

        e.agree.click();
        wait.until(ExpectedConditions.elementToBeClickable(e.agree));

       /* e.cashonly.click();
        wait.until(ExpectedConditions.elementToBeClickable(e.cashonly));*/

        e.continyu4.click();
        wait.until(ExpectedConditions.elementToBeClickable(e.continyu4));
        e.confirm.click();
        wait.until(ExpectedConditions.elementToBeClickable(e.confirm));
        Assert.assertTrue(driver.findElement(By.xpath("//div/p[contains(text(),'Thanks for shopping with us online!')]")).getText().contains("Thanks for shopping with us online!"));






    }
}
