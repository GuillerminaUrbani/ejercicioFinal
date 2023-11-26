package pom.services;

import pom.DriverActions;
import pom.pages.StepFivePage;


public class StepFiveService {

    StepFivePage stepFivePage;

    public StepFiveService(){
        this.stepFivePage= new StepFivePage();
    }


    public void completeForm(String emailAddress, String firstName, String lastName ,String streetAddress, String city, String state, String zip, String country, String phoneNumber) {
        DriverActions.explicitWaitNoLoading();

        DriverActions.insertText(this.stepFivePage.getTxt_emailAddress(),emailAddress);
        DriverActions.insertText(this.stepFivePage.getTxt_firstName(),firstName);
        DriverActions.insertText(this.stepFivePage.getTxt_lastName(),lastName);
        DriverActions.insertText(this.stepFivePage.getTxt_streetAddress(),streetAddress);
        DriverActions.insertText(this.stepFivePage.getTxt_city(),city);
        DriverActions.selectValue(this.stepFivePage.getSelect_state(),state);
        DriverActions.insertText(this.stepFivePage.getTxt_zip(),zip);
        DriverActions.selectValue(this.stepFivePage.getSelet_country(),country);
        DriverActions.insertText(this.stepFivePage.getTxt_phoneNumber(),phoneNumber);

    }

    public void clickCheck_shippingMethods(){
        DriverActions.click(this.stepFivePage.getCheck_shippingMethods());
    }

    public void clickBtn_next(){
        DriverActions.click(this.stepFivePage.getBtn_Next());
    }


   public void explicitWait_shippingMethods(){
        DriverActions.explicitWait(this.stepFivePage.getCheck_shippingMethods());
    }

}
