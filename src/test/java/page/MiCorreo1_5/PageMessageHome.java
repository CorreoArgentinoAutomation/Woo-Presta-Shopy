package page.MiCorreo1_5;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageMessageHome extends BasePage {
    public By nuevoEnvioLocator = By.xpath("//li[@class='nav-item px-2 centrarDiv' and normalize-space()='Nuevo envío']");
    public PageMessageHome (WebDriver driver) {
        super(driver);
    }
    public void ingresarANuevoEnvio(){
        clickWithRetry(nuevoEnvioLocator);
        waitForSeconds(2);
        //assertURL("https://wcpzt.correo.local/MiCorreo/public/envioCla");
    }
}
