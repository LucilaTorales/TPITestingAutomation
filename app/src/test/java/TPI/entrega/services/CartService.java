package TPI.entrega.services;


import TPI.entrega.DriverActions;
import TPI.entrega.pages.CartPage;

public class CartService {
    private CartPage cartPage;

    public CartService() {
        this.cartPage = new CartPage();
    }

    public void goCheckout(){
        
        DriverActions.click(this.cartPage.getCheckout_button());
    }
}
