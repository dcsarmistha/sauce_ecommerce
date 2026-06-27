package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    By usernameField= By.name("user-name");
    By passwordField= By.name("password");
    By loginSuccess= By.xpath("//div[@class='app_logo' and text()='Swag Labs']");
    By loginBtn= By.xpath("//input[@id='login-button']");
    By failMessage= By.xpath("//h3[text()='Epic sadface: Username and password do not match any user in this service']");
    public LoginPage(WebDriver driver){
        this.driver= driver;
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void login(){
    wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField)).sendKeys("standard_user");
    wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys("secret_sauce");
    wait.until(ExpectedConditions.visibilityOfElementLocated(loginBtn)).click();
    }
    public void invalidLogin(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField)).sendKeys("standard_user");
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys("secret_sauce123");
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginBtn)).click();
    }
    public String loginSuccess(){
       return wait.until(ExpectedConditions.visibilityOfElementLocated(loginSuccess)).getText();
    }
    public String failedLogin(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(failMessage)).getText();
    }
}
