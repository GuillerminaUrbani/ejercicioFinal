package pom.services;

import pom.DriverActions;
import pom.pages.StepOnePage;

public class StepOneService {

    private StepOnePage stepOnePage;

    public StepOneService(){
        this.stepOnePage = new StepOnePage();
    }
    public void clickAddToCartRadiantTee(){
        DriverActions.click(this.stepOnePage.getBtn_agregar_carro_radiantTee());
    }
}
