package amazonPackageTest;

import amazonPackage.Autosuggestion;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutosuggestionTest extends CommonAPI {

    Autosuggestion autosuggestion;

    @BeforeMethod
    public void init(){
        autosuggestion = PageFactory.initElements(driver,Autosuggestion.class);
    }
    @Test
    public void setDealsTest(){
        autosuggestion.setDeals();
        sleepFor(3);
        autosuggestion.setDetails();
        sleepFor(3);
        autosuggestion.setVerify();
        sleepFor(3);
        autosuggestion.setEmail("menad@gmail.com.com");
        sleepFor(3);
        autosuggestion.setPass("menad");
        sleepFor(3);
        autosuggestion.setSubmit();
        sleepFor(3);
    }
}
