package TPI.entrega.pages;

import org.openqa.selenium.By;

public class CheckoutStepOnePage {
    private By txt_email = By.id("customer-email");
    private By txt_first_name = By.name("firstname");
    private By txt_last_name = By.name("lastname");
    private By txt_company = By.name("company");
    private By txt_street_address = By.name("street[0]");
    private By txt_city= By.name("city");
    private By option_state_province= By.name("region_id");
    private By txt_zip_postal_code= By.name("postcode");
    private By option_country= By.name("country_id");
    private By txt_phone_number= By.name("telephone");
    private By option_shipping= By.name("ko_unique_1");

    private By next_button = By.xpath("//button[@class='button action continue primary']");


    public By getTxt_email() {
        return txt_email;
    }

    public By getTxt_first_name() {
        return txt_first_name;
    }

    public By getTxt_last_name() {
        return txt_last_name;
    }

    public By getTxt_company() {
        return txt_company;
    }

    public By getTxt_street_address() {
        return txt_street_address;
    }

    public By getTxt_city() {
        return txt_city;
    }

    public By getOption_state_province() {
        return option_state_province;
    }

    public By getTxt_zip_postal_code() {
        return txt_zip_postal_code;
    }

    public By getOption_country() {
        return option_country;
    }

    public By getTxt_phone_number() {
        return txt_phone_number;
    }

    public By getOption_shipping() {
        return option_shipping;
    }

    public By getNext_button() {
        return next_button;
    }

   
}
