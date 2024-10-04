package page.PlataformaIntegracion.Woocommerce;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Home extends BasePage {

    private By btncheckup = By.xpath("(//a[@class='wp-block-pages-list__item__link wp-block-navigation-item__content'])[2]");
    private By btnCarrito = By.xpath("(//a[@class='wp-block-pages-list__item__link wp-block-navigation-item__content'])[1]");
    private By btnVerCarrito = By.xpath("(//a[@class='added_to_cart wc_forward'])[1]");
    private By menuShop = By.xpath("(//a[@class='wp-block-pages-list__item__link wp-block-navigation-item__content'])[5]");
    private By btnAgregarAlcarrito = By.xpath("(//span[@data-wc-text='state.addToCartText'])[1]");
    private By menuGroceries = By.xpath("(//a[@class='menu-link'])[2]");

    private By btnAgregarAcarrito = By.xpath("//button[@type='submit']");

    public Home(WebDriver driver) {
        super(driver);
    }

//    public void agregarAlCarrito() {
//        for (int i = 1; i <= 1; i++) {
//            String productoLocator = "(//a[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link'])[" + i + "]";
//            click(menuGroceries);
//            click(By.xpath(productoLocator));
//            click(btnAgregarAcarrito);
//        }
//
//        System.out.println("Se agregaron todos los productos al carrito");
//    }

    public void agregarAlCarrito() {

            click(menuShop);
            waitForSeconds(1);
            click(btnAgregarAlcarrito);
            System.out.println("Se agregaron todos los productos al carrito");
            scrollPageUpDown(3,0);
            waitForSeconds(25);

    }


    //1
    public void irAlTienda() {
        click(menuShop);
    }
    //2
    public void agregarAlProductoCarrito() {
        waitForSeconds(1);
        click(btnAgregarAlcarrito);
        scrollPageUpDown(3,0);
        waitForSeconds(25);
    }
    //3
        public void irAlCarrito() {
        click(btnCarrito);
    }
    public void irAlCheckup() {
        click(btncheckup);
    }


    //Flujo a seguir en el Home
    //1 - Dirigirse a la tienda que contiene los productos
    //2 - Agregar algun producto al carrito  esperar que se cargue en el carrito
    //3 - Dirigirse al Carrito

    public void generarPedidoHome(){
        irAlTienda();
        agregarAlProductoCarrito();
        irAlCheckup();
    }

}
