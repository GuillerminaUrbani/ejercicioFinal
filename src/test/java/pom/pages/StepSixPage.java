package pom.pages;

import org.openqa.selenium.By;

public class StepSixPage {

    private By btn_placeOrder = By.cssSelector("span[data-bind=\"i18n: 'Place Order'\"]");

    public By getBtn_placeOrder() {
        return btn_placeOrder;
    }
}
