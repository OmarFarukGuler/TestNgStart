package _00_Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ParametreliWebDriver {
    public WebDriver driver;
    public static WebDriverWait wait;
    @Parameters("browser")
    @BeforeClass
    public void BaslangicIslemleri(String browser) {

        System.out.println("Driver  start ...");//konsolda da en basta bu cikar
        Logger logger = Logger.getLogger("");//konsolda surekli gorunen fazlaliklari siler
        logger.setLevel(Level.SEVERE);

        if (browser.equalsIgnoreCase("chrome")){
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();}

        else if (browser.equalsIgnoreCase("firefox"))
        {
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }

        //driver.manage().window().maximize();//max
        driver.manage().deleteAllCookies();
        //  Duration dr=Duration.ofSeconds(30);

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));//sadece ana sayfa yuklenirken en basta
        driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(10)));//butun webElement icin gecerli


        driver.get("http://opencart.abstracta.us/index.php?route=account/login");
        driver.manage().window().maximize();

    }

   /*   @AfterMethod
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

        // driver.get("http://opencart.abstracta.us/index.php?route=account/login");

        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='input-email']")));
        email.sendKeys("gul@gmail.com");

        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='input-password']")));
        password.sendKeys("gul12345");

        WebElement submit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[type='submit']")));
        submit.click();
        // Assert.assertTrue(driver.findElement(By.cssSelector("[id='content']>h2")).getText().contains("My Account"));
        //assert ekle
    }

    public static void Bekle(int saniye) {

        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
