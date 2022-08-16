package Gun08;

import Gun07.POM.PlaceOrderElements;
import _00_Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _01_Soru extends GenelWebDriver {
/*
    Senaryo ;
    1- Siteye gidiniz..
   2- "ipod" ürününü aratınız."ipod" u xml den gönderiniz
   3- çıkan elamnlardan random bir elelamnı Add Wish butonuna tıklayınız.
   4- Daha sonra WishList e tıklatınız
   5- Burada çıkan ürünle tıklanan ürünün isminin aynı olup olmadığını doğrulayınız.
 */
    @Parameters ("addWish")
    @Test
    void Ipod(String aranacakUrun){
        PlaceOrderElements e=new PlaceOrderElements(driver);

        driver.manage().window().maximize();
        e.searchBox.sendKeys("ipod");
        wait.until(ExpectedConditions.visibilityOf(e.searchBox));
        e.searchButton.click();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        int a=(int) (Math.random()*e.addWish.size());
       // System.out.println("a = " + a);
        //System.out.println(e.addWish.get(a).getText());
      //  wait.until(ExpectedConditions.elementToBeClickable((By) e.addWish));
      // Bekle(2);

      /*  if(a==0)
            a=a+1;*/
       // e.addWish.get(a).click();
       e.addWish.get(a).click();
       // wait.until(ExpectedConditions.elementToBeClickable((By) e.addWish.get(a)));
        //e.addWish.get(0).click();
      //  System.out.println(e.addWish.get(a).getText());


        Bekle(2);
        e.wishList.click();




      /*  wait.until(ExpectedConditions.elementToBeClickable(e.wishList));
        e.wishList.click();*/

        //wait.until(ExpectedConditions.elementToBeClickable((By) e.imgTitleIpod));

        System.out.println(e.urunName.get(a).getText());
        System.out.println(e.imgTitleIpod.get(e.imgTitleIpod.size()-1).getAttribute("alt"));
        Assert.assertEquals(e.urunName.get(a).getText(),e.imgTitleIpod.get(a).getAttribute("alt"));


    }



}
