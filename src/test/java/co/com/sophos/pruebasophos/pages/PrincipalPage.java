package co.com.sophos.pruebasophos.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

public class PrincipalPage extends PageObject {

    //Declaracion de variables estaticas con valores de los objetos o elementos de en la pagina de princial
    private static final String BOTON_NO_GRACIAS = "onesignal-popover-cancel-button";
    private static final String BUSCADOR = "search-autocomplete-input";

    @FindBy(id = BOTON_NO_GRACIAS)
    private WebElementFacade botonNoGracias;

    @FindBy(id = BUSCADOR)
    private WebElementFacade buscador;

    //metodo para buscar el producto
    public void buscarProducto(String producto) throws InterruptedException {
        buscador.typeAndEnter(producto);
        Thread.sleep(5000);
    }

    //Metodo para dar clic al mensaje emergente mostrado al cargar la pagina
    public void darClicbotonNoGracias() {
        botonNoGracias.click();
    }
}
