package testBase;

import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class TC001_LoginOrangeHRM_ValidCredentials extends BaseClass {
    LoginPage lp = new LoginPage(driver);

    @Test
    public void verifyValidLoginCredentials(){
        lp.setUserName("Admin");
        lp.setPwd("admin123");
        lp.clickLoginButton();

    }
}
