package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import manager.ApplicationManager;

public class PageNavigationTest extends TestBase {

    @Test
    public void FromMainToSendAndBack () throws InterruptedException {
        applicationManager.getMainPage().clickSend();
        Thread.sleep(1000);
        Assertions.assertEquals(applicationManager.getMainPage().getHeaderText(), "Передача показаний");
        applicationManager.getSendPage().clickBackButton();
        Assertions.assertEquals(applicationManager.getMainPage().getHeaderText(), "Neo ЖКХ");
    }


    @Test
    public void FromMainToHistoryAndBack () throws InterruptedException {
        applicationManager.getMainPage().clickHistory();
        Assertions.assertEquals(applicationManager.getMainPage().getHeaderText(), "История показаний");
        applicationManager.getSendPage().clickBackButton();
        Assertions.assertEquals(applicationManager.getMainPage().getHeaderText(), "Neo ЖКХ");
    }


    @Test
    public void FromMainToPriceAndBack () {
        applicationManager.getMainPage().clickPrice();
        Assertions.assertEquals(applicationManager.getMainPage().getHeaderText(), "Справочник стоимости услуг");
        applicationManager.getSendPage().clickBackButton();
        Assertions.assertEquals(applicationManager.getMainPage().getHeaderText(), "Neo ЖКХ");

    }
}
