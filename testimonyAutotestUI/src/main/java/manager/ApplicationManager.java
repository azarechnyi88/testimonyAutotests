package manager;

import org.example.Element;
import org.example.MainPage;
import org.example.PricePage;
import org.example.SendPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    public WebDriver driver;
    public MainPage mainPage;
    public PricePage pricePage;
    public Element element;


    public MainPage getMainPage() {
        return mainPage;
    }

    public SendPage getSendPage() {
        return sendPage;
    }
    public PricePage getPricePage() { return  pricePage;}


    public SendPage sendPage;
    public void init() throws InterruptedException {
        System.setProperty("webdriver.chome.driver", "C:\\Users\\azarechnyi\\AT\\testimonyAutotests\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://127.0.0.1:5500/index.html");
        element = new Element(driver);
        mainPage = new MainPage(driver);
        sendPage = new SendPage(driver);
        Thread.sleep(1000);
    }

    public void close() {
        driver.quit();
    }
}
