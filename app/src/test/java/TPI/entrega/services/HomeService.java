package TPI.entrega.services;

import TPI.entrega.DriverActions;
import TPI.entrega.pages.HomePage;

public class HomeService {
    private HomePage homePage;

    public HomeService(){
        this.homePage = new HomePage();
    }

    public void goProductItemLinkRadiantTee(){
        DriverActions.click(this.homePage.getProduct_item_link_Radiant_Tee());
    }
}
