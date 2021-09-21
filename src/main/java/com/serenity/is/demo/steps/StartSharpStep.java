package com.serenity.is.demo.steps;

import com.serenity.is.demo.pageobjet.StartSharpHomePage;
import com.serenity.is.demo.utils.ClaseBase;
import net.thucydides.core.annotations.Step;

public class StartSharpStep {

    ClaseBase claseBase;
    StartSharpHomePage startSharpPage;

    @Step
    public void abrirNavegador(){
        startSharpPage.open();
    }
    @Step
    public void escribirDatosIngreso(){
        claseBase.escribir(startSharpPage.getInputUsuario(),"admin");
        claseBase.escribir(startSharpPage.getInputClave(),"serenity");
        claseBase.click(startSharpPage.getBtnIngresar());
    }
    @Step
    public void validarIngreso(){
        claseBase.compararTexto(startSharpPage.getValidaNombre(),"admin");
    }

    @Step
    public void clickOrganizacion() throws InterruptedException {
        claseBase.click(startSharpPage.getOrganizacion());
        claseBase.click(startSharpPage.getUnidadNegocio());
        claseBase.click(startSharpPage.getCrearNegocio());

    }
    @Step
    public void crearNegocio(){
        claseBase.escribir(startSharpPage.getNameNegocio(), "prueba");
    }


}
