package Gun02;

import _00_Utils.GenelWebDriver;
import _00_Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class _01_ValidateMenu extends GenelWebDriver {
    /*
        Senaryo;
        1- Siteyi açınız
        2- Top Menudeki menu elemanlarının olduğunu doğrulayınız.
     */
    @Test
    void MenuValidation(){
      /*  Assert.assertTrue(driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[1]/a")).getText().contains("Desktops"));
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[2]/a")).getText().contains("Laptops & Notebooks"));
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[3]/a")).getText().contains("Components"));
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[4]/a")).getText().contains("Tablets"));
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[5]/a")).getText().contains("Software"));
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[6]/a")).getText().contains("Phones & PDAs"));
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[7]/a")).getText().contains("Cameras"));
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[8]/a")).getText().contains("MP3 Players"));*/

        List<String> menuExpectedList=new ArrayList<>();
        menuExpectedList.add("Desktops");
        menuExpectedList.add("Laptops & Notebooks");
        menuExpectedList.add("Components");
        menuExpectedList.add("Tablets");
        menuExpectedList.add("Software");
        menuExpectedList.add("Phones & PDAs");
        menuExpectedList.add("Cameras");
        menuExpectedList.add("MP3 Players");

        By menuFinder=By.cssSelector(("ul[class='nav navbar-nav']>li"));//bunu menufinder olan yere her webelement icin yazmaktan kurtulduk
        List<WebElement> menuActualList=driver.findElements(menuFinder);

        Tools.compareToList(menuExpectedList,menuActualList);// kutuphaneye ekledik.biz olusturduk.Tools classinda





    }
}
