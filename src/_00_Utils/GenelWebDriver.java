package _00_Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GenelWebDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;


    @BeforeClass
    public void BaslangicIslemleri() {
        System.out.println("Driver  start ...");//konsolda da en basta bu cikar
        Logger logger = Logger.getLogger("");//konsolda gereksizlerin silinmesi icin
        logger.setLevel(Level.SEVERE);

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();//max
        driver.manage().deleteAllCookies();
        //  Duration dr=Duration.ofSeconds(30);

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));//sadece ana sayfa yuklenirken en basta
        driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(15)));//butun webElement icin gecerli




        driver.get("http://opencart.abstracta.us/index.php?route=account/login");
        driver.manage().window().maximize();



    }

     /* @AfterMethod
      public void BekleKapat()
      {
          try {
              Thread.sleep(2000);
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
          driver.quit();
      }*/


    @BeforeClass
    public void Ornek_1() {



        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='input-email']")));
        email.sendKeys("gul@gmail.com");

        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='input-password']")));
        password.sendKeys("gul12345");

        WebElement submit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[type='submit']")));

        submit.click();

    }

    public static void Bekle(int saniye) {

        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
//***************************************Maven************************************************************
//*************************************org.testng:testng:6.14.3*********************************************