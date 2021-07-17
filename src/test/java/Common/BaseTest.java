package Common;

import Features.Login;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest
{
    //************* Instancias********************

    protected static WebDriver driver = null;
    Login login = new Login();


    @Before
    public void Login() throws Exception
    {
        // Crear Driver
        driver = Config.navegadorFirefox();

        //MAXIMIZA LA VENTANA DEL NAVEGADOR
        driver.manage().window().maximize();

        //LA FUNCION "driver.get", NOS SIRVE PARA MANDAR LA URL AL NAVEGADOR
        driver.get(Config.URL_QA);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // POR MEDIO DEL OBJETO "login", MANDAMOS TRAER (INSTANCIAMS) EL PROCESO DE INICIAR SESION
        login.miLogin(driver);

    }

    @After
    public void theardown()
    {
        //LA FUNCION "driver.quit", NOS SIRVE PARA CERRAR EL NAVEGADOR
       // driver.quit();

    }

}
