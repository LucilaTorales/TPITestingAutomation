package TPI.entrega;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TPI.entrega.services.CartService;
import TPI.entrega.services.CheckoutStepOneService;
import TPI.entrega.services.HomeService;
import TPI.entrega.services.PlaceOrderService;
import TPI.entrega.services.ProductService;
import TPI.entrega.services.PurchaseCompleteService;


public class CompraTest {
    @BeforeMethod
    public void setup(){
        DriverManager.create("chrome");
        DriverManager.goSite("https://magento.softwaretestingboard.com/");
    }

    @Test
    public void compraDePrenda(){
        HomeService homeService = new HomeService();
        homeService.goProductItemLinkRadiantTee();
        DriverManager.esperaImplicita();

        ProductService productService = new ProductService();
        productService.selectProductOption("2");
        productService.goCart();
        DriverManager.esperaImplicita();

        CartService cartService = new CartService();
        cartService.goCheckout();
        DriverManager.esperaImplicita();

        CheckoutStepOneService checkoutStepOneService = new CheckoutStepOneService();
        checkoutStepOneService.completedForm("nelson.campos@ggmail.com", "Nelson", "Campos", "QA", "Calle Falsa 123", "Cordoba", "12", "90210", "US", "351888888");
        checkoutStepOneService.selectShipping();
        checkoutStepOneService.stepOneNext();
        DriverManager.esperaImplicita();

        PlaceOrderService placeOrderService = new PlaceOrderService();
        placeOrderService.goPlaceOrder();
        DriverManager.esperaImplicita();
        //Compra completada
        
        PurchaseCompleteService purchaseCompleteService = new PurchaseCompleteService();
        
        //El titulo es igual a “Thank you for purchase!”
        Assert.assertTrue(
            purchaseCompleteService.getTitle().contains("Thank you for purchase!"),
            "El titulo no es igual a Thank you for purchase!"
        );
        //Esta habilitado el boton Continue Shopping
        Assert.assertTrue(
            purchaseCompleteService.isEnableContinueShopping(),
            "El botón 'Continue Shopping' no esta habilitado"
        );
        //Esta visible el boton Create an Account
        Assert.assertTrue(
            purchaseCompleteService.isVisibleCreateAccount(),
            "El botón 'Create an Account' no esta visible"
        );
        // El numero de orden es un numero
        Assert.assertTrue(
            !purchaseCompleteService.getNumberOrder().split("Your order # is:")[1].matches(".*//d+//.$"),
            "El numero de orden no es un numero"
        );

        

    }
}
