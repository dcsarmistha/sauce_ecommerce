package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;

public class CartTest extends BaseTest {
    CartPage cart;
    LoginPage login;
    @BeforeMethod
    public void setCart(){
        getDriver().get("https://www.saucedemo.com/");
        cart = new CartPage(getDriver());
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
    @Test
    public void removeCart(){
        login.login();
        cart.addCart();
        System.out.println("added succesfully in cart");
        cart.removeCart();
        System.out.println("Removed from cart successfully");
    }
}
