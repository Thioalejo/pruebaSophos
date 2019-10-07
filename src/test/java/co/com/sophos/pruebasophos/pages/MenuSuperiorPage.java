package co.com.sophos.pruebasophos.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

public class MenuSuperiorPage extends PageObject {
    //Declaracion de variables estaticas con valores de los objetos o elementos de en la pagina de "Menu"
    private static final String BOTON_CARRITO = ".minicart__action--toggle-open > .wicon--xxs";
    private static final String BOTON_VER_CARRITO = ".center > #minicart-navigation .primary > .text";
    
    //definicion de objetos y definicion de forma de acceder a ellos, sea por Id, xpath, o css
    @FindBy(css = BOTON_VER_CARRITO)
    private WebElementFacade botonVerCarrito;

    @FindBy(css = BOTON_CARRITO)
    private WebElementFacade botonCarrito;

    //Metodo con la accion a realizar, presiona el boton del carrito del menu y el boton ver carrito de compras para ver los agregados
    public void ingresarAEnCarrito() throws InterruptedException {
        Thread.sleep(2000);
        botonCarrito.click();
        Thread.sleep(2000);
        botonVerCarrito.click();
    }
}
