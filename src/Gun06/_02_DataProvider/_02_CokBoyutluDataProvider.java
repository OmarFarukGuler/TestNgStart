package Gun06._02_DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_CokBoyutluDataProvider {

    @Test(dataProvider="getData")
    void  UserName(String username,String password){
        System.out.println("UseName = "+username/*+ ", password " +password*/);//boyle de olur
        System.out.println("password = " + password);                           //boyle de
    }
    @DataProvider
    public Object[][] getData(){

        Object[][] data= {
                {"Nurhayat","123"},
        {"Alper","1234"},
        {"Ugur","12345"},
        {"Hakan","123456"}
        };

        return  data;
    }

}
