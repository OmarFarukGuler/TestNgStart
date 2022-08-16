package Gun04;

import _00_Utils.GenelWebDriver;
import org.testng.annotations.*;

public class _01_Intro extends GenelWebDriver {

    /*
     @BeforeSuit
       @BeforeTest
         @BeforeGroup
           @BeforeClass
             @BeforeMethod
               @Test
               @Test
             @AfterMethod
           @AfterClass
         @AfterGroup
       @AfterTest
     @AfterSuit
    */
    @BeforeSuite
    void BeforeeSuit(){
        System.out.println("Before Suit");

    }
    @BeforeTest
    void BeforeeTest(){
        System.out.println("Before Test");

    }
    @BeforeGroups
    void BeforeeGroop(){
        System.out.println("Before Groups");

    }

    @BeforeClass
    void BeforeeClass(){
        System.out.println("Before Class");

    }
    @BeforeMethod
    void BeforeeMethod(){
        System.out.println("Before Method");

    }
    @Test
    void Testt1(){
        System.out.println("Tesst Intro 1");

    }
    @Test
    void Testt2(){
        System.out.println("Tesst Intro 1");

    }
    @AfterMethod
    void AftirMethod(){
        System.out.println("After Method");

    }
    @AfterClass
    void AftirClass(){
        System.out.println("After Class");

    }
    @AfterGroups
    void AfterGrups(){
        System.out.println("Before Suit");

    }
    @AfterTest
    void AfterTeest(){
        System.out.println("Before Test");

    }
    @AfterSuite
    void AfterrSuit() {
        System.out.println("Afterr Suit");

    }
}
