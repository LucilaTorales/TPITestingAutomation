package TPI.entrega.pages;

import org.openqa.selenium.By;

public class HomePage {
    private String urlHomePage = "https://magento.softwaretestingboard.com/";
    private By product_item_link_Radiant_Tee = By.linkText("Radiant Tee");

    public String getUrlHomePage(){
        return this.urlHomePage;
    }

    public By getProduct_item_link_Radiant_Tee() {
        return product_item_link_Radiant_Tee;
    }

}
