package Gun01;

import org.testng.annotations.*;

public class _02_Annotations {
 /*
         @BeforeClass --> // Her class çalışıyorken önce burası çalışır
           @BeforeMetod --> // Her metoddan(test metod) önce çalışır
              @Test     -->  testlerin çalıştığı metodlar
              @Test     -->  testlerin çalıştığı metodlar
           @AfterMetod --> // Her metoddan(test metod) sonra çalışır
         @AfterClass --> // Her class çalışıyorken sonra burası çalışır*/
@BeforeClass
    void beforeClass(){
        System.out.println("Her class tan once calisacaklar : Before Class");
    }
@BeforeMethod
    void beforeMetod(){
        System.out.println("Her method tan once calisacaklar : Before Method");
    }
@Test
    void Tesr1(){ }
@Test
    void Test2(){ }

@AfterMethod
    void afterMethod(){
        System.out.println("Her method tan sonra calisacaklar : Before Method");
    }
@AfterClass
    void aftereClass(){//yukariya yazsan da onemli degil.basa @afterClass yazman yeterli
        System.out.println("Her class tan once calisacaklar : Before Method");
    }






}
