package Practicas;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.html.HTMLInputElement;

public class TareasPracticas
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
            driver.get("http://automationpractice.com/index.php");
        }
        @Test
        public void login() throws InterruptedException
        {
            // WebElement buttonSingIn = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"));
            // WebElement buttonSingIn = driver.findElement(By.className("login"));
            WebElement buttonSingIn = driver.findElement(By.xpath("//a[@class='login']"));
            buttonSingIn.click();
            Thread.sleep(5000);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy (0,350)");
            Thread.sleep(3000);

            WebElement inputUser = driver.findElement(By.id("email"));
            inputUser.click();
            inputUser.clear();
            inputUser.sendKeys("test.0@test.com");
            Thread.sleep(2000);

            WebElement inputPassw = driver.findElement(By.id("passwd"));
            inputPassw.click();
            inputPassw.clear();
            inputPassw.sendKeys("test1235");
            Thread.sleep(2000);

            WebElement sendError = driver.findElement(By.className("alert alert-danger"));
            getClass("alert alert-danger");
            Thread.sleep(5000);


        }

            @After
            public void tearDown ()
            {
                //Cierra el navegador
                driver.quit();
            }




}
