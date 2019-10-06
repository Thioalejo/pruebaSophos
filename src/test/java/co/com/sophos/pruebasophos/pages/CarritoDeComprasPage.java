package co.com.sophos.pruebasophos.pages;

import co.com.sophos.pruebasophos.util.Scroll;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

public class CarritoDeComprasPage extends PageObject {

    private static final String PRODUCTO = "product-item__name";
    private static final String CUPON = "coupon-input";
    private Scroll scroll;

    @FindBy(className = PRODUCTO)
    private WebElementFacade Producto;

    @FindBy(id = CUPON)
    private WebElementFacade Cupon;

    public String validarProductoEnCarrito() throws InterruptedException {
        scroll.scroll(Cupon);
        Thread.sleep(2000);
        return Producto.getText();
    }
}
