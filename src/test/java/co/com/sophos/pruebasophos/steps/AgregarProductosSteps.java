package co.com.sophos.pruebasophos.steps;

import co.com.sophos.pruebasophos.pages.InicioPage;
import co.com.sophos.pruebasophos.pages.PrincipalPage;
import net.thucydides.core.annotations.Step;

/**
 *
 * @author alejo
 */
public class AgregarProductosSteps {

    private InicioPage inicioPage;
    private PrincipalPage principalPage;
    
    @Step
    public void ingresarAPaginaInicial() throws InterruptedException {
        inicioPage.open();
    }

    @Step
    public void buscarProducto(String producto) throws InterruptedException {
        principalPage.darClicbotonNoGracias();
        principalPage.buscarProducto(producto);
    }
}
