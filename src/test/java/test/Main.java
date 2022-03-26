package test;

import attributes.Default;
import org.junit.jupiter.api.Test;

public class Main extends Default
{
    @Test
    public void testCalc()
    {
        searchPage
                .goTo()
                .inputIntoSearch()
                .clickSearchBtn();
        calcPage
                .clickCalcBtn()
                .checkMemoryCorrect()
                .checkResultCorrect();
    }
}
