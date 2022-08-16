package Gun02;

import _00_Utils.GenelWebDriver;
import _00_Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class _03_EditAccount extends GenelWebDriver {

    /*
      1- Siteyi açınız.
      2- Edit Account a tıklatınız.
      3- Yeni isim ve soyisim göndererek Continue yapınız.
      4- İşlem sonucunu kontrol ediniz.
      5- Bu işlemi 2 kez çalıştırarak eski haline getiriniz.
     */

    By EditAccount=By.xpath("//div[@id='content']/ul//a");
    By FirstName=By.cssSelector("[id='input-firstname']");
    By LastName=By.cssSelector("[id='input-lastname']");
    By Submit=By.cssSelector("[type='submit']");


  /*  @Test (priority = 1)
    void EditAccount_1(){

        WebElement editAccount= wait.until(ExpectedConditions.elementToBeClickable(EditAccount));
        editAccount.click();

        WebElement firstName=driver.findElement(FirstName);
      //  firstName.click();
        firstName.clear();
        firstName.sendKeys("faruk");

        WebElement lastName=driver.findElement(LastName);
      //  lastName.click();
        lastName.clear();
        lastName.sendKeys("Gular");

        WebElement submit=wait.until(ExpectedConditions.elementToBeClickable(Submit));
        submit.click();









    }
    @Test (priority = 2)
    void EditAccount_2() {

          WebElement editAccount= wait.until(ExpectedConditions.elementToBeClickable(EditAccount));
          editAccount.click();

        WebElement firstName = driver.findElement(FirstName);
       // firstName.click();
        firstName.clear();
        firstName.sendKeys("omar");

        WebElement lastName = driver.findElement(LastName);
       // lastName.click();
        lastName.clear();
        lastName.sendKeys("gular");

        WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(Submit));
        submit.click();


    }*/


    @Test
    void EditAccount(){
        editAccount("murat","kuru");
        editAccount("ahmet","canli");

    }
    void editAccount(String ad,String soyad){
        WebElement edit=driver.findElement(By.linkText("Edit Account"));
        edit.click();

        WebElement firstName=driver.findElement(By.id("input-firstname"));
        firstName.clear();
        firstName.sendKeys(ad);

        WebElement lastName=driver.findElement(By.id("input-lastname"));
        lastName.clear();
        lastName.sendKeys(soyad);

        WebElement cntBn=driver.findElement(By.cssSelector("input[value='Continue']"));
        cntBn.click();

        Tools.SuccessMessageValidation();

    }

    }
