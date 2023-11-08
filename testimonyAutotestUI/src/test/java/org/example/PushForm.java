package org.example;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import manager.ApplicationManager;
public class PushForm extends TestBase {
    @Test
    public void PushFromPrice () throws InterruptedException {
        applicationManager.getMainPage().clickSend();
        Thread.sleep(1000);
        applicationManager.getMainPage().EnterForm("01.11.2023", "111", "222", "333", "354");
        Thread.sleep(1000);

    }
}
