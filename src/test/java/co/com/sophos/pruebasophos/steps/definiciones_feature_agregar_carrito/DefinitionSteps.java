package co.com.sophos.pruebasophos.steps.definiciones_feature_agregar_carrito;

import co.com.sophos.pruebasophos.steps.AgregarProductosSteps;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

public class DefinitionSteps {

    @Steps
    AgregarProductosSteps agregarProductosSteps;

    @Dado("^que estoy en la pagina de compras$")
    public void que_estoy_en_la_pagina_de_compras() throws Exception {
        agregarProductosSteps.ingresarAPaginaInicial();
    }

    @Y("^he realizado la busqueda de \"([^\"]*)\"$")
    public void he_realizado_la_busqueda_de(String producto) throws Exception {
        agregarProductosSteps.buscarProducto(producto);
    }

    @Cuando("^carguen la lista deberia poder agregar al carrito \"([^\"]*)\"$")
    public void carguen_la_lista_deberia_poder_agregar_al_carrito(String productoElegido) throws Exception {
        agregarProductosSteps.cargarProductoAlCarritoDeCompras(productoElegido);
    }

    @Entonces("^al revisar el carrito de compras deberia poder ver mi producto \"([^\"]*)\" agregado exitosamente$")
    public void al_revisar_el_cariito_de_compras_deberia_poder_ver_mi_producto_agregado_exitosamente(String tituloProducto) throws Exception {
       agregarProductosSteps.validarProductoAgregadoAlCarritoDeCompras(tituloProducto);
    }
}

