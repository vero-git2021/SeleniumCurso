package Features;

import Common.BaseTest;
import Elements.ElementsLogin;
import Utils.SeleniumUtils;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Waits extends BaseTest

{
    ElementsLogin elementsLogin = new  ElementsLogin ();
    SeleniumUtils Utils = new SeleniumUtils();

    @Test
    public void waits ()throws Exception
    {

        //********IMPLICIT WAIT*******
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //********EXPLICIT WAIT*********
        /*Explicits:
                    > WebDriverWait
                    > Thread.Sleep();         */

        WebDriverWait wait = new WebDriverWait(driver, 8);
        wait.until(ExpectedConditions.presenceOfElementLocated(elementsLogin.byTapWoman));

        Utils.clickButton(elementsLogin.TapWoman(driver));
        Utils.loading(driver, 1000);

        //********FLUENT WAIT********
       /* Wait<WebDriver> fWait = new FluentWait<WebDriver>(driver)
           .withTimeout(Duration.ofSeconds(10))
           .pollingEvery(Duration.ofSeconds(3))
           .ignoring(NoSuchElementException.class);


        WebElement btnSigin = fWait.until(new Function<WebDriver, WebElement>() {

         public WebElement apply(WebDriver driver) {
            return driver.findElement(elementsLogin.byTapWoman);
        }
        });

        Assert.assertTrue(driver.findElement(elementsLogin.byTapWoman).isDisplayed());*/

    }


}
