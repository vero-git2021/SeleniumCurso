package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumUtils
{
    WebDriver driver;

    public void ClickButoon(WebElement element)
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

}
