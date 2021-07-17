package Features;

import Common.BaseTest;
import Elements.ElementsSelects;
import Utils.SeleniumUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Selects extends BaseTest
{
    //***********INSTANCIAS***********
    SeleniumUtils Utils = new SeleniumUtils();
    ElementsSelects elementsSelects = new ElementsSelects();

    @Test
    public void listaConClicks () throws Exception
    {
        //SE VALIDA LA PRESENCIA DEL ELEMENTO TAP WOMAN
        Utils.waitElement(driver,elementsSelects.TapWoman(driver),elementsSelects.byTapWoman);

        //SE DA CLICK EN EL ELEMENTO TAP WOMAN
        Utils.clickButton(elementsSelects.TapWoman(driver));
        Utils.loading(driver,3000);

        //SE VALIDA LA PRESENCIA DEL ELEMENTO MAS (BOTON +) DE LA OPCION TOPS
        Utils.waitElement(driver,elementsSelects.BottonMasTops(driver),elementsSelects.bybottonMasTops);

        //SE DA CLIC EN EL ELEMENTO OPCION TOPS
        Utils.clickButton(elementsSelects.BottonMasTops(driver));
        Utils.loading(driver,2000);

        //SE VALIDA LA PRESENCIA DEL ELEMENTO T-SHIRTS
        Utils.waitElement(driver,elementsSelects.BottonTSshirts(driver),elementsSelects.bybottonTSshirts);

        //SE DA CLICK EN EL ELEMENTO T-SHIRTS
        Utils.clickButton(elementsSelects.BottonTSshirts(driver));

        //***************SELECCIONAR OPCIONES DE LA LISTA CON CLICKS************
        /*ESTA OPCION POR BUENAS PRACTICAS NO SE UTILIZA (util para listas pequeñas*/


        //SE VALIDA LA PRESENCIA DEL ELEMENTO "LISTA SORT"
        Utils.waitElement(driver,elementsSelects.SelectSort(driver),elementsSelects.bySelectSort);

        //SE DA CLIC EN LA LISTA SORT
        Utils.clickButton(elementsSelects.SelectSort(driver));
        Utils.loading(driver,2000);  //el loading es equivalente al thearsleep

        //SE SELECCIONA LA OPCION "IN STOCK"
        String opcionEsperada = "In stock";
        String opcionBuscar = String.format("//option[text()='%s']",opcionEsperada); //%s permite recibir cualquier texto que se ingrese
        WebElement option = driver.findElement(By.xpath(opcionBuscar));
        option.click();
        Utils.loading(driver,3000);





    }

}
