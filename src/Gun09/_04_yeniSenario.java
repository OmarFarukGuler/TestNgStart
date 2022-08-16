package Gun09;

import Gun09._02_POM;

import _00_Utils.GenelWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _04_yeniSenario extends GenelWebDriver {

    @Test(dataProvider = "getData2")
    void addToCart(String email, String password) {
        _02_POM e = new _02_POM(driver);

        e.singIn.click();
        e.eMail.sendKeys(email);
        e.password.sendKeys(password);
        e.submit.click();
        e.homePage.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,900)");
        e.img.click();
//        driver.switchTo().frame(1);
        e.addToCart.click();
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,900)");
        e.proceed1.click();
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("window.scrollBy(0,900)");
        e.proceed2.click();
        e.proceed3.click();
        e.terms.click();
        e.proceed4.click();
        e.bankWire.click();
        e.confirm.click();
        Assert.assertTrue(e.validateText.getText().contains("Your order on My Store is complete"));

    }

    @DataProvider
    public Iterator<Object[]> getData2() {

        List<Object[]> data = new ArrayList<>();

        data.add(new Object[]{"omercavci@gmail.com", "272520"});


        return data.iterator();
    }
}