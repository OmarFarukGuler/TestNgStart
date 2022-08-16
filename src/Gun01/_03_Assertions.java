package Gun01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Assertions {

@Test
    void EqualOrnek(){
        String s1="Merhaba";
        String s2="Iyi aksamlar";

        Assert.assertEquals(s1,s2,"Karsilastirma sonucu");
    }

    @Test
    void NotEqualOrnek(){
        String s1="Merhaba";
        String s2="Iyi aksamlar";

        Assert.assertNotEquals(s1,s2,"Karsilastirma sonucu");
    }


    @Test
    void TrueOrnek(){
        int s1=55;
        int s2=55;

        Assert.assertTrue(s1==s2,"Karsilastirma sonucu");
    }

    @Test
    void NullOrnek(){//primitiv tipler null olamaz
        int s1=55;//int s1=""; yazamazsin

        Assert.assertNull(s1,"Karsilastirma sonucu");
    }

    @Test
    void direktFail(){//primitiv tipler null olamaz
        int s1=55;

        Assert.fail();//else yerine kullanilabilir
    }
}
