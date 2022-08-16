package Gun10Tekrarlar._04_Tekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class WebDriver3 {
   public WebDriver driver3;
    public static WebDriverWait wait3;
    @BeforeClass
    @Parameters ("driver")
    void GenelWebDeneme3(String driver){

        if (driver.equalsIgnoreCase("chrome")){
            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            driver3=new ChromeDriver();
        }
        else if (driver.equalsIgnoreCase("firefox")){

            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver3 = new FirefoxDriver();
        }

        wait3=new WebDriverWait(driver3,Duration.ofSeconds(30));
        driver3.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver3.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver3.manage().deleteAllCookies();
        driver3.get("https://campus.techno.study/");
        driver3.manage().window().maximize();


    }
    @AfterMethod
    void Kapat(){

        try {
            Thread.sleep(2000);
        }catch (RuntimeException | InterruptedException e){
            System.out.println(e);
        }

        driver3.quit();
    }
}
