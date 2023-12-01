package TPI.entrega.services;
import TPI.entrega.DriverActions;
import TPI.entrega.pages.ProductPage;

public class ProductService {
    private ProductPage productPage;

    public ProductService() {
        this.productPage = new ProductPage();
    }

    public void selectProductOption(String quantity){
        DriverActions.click(this.productPage.getOption_size());
        DriverActions.click(this.productPage.getOption_color());
        DriverActions.insertText(this.productPage.getTxt_quantity(), quantity);
        DriverActions.click(this.productPage.getProduct_add_to_cart_button());
    }

    public void goCart(){
        DriverActions.click(this.productPage.getShopping_cart_button());
    }
}
