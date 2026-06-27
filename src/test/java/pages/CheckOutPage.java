package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckOutPage {
    WebDriver driver;
    WebDriverWait wait;
    public CheckOutPage(WebDriver driver){
        this.driver= driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    By checkoutBtn= By.xpath("//button[text()='Checkout']");
    By checkoutTitle = By.xpath("//span[text()='Checkout: Your Information']");
    By firstName= By.id("first-name");
    By secondName= By.id("last-name");
    By postalField= By.id("postal-code");
    By continueButn= By.id("continue");
    By finishBtn= By.id("finish");
    By orderSuccess= By.xpath("//h2[text()='Thank you for your order!']");
public void checkoutCode(){

    wait.until(ExpectedConditions.visibilityOfElementLocated(checkoutBtn)).click();
    System.out.println("Checked out clicked succesfully");
}

//public String setCheckoutTitle() {
//return wait.until(ExpectedConditions.visibilityOfElementLocated(checkoutTitle)).getText();
//}
public void infoPage(){
    wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys("Sarmistha");
    wait.until(ExpectedConditions.visibilityOfElementLocated(secondName)).sendKeys("Dc");
    wait.until(ExpectedConditions.visibilityOfElementLocated(postalField)).sendKeys("20600");
    wait.until(ExpectedConditions.visibilityOfElementLocated(continueButn)).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(finishBtn)).click();
}
public String successfulOrder(){
    return wait.until(ExpectedConditions.visibilityOfElementLocated(orderSuccess)).getText();
}
}
