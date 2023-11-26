package pom.pages;

import org.openqa.selenium.By;

public class ValidacionesPage {

    private By txt_texto = By.className("page-main");

    private By btn_continueShopping = By.cssSelector(".action.primary.continue");

    private By btn_createAnAccount = By.cssSelector(".action.primary[data-bind='attr: { href: getUrl() }']");

    private By txt_textoOrden = By.className("page-main");

    public By getTxt_texto() {
        return txt_texto;
    }

    public By getBtn_continueShopping() {
        return btn_continueShopping;
    }

    public By getBtn_createAnAccount() {
        return btn_createAnAccount;
    }

    public By getTxt_textoOrden() {
        return txt_textoOrden;
    }

}
