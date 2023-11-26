package pom.pages;

import org.openqa.selenium.By;

public class StepTwoPage {

    private By btn_seleccion_tamano = By.id("option-label-size-143-item-169");
    private By btn_seleccion_color = By.id("option-label-color-93-item-50");
    private By btn_seleccion_cantidad = By.id("qty");
    private By btn_carro = By.cssSelector("#product-addtocart-button");

    public By getBtn_seleccion_tamano() {
        return btn_seleccion_tamano;
    }

    public By getBtn_seleccion_color() {
        return btn_seleccion_color;
    }

    public By getBtn_seleccion_cantidad() {
        return btn_seleccion_cantidad;
    }

    public By getBtn_carro() {
        return btn_carro;
    }


}
