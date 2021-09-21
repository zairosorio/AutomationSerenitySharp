package com.serenity.is.demo.pageobjet;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://serenity.is/demo/")
public class StartSharpHomePage extends PageObject {

    private By inputUsuario = By.xpath("//input[@id='StartSharp_Membership_LoginPanel0_Username']");
    private By inputClave = By.xpath("//input[@id='StartSharp_Membership_LoginPanel0_Password']");
    private By btnIngresar = By.id("StartSharp_Membership_LoginPanel0_LoginButton");
    private By validaNombre = By.xpath("//span[@class='hidden-xs']");
    private By organizacion = By.xpath("//*[@id=\"SidebarMenu\"]/li[6]/a/span");
    private By unidadNegocio = By.xpath("//ul[@class='treeview-menu menu-open']//i[@class='nav-icon fa fa-sitemap']");
    private By crearNegocio = By.xpath("//i[@class='fa fa-plus-circle text-green']");
    private By nameNegocio = By.xpath("//input[@name='Name']");
    private By unidadPadre = By.xpath("//a[@class='select2-choice select2-default']");

    public By getNameNegocio() {
        return nameNegocio;
    }


    public By getCrearNegocio() {
        return crearNegocio;
    }


    public By getUnidadNegocio() {
        return unidadNegocio;
    }


    public By getOrganizacion() {
        return organizacion;
    }


    public By getValidaNombre() {
        return validaNombre;
    }

    public By getBtnIngresar() {
        return btnIngresar;
    }


    public By getInputUsuario() {
        return inputUsuario;
    }

    public By getInputClave() {
        return inputClave;
    }


}
