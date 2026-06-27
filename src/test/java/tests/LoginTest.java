package tests;


import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

import javax.sql.rowset.spi.SyncResolver;

public class LoginTest extends BaseTest {
    LoginPage login;
    @BeforeMethod
    public void setTest(){
        getDriver().get("https://www.saucedemo.com/");
        login = new LoginPage(getDriver());
    }
@Test
    public void loginTest(){
        login.login();
        String message=login.loginSuccess();
    Assert.assertEquals(message, "Swag Labs");
}
@Test
public void invalidLoginTest(){
        login.invalidLogin();
        String msg= login.failedLogin();
        Assert.assertEquals(msg, "Epic sadface: Username and password do not match any user in this service");
}
}
