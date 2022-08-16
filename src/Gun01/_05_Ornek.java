package Gun01;

import _00_Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _05_Ornek extends GenelWebDriver {
   //butun webElement icin gecerli

  /*  @AfterClass
    void BitisIslemleri(){
        System.out.println("Driver stop ...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }*/


    /*
       Senaryo ;
         1- http://opencart.abstracta.us/index.php?route=account/login  sitesini açınız.
         2- omar@gmail.com  ve 12345   bilgileri ile login olan test metodunu yazınız.
         3- Login olup olmadığınızı assert ile kontrol ediniz.

     */
  //  @Test (enabled = false)
   /* void Ornek_1(){

       // driver.get("http://opencart.abstracta.us/index.php?route=account/login");

        WebElement email=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='input-email']")));
        email.sendKeys("omar@gmail.com");

        WebElement password=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='input-password']")));
        password.sendKeys("12345");

        WebElement submit=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[type='submit']")));
        submit.click();
        Assert.assertTrue(driver.findElement(By.cssSelector("[id='content']>h2")).getText().contains("My Account"));
        //assert ekle
    }*/
}
