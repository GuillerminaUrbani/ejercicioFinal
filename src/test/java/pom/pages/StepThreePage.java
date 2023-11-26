package pom.pages;

import org.openqa.selenium.By;

public class StepThreePage {

    private By btn_enlace_shoppingCart = By.partialLinkText("shopping cart");

    public By getBtn_enlace_shoppingCart() {
        return btn_enlace_shoppingCart;
    }
}
