package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//input[@name='username']")
    WebElement txtUserName;

    @FindBy(xpath = "//input[@name='password']")
    WebElement txtPassword;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnLogin;

    public void setUserName(String usrName){
        txtUserName.sendKeys(usrName);
    }

    public void setPwd(String usrPwd){
        txtPassword.sendKeys(usrPwd);
    }

    public void clickLoginButton(){
        btnLogin.click();
    }


}
