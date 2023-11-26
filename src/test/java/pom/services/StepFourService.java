package pom.services;

import pom.DriverActions;
import pom.pages.StepFourPage;

public class StepFourService {

    StepFourPage stepFourPage;

    public  StepFourService(){
        this.stepFourPage = new StepFourPage();
    }

    public void clickProceedToCheckout(){
       // DriverActions.explicitWaitNoLoading();
        DriverActions.click(this.stepFourPage.getBtn_proceedToCheckout());
    }

}
