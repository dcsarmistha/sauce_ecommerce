package tests;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddToCartPage;
import pages.LoginPage;

public class AddToCartTest extends BaseTest {
    AddToCartPage cart;
    LoginPage login;
    @BeforeMethod
    public void setCart(){
        getDriver().get("https://www.saucedemo.com/");
        cart = new AddToCartPage(getDriver());
        login= new LoginPage(getDriver());
    }
    @Test
    public void cartTest() {
        login.login();
        cart.addCart();
        System.out.println("added succefully in the cart");
        String cartSuccess = cart.cartAdded();
        Assert.assertEquals(cartSuccess, "Sauce Labs Backpack");

    }
}
