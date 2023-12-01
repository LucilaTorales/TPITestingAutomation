package TPI.entrega.pages;

import org.openqa.selenium.By;

public class PurchaseCompletePage {
    private By txt_title = By.xpath("//span[contains(text(),'Thank you for purchase!')]");
    private By continue_shopping_button = By.xpath("//a[@class='action primary continue']");
    private By create_account_button = By.xpath("//a[@class='action primary']");
    private By txt_order_number = By.xpath("//p[contains(text(),'Your order #')]"); 
    
    public By getTxt_title() {
        return txt_title;
    }
    
    public By getContinue_shopping_button() {
        return continue_shopping_button;
    }
    
    public By getCreate_account_button() {
        return create_account_button;
    }
    
    public By getTxt_order_number() {
        return txt_order_number;
    }

    
    
}
