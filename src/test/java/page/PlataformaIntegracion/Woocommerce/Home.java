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

    private By btnVerCarrito2 = By.xpath("(//a[contains(.,'Ver carrito')])[1]");
    private By actualizarCarrito = By.xpath("//button[@name='update_cart']");
    private By irCheckOut = By.xpath("//a[.='Finalizar compra']");
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

    //seleccionar varios productos para el algoritmo
    public void agregarAlProductosAValidar(String repetir) {
        waitForSeconds(1);
        //click(btnAgregarAlcarrito);
        int numero = Integer.parseInt(repetir);

        for (int i = 1; i <= numero; i++) { // Cambia 10 por el número máximo de elementos que esperas
            By btnAgregarAlcarrito = By.xpath("(//span[@data-wc-text='state.addToCartText'])[" + i + "]");
            // Aquí puedes agregar el código para interactuar con el elemento, por ejemplo:
             //driver.findElement(btnAgregarAlcarrito).click();

            waitForSeconds(10);
            click(btnAgregarAlcarrito);
            waitForSeconds(20);
        }
        //scrollPageUpDown(3,0);
        //irAlCarrito();

        waitForSeconds(15);
        //click(btnCarrito);
        //click(btnVerCarrito2);

    }


    public void agregarProductosAlCarrito(String repetir) {
        waitForSeconds(1);
        //click(btnAgregarAlcarrito);
        int numero = Integer.parseInt(repetir);

        for (int i = 1; i <= numero; i++) { // Cambia 10 por el número máximo de elementos que esperas
            By aumentarProductos = By.xpath("(//input[@class='input-text qty text'])[" + i + "]");
            // Aquí puedes agregar el código para interactuar con el elemento, por ejemplo:
            //driver.findElement(btnAgregarAlcarrito).click();
            waitForSeconds(1);
            click(aumentarProductos);
            writeText(aumentarProductos, "2");
            //waitForSeconds(1);
        }
        scrollPageUpDown(0,1);
        click(actualizarCarrito);
        waitForSeconds(10);
        scrollPageUpDown(2,0);

    }


    public void seleccionarLosProductosNecesarios(String nombreProducto) {

        switch (nombreProducto){
            case "paquete1","paquete2":
                agregarAlProductosAValidar("1");
                break;
            case "paquete3","paquete4","paquete11","paquete12":
                agregarAlProductosAValidar("2");
                break;
            case "paquete5","paquete6","paquete7","paquete8":
                agregarAlProductosAValidar("3");
                break;
            case "paquete9":
                agregarAlProductosAValidar("4");
                break;
            case "paquete10":
                agregarAlProductosAValidar("5");
                agregarAlProductosAValidar("5");
                //agregarProductosAlCarrito("5");
                break;
            default:
                System.out.println("No Esta definido ese producto: " + nombreProducto + "no existe");
        }
        click(btnVerCarrito2);
        click(irCheckOut);

    }


}
