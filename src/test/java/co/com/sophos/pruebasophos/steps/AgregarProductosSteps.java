package co.com.sophos.pruebasophos.steps;

import co.com.sophos.pruebasophos.pages.CarritoDeComprasPage;
import co.com.sophos.pruebasophos.pages.DetalleProductoPage;
import co.com.sophos.pruebasophos.pages.InicioPage;
import co.com.sophos.pruebasophos.pages.MenuSuperiorPage;
import co.com.sophos.pruebasophos.pages.PrincipalPage;
import co.com.sophos.pruebasophos.util.ListaDeProductosPage;
import net.thucydides.core.annotations.Step;
import static junit.framework.Assert.assertTrue;

/**
 *
 * @author alejo
 */
public class AgregarProductosSteps {

    private InicioPage inicioPage;
    private PrincipalPage principalPage;
    private ListaDeProductosPage listaDeProductosPage;
    private DetalleProductoPage detalleProductoPage;
    private MenuSuperiorPage menuSuperiorPage;
    private CarritoDeComprasPage carritoDeComprasPage;
    
    @Step
    public void ingresarAPaginaInicial() throws InterruptedException {
        inicioPage.open();
    }

    @Step
    public void buscarProducto(String producto) throws InterruptedException {
        principalPage.darClicbotonNoGracias();
        principalPage.buscarProducto(producto);
    }
    
    @Step
    public void cargarProductoAlCarritoDeCompras(String tituloProducto) throws InterruptedException {
        listaDeProductosPage.darClicPorTextoXPath(tituloProducto);
        detalleProductoPage.presionarBotonAgregar();
        Thread.sleep(5000);
    }

    @Step
    public void ingresarAVerListaProductoAgregadoAlCarritoDeCompras(String tituloProducto) throws InterruptedException {
        menuSuperiorPage.ingresarAEnCarrito();
        if (!carritoDeComprasPage.validarProductoEnCarrito().equals(tituloProducto)) {
            assertTrue("No se visualiza el texto esperado: " + tituloProducto, false);
        }
        
    }
    
}
