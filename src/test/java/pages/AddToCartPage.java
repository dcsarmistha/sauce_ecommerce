package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddToCartPage {

    WebDriver driver;
    WebDriverWait wait;
    By productCart= By.id("add-to-cart-sauce-labs-backpack");
    By cartBadge = By.xpath("//span[@data-test='shopping-cart-badge']");
    By added= By.xpath("//div[text()='Sauce Labs Backpack']");
    public AddToCartPage(WebDriver driver){
        this.driver= driver;
        wait= new WebDriverWait(driver, Duration.ofSeconds(30));
    }
    public void addCart() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(productCart)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(cartBadge)).click();
    }
    public String cartAdded(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(added)).getText();
    }

}
