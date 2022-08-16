package Gun05._05_Search_Cros_Browser;

import _00_Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _01_SearchFunctionalityCrome extends GenelWebDriver {

    /*
       Senaryo ;
       1- Siteyi açınız.
       2- mac kelimeini göndererek aratınız.
       3- Çıkan sonuçlarda mac kelimesinin geçtiğini doğrulayınız.
       4- aynı işlemi samsung için de yapınız
     */
    @Parameters("search")
    @Test
    void SearchFunctionality(String value){//xml den parametre gonderiyoruz

        WebElement search=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='form-control input-lg']")));
        search.sendKeys(value);

        WebElement searchButton=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='btn btn-default btn-lg']")));
        searchButton.click();
        String arananKelime="//a[contains(text(),'"+value+"')]";
        List<WebElement> searcAll=driver.findElements(By.xpath(arananKelime));
        for (WebElement a:searcAll){
            wait.until(ExpectedConditions.visibilityOf(a));
            Assert.assertTrue(a.getText().toLowerCase().contains(value));}
    }

  /*  @Test
    void SearchSamsungToo(){
        WebElement search=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='form-control input-lg']")));
        search.clear();
        search.sendKeys("samsung");

        WebElement searchButton=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='btn btn-default btn-lg']")));
        searchButton.click();

        List<WebElement> searcAll=driver.findElements(By.xpath("//a[contains(text(),'samsung')]"));
        for (WebElement a:searcAll){
            wait.until(ExpectedConditions.visibilityOf(a));
            Assert.assertTrue(a.getText().toLowerCase().contains("samsung"));}


    }*/

}
