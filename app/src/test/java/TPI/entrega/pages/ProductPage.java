package TPI.entrega.pages;

import org.openqa.selenium.By;

public class ProductPage {
    private By option_size = By.id("option-label-size-143-item-169");
    private By option_color= By.id("option-label-color-93-item-50");
    private By txt_quantity = By.id("qty");
    private By product_add_to_cart_button = By.id("product-addtocart-button");
    private By shopping_cart_button = By.linkText("shopping cart");


    public By getOption_size() {
        return option_size;
    }

    public By getOption_color() {
        return option_color;
    }
    
    public By getTxt_quantity() {
        return txt_quantity;
    }
    
    public By getProduct_add_to_cart_button() {
        return product_add_to_cart_button;
    }

    public By getShopping_cart_button() {
        return shopping_cart_button;
    }

}
