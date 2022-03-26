package test;

import attributes.Abstract;
import org.openqa.selenium.WebDriver;

public class SearchPage extends Abstract
{
    public SearchPage(WebDriver driver)
    {
        super(driver);
    }
    public SearchPage goTo()
    {
        driver.get(GOOGLE_URL);
        return this;
    }
    public SearchPage inputIntoSearch()
    {
        sendKeys(searchField, calcWord);
        return this;
    }
    public SearchPage clickSearchBtn()
    {
        clickOn(searchBtn);
        return this;
    }
}
