package com.serenity.is.demo.is.test.stepdefinition;

import com.serenity.is.demo.steps.StartSharpStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class StartSharpStepDefinition {

    @Steps
    StartSharpStep startSharpStep;

    @Dado("^que el usuario se encuentra en la pagina$")
    public void queElUsuarioSeEncuentraEnLaPagina() throws Exception {
        startSharpStep.abrirNavegador();
    }

    @Cuando("^ingresa su usuario y clave$")
    public void ingresaSuUsuarioYClave() throws Exception {
        startSharpStep.escribirDatosIngreso();

    }

    @Entonces("^el usuario se loguea\\.$")
    public void elUsuarioSeLoguea() throws Exception {
        startSharpStep.validarIngreso();
        startSharpStep.clickOrganizacion();
        startSharpStep.crearNegocio();
        Thread.sleep(5000);
    }

}
