package org.example;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class MainPage extends Element {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    private By dataSend = By.xpath("//*[@id=\"send_button\"]");
    private By dataHistory = By.xpath("//*[@id=\"history_button\"]");
    private By catalog = By.xpath("//*[@id=\"catalog_button\"]");
    private By inputDate = By.cssSelector("#date");
    private By inputColdData = By.cssSelector("#coldData");
    private By inputHoldData = By.cssSelector("#hotData");
    private By inputGasData = By.cssSelector("#gasData");
    private By inputElecData = By.cssSelector("#elecData");
    private By btnPush = By.cssSelector("#button");


    public SendPage clickSend() {
        click(driver.findElement(dataSend));
            return new SendPage(driver);
    }

    public HistoryPage clickHistory() {
        click(driver.findElement(dataHistory));
        return new HistoryPage(driver);
    }

    public PricePage clickPrice() {
        click(driver.findElement(catalog));
        return new PricePage(driver);
    }

    public void EnterForm (String dateS, String coldDataS, String holdDataS, String gasDataS, String elecDataS) {
        driver.findElement(inputDate).sendKeys(dateS + Keys.ENTER);
        driver.findElement(inputColdData).sendKeys(coldDataS + Keys.ENTER);
        driver.findElement(inputHoldData).sendKeys(holdDataS + Keys.ENTER);
        driver.findElement(inputGasData).sendKeys(gasDataS + Keys.ENTER);
        driver.findElement(inputElecData).sendKeys(elecDataS + Keys.ENTER);
        driver.findElement(btnPush).click();
    }
}
