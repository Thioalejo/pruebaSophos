package co.com.sophos.pruebasophos.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

public class DetalleProductoPage extends PageObject {

    private static final String BOTON_AGREGAR_AL_CARRITO_DE_COMPRAS = ".product-add-to-cart__text:nth-child(5)";

    @FindBy(css = BOTON_AGREGAR_AL_CARRITO_DE_COMPRAS)
    private WebElementFacade botonAgregarAlCarritoDeCompras;

    public void presionarBotonAgregar() throws InterruptedException {
        botonAgregarAlCarritoDeCompras.click();
        Thread.sleep(5000);
    }
}
