package com.serenity.is.demo.utils;

import net.serenitybdd.core.pages.PageObject;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ClaseBase extends PageObject {

    public void escribir(By elemento, String texto) {
        getDriver().findElement(elemento).sendKeys(texto);
    }

    public void click(By elemento) {
        getDriver().findElement(elemento).click();
    }
    public void optenerTexto(By elemento){
        getDriver().findElement(elemento).getText();
    }
    public void compararTexto(By elemento, String texto){
        Assert.assertEquals(getDriver().findElement(elemento).getText(),texto);
    }

}
