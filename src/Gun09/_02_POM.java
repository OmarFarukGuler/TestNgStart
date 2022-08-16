package Gun09;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _02_POM {

    public _02_POM(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText = "Sign in")
    public WebElement singIn;

    @FindBy(id = "email")
    public WebElement eMail;

    @FindBy(id = "passwd")
    public WebElement password;

    @FindBy(id = "SubmitLogin")
    public WebElement submit;

    @FindBy(css = "[title='Contact Us']")
    public WebElement contactUs;

    @FindBy(css = "[id='id_contact']")
    public WebElement contact;

    @FindBy(css = "[id='id_contact']")
    public WebElement choose;

    @FindBy(css = "[id='message']")
    public WebElement message;

    @FindBy(css = "[id='submitMessage']")
    public WebElement submitMessage;

    @FindBy(xpath = "//*[text()='Your message has been successfully sent to our team.']")
    public WebElement validateMessage;

    @FindBy(css = "[title='Log me out']")
    public WebElement logout;

    @FindBy(css = "[class='logo img-responsive']")
    public WebElement homePage;

    @FindBy(css = "[title='Faded Short Sleeve T-shirts'][alt='Faded Short Sleeve T-shirts']")
    public WebElement img;

    @FindBy(css = "button[type='submit'][class='exclusive']")
    public WebElement addToCart;

    @FindBy(css = "[title='Proceed to checkout']")
    public WebElement proceed1;

    @FindBy(xpath = "//span[text()='Proceed to checkout']")
    public WebElement proceed2;

    @FindBy(css = "[name='processAddress']")
    public WebElement proceed3;

    @FindBy(css = "[type='checkbox']")
    public WebElement terms;

    @FindBy(css = "[name='processCarrier']")
    public WebElement proceed4;

    @FindBy(css = "[title='Pay by bank wire']")
    public WebElement bankWire;

    @FindBy(css = "[type='submit'][class*='button btn btn-default']")
    public WebElement confirm;

    @FindBy(xpath = "//strong[text()='Your order on My Store is complete.']")
    public WebElement validateText;





}
