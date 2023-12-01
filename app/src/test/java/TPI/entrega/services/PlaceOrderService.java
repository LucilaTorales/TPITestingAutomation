package TPI.entrega.services;


import TPI.entrega.DriverActions;
import TPI.entrega.pages.PlaceOrderPage;

public class PlaceOrderService {
    private PlaceOrderPage placeOrderPage;

    public PlaceOrderService(){
        this.placeOrderPage = new PlaceOrderPage();
    }

    public void goPlaceOrder(){
        DriverActions.click(this.placeOrderPage.getPlace_order_button());
    }

}
