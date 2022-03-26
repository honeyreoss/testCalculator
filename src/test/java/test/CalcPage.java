package test;

import attributes.Abstract;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.opentest4j.AssertionFailedError;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalcPage extends Abstract
{
    public CalcPage(WebDriver driver)
    {
        super(driver);
    }
    public CalcPage clickCalcBtn()
    {
        clickOn(oneBtn);
        clickOn(multiplyBtn);
        clickOn(twoBtn);
        clickOn(minusBtn);
        clickOn(threeBtn);
        clickOn(plusBtn);
        clickOn(oneBtn);
        clickOn(equalBtn);
        return this;
    }
    public CalcPage checkMemoryCorrect()
    {
        getText(memoryString);
        try
        {
            assertTrue(stringFromField.contains(checkMemoryString));
        }
        catch (AssertionFailedError e)
        {
            Assertions.fail("Memory string is NOT correct: " + "(" + stringFromField + ") != ("+ checkMemoryString + ")" );
        }
        return this;
    }
    public CalcPage checkResultCorrect()
    {
        getText(resultString);
        try
        {
        assertTrue(stringFromField.contains(checkResultString));
        }
        catch (AssertionFailedError e)
        {
            Assertions.fail("Memory string is NOT correct: " + "(" + stringFromField + ") != ("+ checkResultString + ")" );
        }
        return this;
    }
}
