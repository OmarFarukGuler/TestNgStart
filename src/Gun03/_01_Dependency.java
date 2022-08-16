package Gun03;

import _00_Utils.GenelWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_Dependency extends GenelWebDriver {
    @Test
    void startCar(){
        System.out.println("car started");     //method larin calismasini birbirine baglama isi.
    }
    @Test (dependsOnMethods = {"startCar"})             //bagli oldugu method hatasiz calismassa bu da calismaz.
    void driveCar(){
        System.out.println("car drive");
        //Assert.fail();//bu direk hata verdirir.herhangi bir sart olmadigi icin
    }
    @Test (dependsOnMethods = {"driveCar"}, alwaysRun = true)
    void parkCar(){
        System.out.println("car parked");
    }
    @Test (dependsOnMethods = {"parkCar"}) //bir onceki method ismii vererek zinciri devam ettirebiliriz
    void stopCar(){                                              //onceki tum method larin ismini yazmaya gerek yok
        System.out.println("car stoped");
    }
}
//ama bazi testleri dependecy sarti olsa bile alwaysrun=tru ile ne olursa olsun oncekiler
// hata verse bile bu metodu calistir emri vermis oluyoruz

//kendinden once iki kademe bagliligi olanlar once bagli oldugu metodlari calistirip sonra kendisi calisir
//ikiden fazla bagliligi varsa calistiramiyoruz(bireysel olarak)
//ama bu sart methodun yanina bagli oldugu metotlardan sadece bir oncekini yazarsak gecerli.
//bagli oldugu tum metodlar yazili sie hepsini calistirip sonra kendisi calisir.onceki bagliligin sayisi onemli degil