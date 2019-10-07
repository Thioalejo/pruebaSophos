package co.com.sophos.pruebasophos.util;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ListaDeProductosPage extends PageObject{
    //Metodo que busca un objeto en pantalla por el texto y da clic en él
    public void darClicPorTextoXPath(String textoADarCick) throws InterruptedException {
        try {
            getDriver().findElement(By.xpath("//*[contains(text(),'" + textoADarCick + "')]")).click();
        } catch (Exception e) {
            e.getMessage();
        }
    }
    
}
