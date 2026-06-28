package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LogoutPage {
    WebDriver driver;
    WebDriverWait wait;
    By logoutBtn= By.xpath("//button[text()='Open Menu']");
    By logout= By.xpath("//a[text()='Logout']");
    public LogoutPage(WebDriver driver){
        this.driver= driver;
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void LogoutCode(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(logoutBtn)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(logout)).click();
    }
}
