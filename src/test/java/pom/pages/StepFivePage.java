package pom.pages;

import org.openqa.selenium.By;


public class StepFivePage {

    private By txt_emailAddress = By.id("customer-email");
    private By txt_firstName  = By.name("firstname");
    private By txt_lastName  = By.name("lastname");
    private By txt_streetAddress  = By.name("street[0]");
    private By txt_city  = By.name("city");
    private By select_state  = By.name("region_id");
    private By txt_zip  = By.name("postcode");
    private By selet_country  = By.name("country_id");
    private By txt_phoneNumber  = By.name("telephone");
    private By check_shippingMethods = By.cssSelector("tbody tr:nth-child(1) td:nth-child(2)");

    private By btn_Next = By.cssSelector("span[data-bind=\"i18n: 'Next'\"]");
      public By getTxt_emailAddress() {
        return txt_emailAddress;
    }

    public By getTxt_firstName() {
        return txt_firstName;
    }

    public By getTxt_lastName() {
        return txt_lastName;
    }

    public By getTxt_streetAddress() {
        return txt_streetAddress;
    }

    public By getTxt_city() {
        return txt_city;
    }

    public By getSelect_state() {
        return select_state;
    }

    public By getTxt_zip() {
        return txt_zip;
    }

    public By getSelet_country() {
        return selet_country;
    }

    public By getTxt_phoneNumber() {
        return txt_phoneNumber;
    }

    public By getCheck_shippingMethods() {
        return check_shippingMethods;
    }

    public By getBtn_Next() {
        return btn_Next;
    }
}
