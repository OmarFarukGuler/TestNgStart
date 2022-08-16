package Gun10Tekrarlar._02_Tekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class WebDriver2 {

    public WebDriver driver2;
    public static WebDriverWait wait2;


    @Parameters ("driver2")
    @BeforeClass
    public void BaslangicIslemleri2(String driver){
        if (driver.equalsIgnoreCase("chrome")){
            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            driver2=new ChromeDriver();
        }
        else if (driver.equalsIgnoreCase("firefox")){
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver2 = new FirefoxDriver();

        }

        driver2.manage().deleteAllCookies();
        wait2=new WebDriverWait(driver2, Duration.ofSeconds(30));
        driver2.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver2.get("https://campus.techno.study/");
        driver2.manage().window().maximize();

    }



    @AfterMethod
    public void BekleKapat()
    {
try {
    driver2.quit();
}catch (Exception e){
    System.out.println("e = " + e);
}

    }



}
