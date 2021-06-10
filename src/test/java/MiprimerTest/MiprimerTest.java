package MiprimerTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.html.HTMLInputElement;

public class MiprimerTest
{
    private WebDriver driver;
    @Before
    public void setUp() {
        // Se coloca la dirección del Driver, sea Chrome, Firefox o Edge
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/ChromeDriver/chromedriver.exe");

        // Crea la instancia del navegador (es una ventana)
        driver = new ChromeDriver();

        //maximiza el navegador
        driver.manage().window().maximize();

        //Envia la direccion del sistema al navegador
        driver.get("https://www.amazon.com/");
    }
    /*
    // Este  Xpath es absoluto, por buenas practicas no se debe utilizar
       @Test
       public void TestAmazon() throws InterruptedException
       {
          WebElement buttonCompras = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div[1]/div[3]/div/a[3]/div[1]/span[1]"));
          buttonCompras.click();
          Thread.sleep(5000);
       }
*/
    //Utilizando xpath con tag (tag: span, img, button, input, select)y un atributo
    //
    @Test
    public void TestAmazon() throws InterruptedException
    {
        WebElement buttonCompras = driver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div[3]/div/a[1]/span"));
                //("//span[contains(text(),'Cuentas y Listas')]"));
        cuentayListas.click();
        Thread.sleep(5000);
    }

    @Test
            public void
    {
        WebElement inputBusqueda = driver.findElement(By.xpath("//input[@id='tmptabsearchtextbox' and @dir='auto']"));
        inputBusqueda.click();
        inputBusqueda.click();
        inputBusqueda.sendKeys("Celulares");
        inputBusqueda.submit();

        Thread.sleep(5000);
    }

       /*

    {
   //     Thread.sleep(5000);
        WebElement inputBusqueda = driver.findElement(By.id("twotabsearchtextbox"));
        inputBusqueda.click();
        inputBusqueda.sendKeys("Alexa");
        WebElement BottonLupa = driver.findElement(By.id("nav-search-submit-button"));
        BottonLupa.click();
      //  inputBusqueda.submit();
        Thread.sleep(4000);
    }

        @Test
        public void usoXpath() throws InterruptedException;
*/

    @After
    public void tearDown()
    {
        //Cierra el navegador
        driver.quit();
    }
}
