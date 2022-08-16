package _00_Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Tools {
    public static void compareToList(List<String> menuExpectedList,List<WebElement> menuActualList){

        for (int i = 0; i < menuExpectedList.size(); i++) {
            Assert.assertEquals(menuExpectedList.get(i),(menuActualList.get(i).getText()));
        }
    }
    public static void SuccessMessageValidation(){

         WebElement success=GenelWebDriver.driver.findElement(By.xpath("//*[@class='alert alert-success alert-dismissible']"));
         Assert.assertTrue(success.getText().contains("Success"));

    }
}
