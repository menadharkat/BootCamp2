package mobilePackageTest;

import base.MobileApi;
import mobilePackage.MobileClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MobileClassTest extends MobileApi {

    MobileClass mobileClass;

    @BeforeMethod
    public void init(){
        mobileClass = PageFactory.initElements(appiumDriver, MobileClass.class);
    }

    @Test
    public void cont(){
        appiumDriver.scrollTo("TAP TO CONTINUE").click();
    }
    //@Test
    public void setContinuesTest(){
        mobileClass.setContinues();
    }





}
