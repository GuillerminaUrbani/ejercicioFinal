package pom.services;

import pom.DriverActions;
import pom.pages.StepSixPage;


public class StepSixService {

    StepSixPage stepSixPage;

    public StepSixService(){
        this.stepSixPage= new StepSixPage();
    }

    public void clickBtn_placeOrder(){
       // DriverActions.explicitWaitNoLoading();
        DriverActions.explicitWaitNoLoading();
       DriverActions.click(this.stepSixPage.getBtn_placeOrder());
    }


}
