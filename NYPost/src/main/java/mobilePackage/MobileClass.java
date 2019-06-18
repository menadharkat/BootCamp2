package mobilePackage;

import base.MobileApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MobileClass extends MobileApi {

    @FindBy(xpath = "//android.widget.TextView[@text='TAP TO CONTINUE']")
    WebElement continues;

    public void setContinues(){
        continues.click();
    }
}
