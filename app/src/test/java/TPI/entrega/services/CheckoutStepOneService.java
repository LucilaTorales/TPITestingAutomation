package TPI.entrega.services;

import TPI.entrega.DriverActions;
import TPI.entrega.pages.CheckoutStepOnePage;

public class CheckoutStepOneService {

    private CheckoutStepOnePage CheckoutStepOnePage;

    public CheckoutStepOneService () {
        this.CheckoutStepOnePage = new CheckoutStepOnePage();
    }

    public void completedForm(String email , String firstName, String lastName, String company, String streetAddress, String city, String stateProvince, String postalCode, String country, String phoneNumber){
        DriverActions.insertText(this.CheckoutStepOnePage.getTxt_email(), email);
        DriverActions.insertText(this.CheckoutStepOnePage.getTxt_first_name(), firstName);
        DriverActions.insertText(this.CheckoutStepOnePage.getTxt_last_name(), lastName);
        DriverActions.insertText(this.CheckoutStepOnePage.getTxt_company(), company);
        DriverActions.insertText(this.CheckoutStepOnePage.getTxt_street_address(), streetAddress);
        DriverActions.insertText(this.CheckoutStepOnePage.getTxt_city(), city);
        DriverActions.selectOption(this.CheckoutStepOnePage.getOption_state_province(), stateProvince);
        DriverActions.insertText(this.CheckoutStepOnePage.getTxt_zip_postal_code(), postalCode);
        DriverActions.selectOption(this.CheckoutStepOnePage.getOption_country(), country);
        DriverActions.insertText(this.CheckoutStepOnePage.getTxt_phone_number(), phoneNumber);
    }

    public void selectShipping(){
        DriverActions.click(this.CheckoutStepOnePage.getOption_shipping());
    }

    public void stepOneNext(){
        DriverActions.click(this.CheckoutStepOnePage.getNext_button());
    }


}
