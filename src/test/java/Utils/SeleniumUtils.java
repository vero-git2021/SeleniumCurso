package Utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class SeleniumUtils
{
    WebDriver driver;

    public void clickButton(WebElement element)
    {
        element.click();
    }

    public void LimpiarInput(WebElement element)
    {
        element.clear();
    }

    public void limpiarYllenarInput(WebElement input,String data)
    {
        LimpiarInput(input);
        input.sendKeys(data);
    }

    public void loading (WebDriver driver, int timeMiliseconds) throws Exception
    {
        Thread.sleep(timeMiliseconds);
    }

    public WebElement waitElement(WebDriver driver, WebElement element, By locator)
    {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30)) //tiempo total de espera
                .pollingEvery(Duration.ofSeconds(3)); //tiempo entre cada intento

        WebElement elemento = wait.until(new Function<WebDriver, WebElement>()
        {
            public WebElement apply(WebDriver driver)
            {

                try {
                    if (element.isDisplayed())
                    {
                        return  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
                    }
                    else
                    {
                        return  wait.until(ExpectedConditions.presenceOfElementLocated(locator));
                    }
            }
                catch (NoSuchElementException nsee)
                {
                    throw new NoSuchElementException("NoSuchElementException: Locator not found" + locator);
                }
                catch (TimeoutException toe)
                {
                    throw new TimeoutException("TimeoutException: Locator not visible" + locator);
                }
            }
        });

       return null;
    }


}
