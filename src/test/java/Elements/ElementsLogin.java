package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsLogin
{
    //1 ELEMENTO BOTON SIGNIN
    public By byButtonSigning = By.xpath("//a[@class='login']");
    public WebElement ButtonSignin (WebDriver driver)
    {
        WebElement buttonSignin = driver.findElement(byButtonSigning);
        return buttonSignin;

    }

    //2 ELEMENTO INPUT USUARIO
    public By byImputUser = By.id("email");
    public WebElement InputUser(WebDriver driver)
    {
        WebElement inputUser = driver.findElement(byImputUser);
        return inputUser;
    }

    //ELEMENTO INPUT PASSWORD
    public By byInputPassword = By.id("passwd");
    public WebElement InputPassword(WebDriver driver)
    {
        WebElement inputPassword = driver.findElement(byInputPassword);
        return inputPassword;
    }

    //ELEMENTO ENVIAR PASSWORD
    public By bySubmitLogin = By.id("SubmitLogin");
    public WebElement SubmitLogin(WebDriver driver)
    {
        WebElement submitLogin = driver.findElement(bySubmitLogin);
        return submitLogin;
    }

    //3 ELEMENTO TAP WOMAN
    public By byTapWoman = By.partialLinkText("Women");
    public WebElement TapWoman(WebDriver driver)
    {
        WebElement  tapWoman = driver.findElement(byTapWoman);
        return tapWoman;
    }

    //4 ELEMENTO BOTON PRUEBA
    public By byBotonPrueba = By.xpath("test");
    public WebElement BtnPruba (WebDriver driver)
    {
        WebElement  btnPrueba= driver.findElement(byBotonPrueba);
        return btnPrueba;
    }


}
