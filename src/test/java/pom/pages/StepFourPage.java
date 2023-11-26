package pom.pages;

import org.openqa.selenium.By;

public class StepFourPage {

    private By btn_proceedToCheckout = By.cssSelector("button[title='Proceed to Checkout'] span");

    public By getBtn_proceedToCheckout() {
        return btn_proceedToCheckout;
    }
}
