package Gun07.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PlaceOrderElements {


    // Bu sayfadaki bütün elemenalrın driverlar bağlantısı gerekiyor
    // bunun için aşağıdaki consructor eklendi ve için PageFatory ile
    // driver üzerinden bu (this) sayfadaki bütün elemnalar ilşkilendirildi.
    // Böylece Sayfada dan nesne türetildiği zaman değil, kullanıldığı
    // anda elemanların bulunması aktif oluyor.Bu yöntemle bütün sayfalarda
    // aynı isimde elemanlar var ise buradaki tanımlama hepsi için geçerli hale
    // gelmiş oluyor. buna yapıya Page Object Model (POM) adı veriliyor.
    public PlaceOrderElements(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }

    @FindBy (css = "[class='form-control input-lg']")
    public WebElement searchBox;

    @FindBy(css = "[class='btn btn-default btn-lg']")
    public WebElement searchButton;

    @FindBy (xpath = "//span[contains(text(),'Add to Cart')]")
    public List<WebElement> adToCart;

      @FindBy(xpath = "//span[contains(text(),'Checkout')]")
    public WebElement checkout;
    @FindBy(css = "[id='button-payment-address']")
    public WebElement continyu1;

    @FindBy (css = "[id='button-shipping-address']")
    public WebElement continyu2;

    @FindBy (css = "[id='button-shipping-method']")
    public WebElement continyu3;

    @FindBy (css = " [value='cod']")
    WebElement cashonly;

    @FindBy (css = "[name='agree']")
    public WebElement agree;


    @FindBy (css = "[id='button-payment-method']")
    public WebElement continyu4;

    @FindBy (css = "[id='button-confirm']")
    public WebElement confirm;

    @FindBy (xpath = "//button[@data-original-title='Add to Wish List']")
    public List<WebElement> addWish;

    @FindBy (xpath = "//a[text()='wish list']")
    public WebElement wishList;

   /* @FindBy (xpath = "//td[@class='text-left']/a")
    public List<WebElement> uruntextname;*/

    @FindBy (xpath = "//img[contains(@title,'iPod')]")
    public List<WebElement> imgTitleIpod;

    @FindBy (xpath = "//a[contains(text(),'iPod')]")
    public List<WebElement> urunName;//addwish bolumunde

}
