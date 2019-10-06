package co.com.sophos.pruebasophos.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

public class PrincipalPage extends PageObject {

    private static final String BOTON_NO_GRACIAS = "onesignal-popover-cancel-button";
    private static final String BUSCADOR = "search-autocomplete-input";

    @FindBy(id = BOTON_NO_GRACIAS)
    private WebElementFacade botonNoGracias;

    @FindBy(id = BUSCADOR)
    private WebElementFacade buscador;


    public void buscarProducto(String producto) throws InterruptedException {
        buscador.typeAndEnter(producto);
        Thread.sleep(5000);
    }

    public void darClicbotonNoGracias() {
        botonNoGracias.click();
    }
}
