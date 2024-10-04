package page.MiCorreo1_5;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageForm extends BasePage {

    protected By visaLocator = By.xpath("//label[@title='Visa']");
    protected By numeroTarjeta = By.xpath("//input[@id='card_number']11");
    protected By codSeguridad = By.xpath("//input[@id='security_code']");
    protected By mesVencimiento = By.xpath("//input[@id='card_expiration_month']");
    protected By anoVencimiento = By.xpath("//input[@id='card_expiration_year']");
    protected By nombreTitular = By.xpath("//input[@id='card_holder_name']");
    protected By numeroDocumento = By.xpath("//input[@id='card_holder_doc_number']");
    protected By btnPagarLocator = By.xpath("//button[@id='pagar']");
    public PageForm(WebDriver driver){
        super (driver);
    }
    public void pagoConTarjeta(){
        click(visaLocator);
        writeText(numeroTarjeta,"4507990000004905");
        writeText(codSeguridad,"775");
        writeText(mesVencimiento,"08");
        writeText(anoVencimiento,"25");
        writeText(nombreTitular,"TARJETA VISA");
        writeText(numeroDocumento,"27859328");
        waitForSeconds(2);
        clickWithRetry(btnPagarLocator);
        waitForSeconds(5);
    }
}
