package testBase;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

import java.time.Duration;

public class TC001_LoginOrangeHRM_ValidCredentials extends BaseClass {

    LoginPage lp;

    @Override
    public void beforeTest() {
        lp = new LoginPage(driver);
    }

    @Test
    public void verifyValidLoginCredentials(){
        lp.setUserName("Admin");
        lp.setPwd("admin123");
        lp.clickLoginButton();
    }
}
