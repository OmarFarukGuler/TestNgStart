package Gun06.Sorular;

import _00_Utils.GenelWebDriver;
import _00_Utils.ParametreliWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _02_Soru extends ParametreliWebDriver {
    /**
     * Bir önceki task da yapılan testi PARAMETERDRIVER ile yapınız
     * sonrasında fakrlı tarayıcılar ile çalıştırınız.
     * sonrasında paralel çalıştırınız.
     */


    @Test(dataProvider="aramalar")

    void  Search(String aramalar){


        WebElement search=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='form-control input-lg']")));
        search.sendKeys(aramalar);

        WebElement searchButton=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='btn btn-default btn-lg']")));
        searchButton.click();
        String arananKelime="//a[contains(text(),'"+aramalar+"')]";
        List<WebElement> searcAll=driver.findElements(By.xpath(arananKelime));
        for (WebElement a:searcAll){
            wait.until(ExpectedConditions.visibilityOf(a));
            Assert.assertTrue(a.getText().toLowerCase().contains(aramalar));}

        WebElement search1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='form-control input-lg']")));

        search1.click();
        search1.clear();
    }



    @DataProvider(name = "aramalar")
    public Object[] getData(){

        Object[] data={"mac" , "ipod" , "samsung"};

        return  data;
    }






}
