package Gun06._02_DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _03_DataProviderIterator {


    @Test(dataProvider="getData")//burada dataProvider lari getData ismi ile eslestirdik.
    void  UserName(String username){
        System.out.println("UseName = "+username);
    }
    @DataProvider
    public Iterator<Object> getData(){

        List<Object> data=new ArrayList<>();
        data.add("Nurhayat");
        data.add("Alper");
        data.add("Ugur");
        data.add("Hakan");

        return  data.iterator();
    }


    @Test(dataProvider="getData2")//burada dataProvider lari getData ismi ile eslestirdik.
    void  UserName2(String username,String password){
        System.out.println("UseName = "+username+"password"+ password);
    }
    @DataProvider
    public Iterator<Object[]> getData2(){

        List<Object[]> data=new ArrayList<>();
        data.add(new Object[]{"Nurhayat","123"});
        data.add(new Object[]{"Alper","1234"});
        data.add(new  Object[]{"Ugur","12345"});
        data.add(new Object[]{"Hakan","123456"});

        return  data.iterator();
    }
}
