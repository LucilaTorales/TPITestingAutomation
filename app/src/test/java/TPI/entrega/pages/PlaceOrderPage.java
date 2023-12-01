package TPI.entrega.pages;

import org.openqa.selenium.By;

public class PlaceOrderPage {
    private By place_order_button = By.xpath("//button[@title='Place Order']");
    private By same_shipping_address = By.cssSelector("input#billing\\:same_as_shipping_yes");

    public By getPlace_order_button() {
        return place_order_button;
    }

    public By getSame_shipping_address() {
        return same_shipping_address;
    }
}
