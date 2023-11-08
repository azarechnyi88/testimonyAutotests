package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SendPage extends Element {
    private By backBtn = By.xpath("//*[@id=\"back_button\"]");

    public SendPage (WebDriver driver) {
        super(driver);
    }

    public void  clickBackButton() {
        waitForElementClickable(driver.findElement(backBtn), driver);
        click(driver.findElement(backBtn));
    }

}
