package pom.pages;

import org.openqa.selenium.By;

public class StepOnePage {
    private By btn_agregar_carro_radiantTee = By.cssSelector("img[alt='Radiant Tee']");

    public By getBtn_agregar_carro_radiantTee() {
        return btn_agregar_carro_radiantTee;
    }
}
