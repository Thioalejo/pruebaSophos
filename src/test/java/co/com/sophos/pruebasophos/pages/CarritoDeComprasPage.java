package co.com.sophos.pruebasophos.pages;

import co.com.sophos.pruebasophos.util.Scroll;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

public class CarritoDeComprasPage extends PageObject {

    //Declaracion de variables estaticas con valores de los objetos o elementos de en la pagina de carrito de compras
    private static final String PRODUCTO = "product-item__name";
    private static final String CUPON = "coupon-input";
    private Scroll scroll;

    @FindBy(className = PRODUCTO)
    private WebElementFacade Producto;

    //Elemeto elegido para realizar scroll en pantalla
    @FindBy(id = CUPON)
    private WebElementFacade Cupon;

    //Metodo que realiza scroll en la pagina y realiza captura del producto cargado en la pagina y lo devuelve para su validacion
    public String validarProductoEnCarrito() throws InterruptedException {
        scroll.scroll(Cupon);
        Thread.sleep(2000);
        return Producto.getText();
    }
}
