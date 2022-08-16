package Gun07;

import _00_Utils.GenelWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _01_SoftAssertVeHardAssert  {
    @Test
    void hardAssert(){

        String s1="Merhaba";

        System.out.println("Hard assert oncesi");//hatadan once calisacak
        Assert.assertEquals("Merhaba 123",s1,"HardAssert Sonucu");
        System.out.println("Hard assert sonrasi");//hata bulundugu icin sonrasi calismaz



    }
    @Test
    void softAssert(){

        String strHomePage="www.facebook.com/homepage";
        String strCartPage="www.facebook.com/cartpage";
        String strEditAccount="www.facebook.com/editaccountpage";


        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals("www.facebook.com/homepage",strHomePage);//true
        System.out.println("assert 1");

        softAssert.assertEquals("www.facebook.com/profile",strCartPage);//true
        System.out.println("assert 2");

        softAssert.assertEquals("www.facebook.com/settings",strEditAccount);//true
        System.out.println("assert 3");

        softAssert.assertAll();//butun assert sonuclarini isleme koyuyor.
        System.out.println("Aktiflik sonrasi");//Bu bolum assertAll dan sonra oldugu ve oncesinde hata
                                               // olustugu icin yazilmadi.


    }

}
