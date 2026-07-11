package tests;

import base.BaseTest;
import pages.LoginPage;
import pages.LogoutPage;

public class LogoutTest extends BaseTest {
    LoginPage login;
    LogoutPage logout;
    public void setLogout(){
        getDriver().get("https://www.saucedemo.com/");
        login= new LoginPage(getDriver());
        logout= new LogoutPage(getDriver());
    }
    public void logoutTestCode(){
        login.login();
        logout.LogoutCode();
    }
}
