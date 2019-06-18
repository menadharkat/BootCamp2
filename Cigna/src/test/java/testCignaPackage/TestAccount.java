package testCignaPackage;

import base.CommonAPI;
import cignaPackage.Account;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAccount extends CommonAPI {

    Account account ;

    @BeforeMethod
    public void initialization(){
        account = PageFactory.initElements(driver, Account.class);
    }
    @Test
    public void testSetLogIn(){
        account.setClicklogin();
    }

    @Test
    public void testSetRegister(){
        account.setRegister("menad", "harkat");
    }
    @Test
    public void testLoginDetails(){
        account.loginDetails("akli", "Sdjebra");
    }
    @Test
    public void testLoginDetails1(){
        account.loginDetails("massi", "djada");
    }
    @Test
    public void testLoginDetails2(){
        account.loginDetails("Jeff", "pass123");
    }
    @Test
    public void testLoginDetails3(){
        account.loginDetails("menad", "menadn123");
    }
    @Test
    public void testLoginDetails4(){
        account.loginDetails("Akli", "Akli123");
    }

}
