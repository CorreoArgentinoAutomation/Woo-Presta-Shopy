package page.MiCorreo1_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import framework.BasePage;

public class PageMiSaldo extends PageNuevoEnvio {
    private By btnHamburguesaMenu = By.xpath("//button[@class='btn-menu']");
    protected By btnPagarLocator2 = By.xpath("//button[@id='pagar']");
    private By btnMiSaldo = By.xpath("//body/div[@id='offcanvasWithBothOptions']/div[2]/ul[1]/li[4]/button[1]/span[1]");
    private By dropdownSaldoACargar = By.xpath("//select[@id='tipo_saldoModal']");
    private By cargarValorIgualEnvio = By.xpath("(//option[normalize-space()='Cargar valor igual al total de la compra'])[1]");
    private By precioTotalDelEnvioLocator = By.xpath("//small[@style='font-weight:bold;font-size:1.1em;font-color:#254888;']");
    private By saldoActualLocator = By.xpath("//small[@style='font-weight:bold;font-size:1.1em;']\n");
    private By recargarSaldo = By.xpath("//span[text()=' Recargar saldo ']");
    private By recargaConTarjeta = By.xpath("(//input[@id='radioTarjeta'])[2]");
    private By campoValorRecarga = By.xpath("//input[@id='valorcargaModal']");
    private By btnPagarRecarga = By.xpath("(//button[@class='btn btn-correo-primary'])[2]");

    public PageMiSaldo(WebDriver driver) {
        super(driver);
    }
    public void recargarSaldo(){
        click(btnHamburguesaMenu);
        waitForSeconds(1);
        try {
            click(btnMiSaldo);;
        }catch (Exception e){
            click(btnMiSaldo);}
        waitForSeconds(2);
        click(recargarSaldo);
        waitForSeconds(3);
        click(recargaConTarjeta);
        writeText(campoValorRecarga,"1000");
        click(btnPagarRecarga);
        click(visaLocator);
        writeText(numeroTarjeta,"4507990000004905");
        writeText(codSeguridad,"775");
        writeText(mesVencimiento,"08");
        writeText(anoVencimiento,"25");
        writeText(nombreTitular,"TARJETA VISA");
        writeText(numeroDocumento,"27859328");
        try {
            click(btnPagarLocator2);
        }catch (Exception e){
            click(btnPagarLocator2);}
        waitForSeconds(7);
    }
}
