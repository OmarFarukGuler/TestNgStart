package Gun10Tekrarlar._01_Tekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class WebDriver1 {
    public WebDriver driverr;
    public static WebDriverWait waitt;


    @Parameters ("drivers")
    @BeforeClass

    public void BaslangicIslemlerii(String drivers){


        if (drivers.equalsIgnoreCase("chrome")){
            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            driverr =new ChromeDriver();}
        else {if (drivers.equalsIgnoreCase("firefox")){
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
            System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
            driverr=new FirefoxDriver();}
        }



        waitt = new WebDriverWait(driverr, Duration.ofSeconds(30));
            driverr.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
            driverr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driverr.manage().deleteAllCookies();
            driverr.get("https://campus.techno.study/");

        driverr.manage().window().maximize();



    }

    @AfterMethod
    void Kapat(){
        driverr.quit();
    }


}
