package Gun05._03_SearchFunctionality;

import _00_Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _01_SearchFunctionality extends GenelWebDriver {

    /*
       Senaryo ;
       1- Siteyi açınız.
       2- mac kelimeini göndererek aratınız.
       3- Çıkan sonuçlarda mac kelimesinin geçtiğini doğrulayınız.
       4- aynı işlemi samsung için de yapınız
     */
    @Parameters("search")
    @Test
    void SearchFunctionality(){

        WebElement search=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='form-control input-lg']")));
        search.sendKeys("mac");

        WebElement searchButton=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='btn btn-default btn-lg']")));
        searchButton.click();

        List<WebElement> searcAll=driver.findElements(By.xpath("//a[contains(text(),'mac')]"));
        for (WebElement a:searcAll){
            wait.until(ExpectedConditions.visibilityOf(a));
            Assert.assertTrue(a.getText().toLowerCase().contains("mac"));}
    }

    @Parameters("samsam")
    @Test
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


    }

}
