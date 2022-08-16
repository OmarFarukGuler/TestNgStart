package Gun06.Sorular;

import _00_Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _03_Soru extends GenelWebDriver {
    /*
   Senaryo
   1- Siteye gidiniz
   2- Specials tiklayiniz
   3- Cikan urun sayisi ile indirimli urun sayisi ayni mi dogrulayiniz
   4- Yukarıdaki işlemden sonra her ürünün önceki fiyatının şu andaki fiyattan
      yüksek olduğunu doğrulayınız.
*/

    @Test
    void Specials(){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        WebElement special=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Specials']")));
         special.click();
         List<WebElement> urunSayisi=driver.findElements(By.cssSelector("[class='product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12']"));
         List<WebElement> oldPrice=driver.findElements(By.cssSelector("[class='price-old']"));
         List<WebElement> newPrice=driver.findElements(By.cssSelector("[class='price-new']"));

         for (int i=0;i< urunSayisi.size();i++ ){
             String onlyfigures=oldPrice.get(i).getText().replaceAll("[^\\d]","");
             String nwprice=newPrice.get(i).getText().replaceAll("[^\\d]","");

            int  oldPricefigure=Integer.parseInt(onlyfigures);
            int  newPricefigure=Integer.parseInt(nwprice);

             Assert.assertFalse(oldPricefigure == newPricefigure);
         }


    }


}
