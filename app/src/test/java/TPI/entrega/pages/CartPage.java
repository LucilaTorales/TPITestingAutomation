package TPI.entrega.pages;

import org.openqa.selenium.By;

public class CartPage {
    private By checkout_button = By.xpath("//button[@title='Proceed to Checkout']");

    public By getCheckout_button() {
        return checkout_button;
    }
}
