package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import manager.ApplicationManager;

public class TestBase {
    protected final ApplicationManager applicationManager = new ApplicationManager();


    @BeforeEach
    public void setupPage() throws InterruptedException  {
        applicationManager.init();
    }

    @AfterEach
    public void closePage() {
        applicationManager.close();
    }


}
