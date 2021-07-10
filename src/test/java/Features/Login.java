package Features;

import Common.Config;
import Elements.ElementsLogin;
import Utils.SeleniumUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Login
{
    //****** INSTANCIAS ******
     ElementsLogin elementsLogin = new ElementsLogin();
     SeleniumUtils utils = new SeleniumUtils();

    public void miLogin (WebDriver driver) throws InterruptedException
    {
        //*******SE DA CLIC EN EL BOTON SIGNIN*************

        Thread.sleep(2000);
        utils.ClickButoon(elementsLogin.ButtonSignin(driver));
        Thread.sleep(2000);

        //**********SE DESLIZA DESPLAZAMIENTO HACIA LA PARTE INFERIOR************

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy (0,350)");
        Thread.sleep(2000);
        //Utils.loading(driver, 4000);

        // SE DA CLICK EN EL BOTON SING IN Y SE LLENA EL USUARIO
        utils.ClickButoon(elementsLogin.InputUser(driver));
        utils.limpiarYllenarInput(elementsLogin.InputUser(driver),Config.user);
        Thread.sleep(2000);

        // SE DA CLICK Y SE LLENA EL PASSWORD
        utils.ClickButoon(elementsLogin.InputPassword(driver));
        utils.limpiarYllenarInput(elementsLogin.InputPassword(driver),Config.password);
        Thread.sleep(2000);

        // SE HACE EL SUBMIT DEL LOGIN
        utils.ClickButoon(elementsLogin.SubmitLogin(driver));
        utils.limpiarYllenarInput(elementsLogin.SubmitLogin(driver),Config.submitLogin);
        Thread.sleep(2000);


        /*WebElement buttonSignIn = driver.findElement(By.id("SubmitLogin"));
        buttonSignIn.click();
        Thread.sleep(2000); // hacerlo de tarea*/
    }

    public void cerrarSesion (WebDriver driver)
    {
        //*******NOTA DE ESTUDIO***************
        /* EN CADA CLASE DE FEAUTURES PODEMOS COLOCAR MULTIPLES FUNCIONALIDES,
           ES INDISPENSABLE CONTAR PRIMERO CON LOS ELEMENTOS WEB.
           EJEMPLO: DENTRO DE ESTE METODO PODEMOS DESARROLLAR EL PASO A PASO DE CERRAR
           SESION,
         */
    }
    
    public void loginIncorrecto (WebDriver driver)
    {

    }
}
