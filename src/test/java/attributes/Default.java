package attributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import test.CalcPage;
import test.SearchPage;

public class Default
{
    public String GOOGLE_URL = "https://www.google.com/";
    public String searchField = "//input[@name=\"q\"]";
    public String searchBtn = "//div[@class=\"CqAVzb lJ9FBc\"]//input[@name=\"btnK\"]";
    public String calcWord = "Калькулятор";
    public String oneBtn = "//div[@class=\"PaQdxb A2W7l\"]//div[text()=\"1\"]";
    public String twoBtn = "//div[@class=\"PaQdxb A2W7l\"]//div[text()=\"2\"]";
    public String threeBtn = "//div[@class=\"PaQdxb A2W7l\"]//div[text()=\"3\"]";
    public String multiplyBtn = "//div[@class=\"PaQdxb mF5fo\"]//div[text()=\"×\"]";
    public String equalBtn = "//div[@class=\"PaQdxb mF5fo G7BHUb\"]//div[text()=\"=\"]";
    public String minusBtn = "//div[@class=\"PaQdxb mF5fo\"]//div[text()=\"−\"]";
    public String plusBtn = "//div[@class=\"PaQdxb mF5fo\"]//div[text()=\"+\"]";
    public String memoryString = "//div[@class=\"XH1CIc\"]//span";
    public String resultString = "//div[@class=\"z7BZJb XSNERd\"]//span";
    public String checkMemoryString = "1 × 2 - 3 + 1 =";
    public String checkResultString = "0";

    WebDriver driver;
    public SearchPage searchPage;
    public CalcPage calcPage;
    public String stringFromField;

    @BeforeEach
    public void beforeEach()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        searchPage = PageFactory.initElements(driver, SearchPage.class);
        calcPage = PageFactory.initElements(driver, CalcPage.class);
    }
    @AfterEach
    public void afterEach()
    {
        driver.quit();
    }
}
