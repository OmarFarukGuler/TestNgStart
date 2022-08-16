package Gun09;


import Gun09._02_POM;
import _00_Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;



public class _03_RunPage extends GenelWebDriver {

    @Test(dataProvider = "getData")
    void runPage(String email, String passsword) throws AWTException {

        _02_POM e = new _02_POM(driver);

        e.singIn.click();
        e.eMail.sendKeys(email);
        e.password.sendKeys(passsword);
        e.submit.click();
        e.contactUs.click();
//        wait.until(ExpectedConditions.elementToBeClickable(e.contact)).click();
        Select select = new Select(e.contact);
        select.selectByVisibleText("Customer service");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Bekle(2);
        // Stringi hafızaya-clipboard a kopyalama kodu
        StringSelection stringSelection = new StringSelection("C:\\Users\\omarf\\OneDrive\\Desktop\\12AgustosProje.rtf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection , null);
        // Verilen stringi clipboard a set ediyor.
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        e.message.sendKeys("QA, SDET, Full Stack test engineer");
        e.submitMessage.click();

        Assert.assertTrue(e.validateMessage.getText().contains("Your message has been successfully"));

        e.logout.click();

    }
    @DataProvider
    public Object[][] getData(){

        Object[][] data = {
                {"omercavci@gmail.com","272520"},
                {"hacıcavcav@gmail.com","12345"},
                {"grup19@gmail.com","grup19"}
        };
        return data;

    }
}
