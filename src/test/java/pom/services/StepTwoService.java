package pom.services;

import pom.DriverActions;
import pom.pages.StepTwoPage;

public class StepTwoService {

    private StepTwoPage stepTwoPage;

    public StepTwoService(){
        this.stepTwoPage = new StepTwoPage();
    }

    public void clickSelectSize(){
        DriverActions.click(this.stepTwoPage.getBtn_seleccion_tamano() );
    }
    public void clickSelectColor(){
        DriverActions.click(this.stepTwoPage.getBtn_seleccion_color());
    }
    public void clickSelectQuantity(){
        DriverActions.click(this.stepTwoPage.getBtn_seleccion_cantidad());
        DriverActions.insertText(this.stepTwoPage.getBtn_seleccion_cantidad(),"2");

    }
    public void goCart(){
        DriverActions.click(this.stepTwoPage.getBtn_carro());
    }


}
