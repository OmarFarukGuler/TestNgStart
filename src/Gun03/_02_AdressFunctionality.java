package Gun03;

import _00_Utils.GenelWebDriver;
import _00_Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class _02_AdressFunctionality extends GenelWebDriver {

    /*
          Senaryo;
          1- Siteyi açınız.
          2- Adress Ekleyiniz.
         3- En son eklenen adresi edit yaparak ad ve soyadı değiştirip kaydediniz.
       4- En son eklenen adresi siliniz.
    */
    @Test
    void AdressAdd() {

        WebElement addressBook= driver.findElement(By.linkText("Address Book"));
        addressBook.click();

        WebElement newAdress = driver.findElement(By.xpath("//a[contains(text(),'New Address')]"));
        newAdress.click();

        WebElement firstName = driver.findElement(By.cssSelector("[name='firstname']"));
        firstName.sendKeys("hayrettincim");

        WebElement lastName = driver.findElement(By.cssSelector("[name='lastname']"));
        lastName.sendKeys("karalarinkiler");

        WebElement company = driver.findElement(By.cssSelector("[name='company']"));
        company.sendKeys("Karalar Company");

        WebElement adres_1 = driver.findElement(By.cssSelector("[name='address_1']"));
        adres_1.sendKeys("Istanbul");

        WebElement adres_2 = driver.findElement(By.cssSelector("[name='address_2']"));
        adres_2.sendKeys("Istanbul Uskudar");

        WebElement city = driver.findElement(By.cssSelector("[name='city']"));
        city.sendKeys("Istanbul City");

        WebElement postaKodu = driver.findElement(By.cssSelector("[name='postcode']"));
        postaKodu.sendKeys("34589");

        WebElement country = driver.findElement(By.cssSelector("[name='country_id']"));
        Select select = new Select(country);
        select.selectByValue("215");

        WebElement region = driver.findElement(By.cssSelector("[name='zone_id']"));
        Select select1 = new Select(region);
        select1.selectByValue("3354");

        WebElement defadres = driver.findElement(By.cssSelector("label [name='default'][value='0']"));
        defadres.click();

        WebElement continuee = driver.findElement(By.cssSelector("[value='Continue']"));
        continuee.click();





    }

    @Test  (dependsOnMethods = {"AdressAdd"})
    void editAdress() {

       /* WebElement account=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Account']")));
        account.click();

        WebElement adressBook = driver.findElement(By.xpath("//div[@id='content']/ul/li[3]/a"));
        adressBook.click();
*/


        List<WebElement> edit = driver.findElements(By.xpath("//a[contains(text(),'Edit')]"));
        WebElement sonEdit=edit.get(0);
       sonEdit.click();
/*
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");*/

      /* WebElement edit = driver.findElement(By.linkText("Edit"));
       edit.click();*/


        WebElement firstName1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='firstname']")));
        firstName1.clear();
        firstName1.sendKeys("selman");

        WebElement lastName1 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[name='lastname']")));
        lastName1.clear();
        lastName1.sendKeys("kocak");


        WebElement country1 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[name='country_id']")));
        Select select0 = new Select(country1);
        select0.selectByValue("215");

        WebElement region1 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[name='zone_id']")));
        Select select2 = new Select(region1);
        select2.selectByValue("3354");


        WebElement continuee1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[value='Continue']")));
        continuee1.click();
    }

      /*  Bekle(3);
        List<WebElement> delete1 = driver.findElements(By.xpath("//a[text()='Delete']"));
        WebElement sonDelete = delete1.get(delete1.size() - 2);
        Bekle(2);
        sonDelete.click();*/




    @Test (dependsOnMethods = {"editAdress"})
    void deleteAddress() {

        // WebElement addressBook= driver.findElement(By.linkText("Address Book"));
        // addressBook.click();

        Bekle(3);
        List<WebElement> deleteAll = driver.findElements(By.xpath("//a[contains(text(),'Delete')]"));
       WebElement sonDelete= deleteAll.get(deleteAll.size() - 1);
         sonDelete.click();


    }
}
  /*  @Test
    void adSoyadDegistir() {
        WebElement adressBook=driver.findElement(By.xpath("//div[@id='content']/ul/li[3]/a"));
        adressBook.click();

        Bekle(3);
        WebElement edit = driver.findElement(By.xpath("//a[contains(text(),'Edit')]"));
        edit.click();

        WebElement firstName1 = driver.findElement(By.cssSelector("[name='firstname']"));
        firstName1.clear();
        firstName1.sendKeys("hayrettincim");

        WebElement lastName1 = driver.findElement(By.cssSelector("[name='lastname']"));
        lastName1.clear();
        lastName1.sendKeys("karalarinkiler");

        WebElement continuee1 = driver.findElement(By.cssSelector("[value='Continue']"));
        continuee1.click();*/

      /*  WebElement delete=driver.findElement(By.cssSelector("//a[contains(text(),'Delete')]"));
        delete.click();
         wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//a[contains(text(),'Delete')]")));
        WebElement delete1=driver.findElement(By.cssSelector("//a[contains(text(),'Delete')]"));
        delete.click();
         wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//a[contains(text(),'Delete')]")));
        WebElement delete2=driver.findElement(By.cssSelector("//a[contains(text(),'Delete')]"));
        delete.click();*/



