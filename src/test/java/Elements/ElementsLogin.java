package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsLogin
{
    // ELEMENTO BOTON SIGNIN
    public By byButtonSigning = By.xpath("//a[@class='login']");
    public WebElement ButtonSignin (WebDriver driver)
    {
        WebElement buttonSignin = driver.findElement(byButtonSigning);
        return buttonSignin;

    }

    // ELEMENTO INPUT USUARIO
    public By byImputUser = By.id("email");
    public WebElement InputUser(WebDriver driver)
    {
        WebElement inputUser = driver.findElement(byImputUser);
        return inputUser;
    }

    //ELEMENTO INPUT PASSWORD
    public By byInputPassword = By.id("password");
    public WebElement InputPassword(WebDriver driver)
    {
        WebElement inputPassword = driver.findElement(byInputPassword);
        return inputPassword;
    }

    //ELEMENTO ENVIAR PASSWORD
    public By bySubmitLogin = By.id("submitLogin");
    public WebElement SubmitLogin(WebDriver driver)
    {
        WebElement submitLogin = driver.findElement(bySubmitLogin);
        return submitLogin;
    }


}
