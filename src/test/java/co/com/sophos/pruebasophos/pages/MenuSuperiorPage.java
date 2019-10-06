package co.com.sophos.pruebasophos.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

public class MenuSuperiorPage extends PageObject {

    private static final String BOTON_CARRITO = ".minicart__action--toggle-open > .wicon--xxs";
    private static final String BOTON_VER_CARRITO = ".center > #minicart-navigation .primary > .text";
    

    @FindBy(css = BOTON_VER_CARRITO)
    private WebElementFacade botonVerCarrito;

    @FindBy(css = BOTON_CARRITO)
    private WebElementFacade botonCarrito;

    public void ingresarAEnCarrito() throws InterruptedException {
        Thread.sleep(2000);
        botonCarrito.click();
        Thread.sleep(2000);
        botonVerCarrito.click();
    }
}
