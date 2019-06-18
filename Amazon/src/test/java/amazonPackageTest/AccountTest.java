package amazonPackageTest;

import amazonPackage.Account;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountTest extends CommonAPI {

    Account account;

    @BeforeMethod
    public void init(){
        account = PageFactory.initElements(driver, Account.class);
    }
    @Test(enabled = false)
    public void setSigninTest(){
        account.setSignin();
        account.setEmail("menad@gmail.com");
        sleepFor(3);
        account.setPass("pass123");
        sleepFor(3);
        account.setSignbutton();
        sleepFor(2);
    }

    @Test(enabled = true)
    public void setSigni2Test(){
        account.setSigni2("menad","akli");
    }

}
