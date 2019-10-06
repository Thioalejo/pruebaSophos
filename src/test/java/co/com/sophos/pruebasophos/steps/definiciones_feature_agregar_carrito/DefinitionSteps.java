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
}
