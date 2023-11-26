package pom.services;

import pom.DriverActions;
import pom.pages.StepThreePage;

public class StepThreeService {

    private StepThreePage stepThreePage;

    public StepThreeService(){
        this.stepThreePage = new StepThreePage();
    }

    public void clickShoppingCart(){
        DriverActions.click(this.stepThreePage.getBtn_enlace_shoppingCart());
    }



}
