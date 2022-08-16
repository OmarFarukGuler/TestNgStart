package Gun02;

import _00_Utils.GenelWebDriver;
import _00_Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02Subscribe extends GenelWebDriver {
    /*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe ve UnSubscribe işlemlerini ayrı ayı testlerde yapınız.

 */
    By NewsLetter= By.linkText("Newsletter");
    By radioYes=By.cssSelector("[value='1']");
    By radioNo=By.cssSelector("[value='0']");
    By contunyue=By.cssSelector("[value='Continue']");



    @Test (priority = 1)
    void Subscribe1() {

        WebElement newsLetter = wait.until(ExpectedConditions.elementToBeClickable(NewsLetter));
        newsLetter.click();

        WebElement yesRadio = wait.until(ExpectedConditions.visibilityOfElementLocated(radioYes));
        yesRadio.click();

        WebElement contunyue1 = wait.until(ExpectedConditions.elementToBeClickable(contunyue));
        contunyue1.click();

       Tools.SuccessMessageValidation();

        WebElement newsLetter2 = wait.until(ExpectedConditions.elementToBeClickable(NewsLetter));
        newsLetter2.click();

      /*  WebElement logout = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='column-right']/div/a[13]")));
        logout.click();*/






    }

    @Test (priority = 2)
    void Subscribe2() {


        WebElement contunyue2 = wait.until(ExpectedConditions.elementToBeClickable(contunyue));
        contunyue2.click();

        WebElement newsLetter = wait.until(ExpectedConditions.elementToBeClickable(NewsLetter));
        newsLetter.click();

        WebElement noRadio = wait.until(ExpectedConditions.elementToBeClickable(radioNo));
        noRadio.click();

        WebElement contunyue3 = wait.until(ExpectedConditions.elementToBeClickable(contunyue));
        contunyue3.click();

        Tools.SuccessMessageValidation();

    }
/*3- Newsletter  üyelik işlemini, üye ise , üyelikten çıkma, değilse ekleme şeklinde yapınız*/
    @Test (priority = 3)
    void Subscribe3() {

        WebElement newsLetter3 = wait.until(ExpectedConditions.elementToBeClickable(NewsLetter));
        newsLetter3.click();

        WebElement yesRadio = wait.until(ExpectedConditions.visibilityOfElementLocated(radioYes));
        if (yesRadio.isSelected())
        { WebElement noRadio = wait.until(ExpectedConditions.elementToBeClickable(radioNo));
        noRadio.click();}
        else { WebElement yesRadio2 = wait.until(ExpectedConditions.visibilityOfElementLocated(radioYes));
        yesRadio.click();}

        WebElement contunyue3 = wait.until(ExpectedConditions.elementToBeClickable(contunyue));
        contunyue3.click();




    }
}
