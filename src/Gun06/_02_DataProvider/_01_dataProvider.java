package Gun06._02_DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_dataProvider  {



    @Test (dataProvider="getData")//burada dataProvider lari getData ismi ile eslestirdik.
    void  UserName(String username){
        System.out.println("UseName = "+username);
    }
    @DataProvider
    public Object[] getData(){

        Object[] data={"Nurhayat","Alper","Ugur","Hakan"};

        return  data;
    }


    @Test (dataProvider="userlar")//buraya isim vererek de data providerlari eslestirebiliriz
    void  UserName2(String username){
        System.out.println("UseName = "+username);
    }
    @DataProvider (name = "userlar")
    public Object[] getData2(){

        Object[] data={"Nurhayat","Alper","Ugur","Hakan"};

        return  data;
    }
}
