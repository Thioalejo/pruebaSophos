package co.com.sophos.pruebasophos.util;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ListaDeProductosPage extends PageObject{
    public void darClicPorTextoXPath(String textoADarCick) throws InterruptedException {
        try {
            getDriver().findElement(By.xpath("//*[contains(text(),'" + textoADarCick + "')]")).click();
        } catch (Exception e) {
            e.getMessage();
        }
    }
    
}
