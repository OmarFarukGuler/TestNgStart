package Gun07;

import _00_Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _02_PlaceOrder extends GenelWebDriver {

    /*
   Senaryo :
   1- Siteyi açınız.
   2- Sitede "ipod" kelimesini aratınız
   3- Çıkan sonuçlardan ilkini sepete atınız.
   4- Shopping Chart a tıklatınız.
   5- Checkout yapınız.
   6- Continue butonalarına tıklatıp bilgileri giriniz.
   7- En confirm ile siparişi verdiğinizi doğrulayınız.
      doğrulamayı çıkan sayfadaki "Your order has been placed" yazısı ile yapınız.
*/

    @Test
    void ProceedToCheckout(){
        WebElement searchBox=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='form-control input-lg']")));
        searchBox.sendKeys("ipod");

        WebElement searchButton=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='btn btn-default btn-lg']")));
        searchButton.click();

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        List<WebElement> adToCart=driver.findElements(By.xpath("//span[contains(text(),'Add to Cart')]"));
        adToCart.get(0).click();
       // WebElement adToCard=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Add to Cart')]")));
       // adToCard.click();

        WebElement checkout=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Checkout')]")));
        checkout.click();

        WebElement continyu1=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id='button-payment-address']")));
        continyu1.click();

        WebElement continyu2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='button-shipping-address']")));
        continyu2.click();

        WebElement continyu3=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='button-shipping-method']")));
        continyu3.click();

        WebElement agree=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[name='agree']")));
        agree.click();

        WebElement continyu4=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='button-payment-method']")));
        continyu4.click();

        WebElement confirm=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='button-confirm']")));
        confirm.click();

        Assert.assertTrue(driver.findElement(By.xpath("//div/p[contains(text(),'Thanks for shopping with us online!')]")).getText().contains("Thanks for shopping with us online!"));






    }



}
