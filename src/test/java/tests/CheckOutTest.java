package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckOutPage;
import pages.LoginPage;

public class CheckOutTest extends BaseTest {
    LoginPage login;
    CartPage cart;
    CheckOutPage checkOut;
    @BeforeMethod
    public void setCheckout(){
        getDriver().get("https://www.saucedemo.com/");
        login= new LoginPage(getDriver());
        cart= new CartPage(getDriver());
        checkOut= new CheckOutPage(getDriver());
    }
    @Test
    public void CheckOut(){
    login.login();
    cart.addCart();
    checkOut.checkoutCode();
    System.out.println("visible continue button");
    checkOut.infoPage();
    String orderTxt= checkOut.successfulOrder();
        Assert.assertEquals(orderTxt, "Thank you for your order!");
    }
}
