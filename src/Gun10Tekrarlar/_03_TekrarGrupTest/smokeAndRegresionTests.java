package Gun10Tekrarlar._03_TekrarGrupTest;

import Gun10Tekrarlar._02_Tekrar.WebDriver2;
import org.testng.annotations.Test;

public class smokeAndRegresionTests extends WebDriver2 {
    @Test (groups = "Smoke")
    void SmokeTests1(){
        System.out.println("SmokeTests1");
    }
    @Test (groups = "Regression")
    void Resgression2(){
        System.out.println("Regression2");
    }
    @Test (groups = "Smoke")
    void SmokeTests2(){
        System.out.println("SmokeTests2");
    }
    @Test (groups = "Regression")
    void Resgression1(){
        System.out.println("Regression1");
    }
    @Test (groups = "Smoke")
    void SmokeTests3(){
        System.out.println("SmokeTests3");
    }
    @Test (groups = "Smoke")
    void SmokeTests4(){
        System.out.println("SmokeTests4");

    }
    @Test (groups = "Regression")
    void Resgression3(){
        System.out.println("Regression3");
    }
    @Test (groups = "Smoke")
    void SmokeTests5(){
        System.out.println("SmokeTests5");
    }
}
