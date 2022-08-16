package Gun06.Sorular;

import _00_Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class _01_Soru extends GenelWebDriver {
    /**
     * Daha önceki derslerde yaptğımı Search fonksiyonunu
     * Mac,ipod ve samsung için Dataprovider ile yapınız.
     */
    @Test (dataProvider="aramalar")//buraya isim vererek de data providerlari eslestirebiliriz
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



    @DataProvider (name = "aramalar")
    public String[] getData(){     //*****************String ie Yaptik***********************

        String[] data={"mac" , "ipod" , "samsung"};

        return  data;
    }
}
