package attributes;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abstract extends Default
{
    public WebDriver driver;
    public WebDriverWait wait;
    public WebElement element;

    public Abstract(WebDriver driver)
    {
        this.driver = driver;
        wait = new WebDriverWait(driver,10);
    }
    public void waitVisibility(String xPath)
    {
        try
        {
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xPath)));
        }
        catch (Exception e)
        {
            Assertions.fail("TIMEOUT:::  Element is NOT visibility: " + xPath);
        }
    }
    public void clickOn(String xPath)
    {
        waitVisibility(xPath);

        try
        {
            driver.findElement(By.xpath(xPath)).click();
        }
        catch (Exception e)
        {
            Assertions.fail("Can NOT click on: " + xPath);
        }
    }
    public void sendKeys(String xPath, String keys)
    {
        waitVisibility(xPath);
        try {
            driver.findElement(By.xpath(xPath)).sendKeys(keys);
        }
        catch (Exception e)
        {
            Assertions.fail("Can NOT send keys " + xPath);
        }
    }
    public  void getText(String xPath)
    {
        element = driver.findElement(By.xpath(xPath));
        stringFromField = element.getText();
    }
}
