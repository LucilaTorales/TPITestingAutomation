package TPI.entrega.services;

import TPI.entrega.DriverActions;
import TPI.entrega.pages.PurchaseCompletePage;

public class PurchaseCompleteService {
    PurchaseCompletePage purchaseCompletePage;

    public PurchaseCompleteService(){
        this.purchaseCompletePage = new PurchaseCompletePage();
    }

    public String getTitle(){
        return DriverActions.getText(this.purchaseCompletePage.getTxt_title());
    }

    public Boolean isEnableContinueShopping(){
        return DriverActions.isEnabled(this.purchaseCompletePage.getContinue_shopping_button());
    }

    public Boolean isVisibleCreateAccount(){
        return DriverActions.isVisible(this.purchaseCompletePage.getCreate_account_button());
    }

    public String getNumberOrder(){
        return DriverActions.getText(this.purchaseCompletePage.getTxt_order_number());
    }
}
