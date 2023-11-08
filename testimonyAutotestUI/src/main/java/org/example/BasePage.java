package org.example;

import dev.failsafe.Timeout;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TimeoutException;

import java.time.Duration;

public class BasePage {
    public WebDriver driver;
    protected final static int WAITING_TIME_IN_SECONDS = 30;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected void click(WebElement elements) {
        elements.click();
    }

    protected boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException ex){
            return false;
        }
    }

    public static WebElement waitForElementClickable(WebElement element, WebDriver driver) {
        return (new WebDriverWait(driver, Duration.ofSeconds(WAITING_TIME_IN_SECONDS)))
                .until(ExpectedConditions.elementToBeClickable(element));
    }
}
