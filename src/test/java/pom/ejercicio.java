package pom;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.services.*;


public class ejercicio {
    @BeforeMethod
    public void setup(){
        DriverManager.create("chrome");
        DriverManager.goSite("https://magento.softwaretestingboard.com/");
    }
    @Test
    public void ejercicioCompra() throws InterruptedException {

        StepOneService stepOneService = new StepOneService();
        stepOneService.clickAddToCartRadiantTee();

        StepTwoService stepTwoService = new StepTwoService();
        stepTwoService.clickSelectSize();
        stepTwoService.clickSelectColor();
        stepTwoService.clickSelectQuantity();
        stepTwoService.goCart();

        StepThreeService stepThreeService = new StepThreeService();
        stepThreeService.clickShoppingCart();

        StepFourService stepFourService = new StepFourService();
        stepFourService.clickProceedToCheckout();

        StepFiveService stepFiveService = new StepFiveService();
        stepFiveService.completeForm("mgqwer@gmail.com","Maria", "Gonzalez" ,"Avenida Siempreviva 742", "Abc", "Alabama","12345-6789","Sudan","0303456");
        stepFiveService.explicitWait_shippingMethods();
        stepFiveService.clickCheck_shippingMethods();
        stepFiveService.clickBtn_next();

        StepSixService stepSixService = new StepSixService();
        stepSixService.clickBtn_placeOrder();

        //Validaciones

        ValidacionesService validacionesService = new ValidacionesService();

        //El título es igual a Thank you for purchase!
        Assert.assertTrue(
                validacionesService.getCompleteText().contains("Thank you for purchase!"),
                "No contiene --> Thank you for purchase!"
        );

        //El botón Continue Shopping esta habilitado.
        Assert.assertTrue(
                validacionesService.isEnableContinueShopping(),
                "El botón Continue Shopping --> no esta habilitado"
        );

        //El botón Create an Account está visible.
        Assert.assertTrue(
                validacionesService.isVisibleCreateAnAccount(),
                "El botón Create an Account --> no esta visible"
        );

        //El número de la orden (Your order # is:) es un número
       Assert.assertTrue(validacionesService.getCompleteText().matches("\"^[0-9]+$\""),
                "No contiene numeros"
       );

    }
}

