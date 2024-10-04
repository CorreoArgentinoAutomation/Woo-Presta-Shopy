package page.MiCorreo1_5;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PagePayment extends BasePage {
    private By integracionPagoLocator = By.xpath("(//td[@class='table-text text-center'])[1]");
    private By origenPagoLocator = By.xpath("(//td[@class='table-text text-center'])[3]");
    private By destinoPagoLocator = By.xpath("(//td[@class='table-text text-center'])[4]");
    private By pesoPagoLocator = By.xpath("(//td[@class='table-text text-center'])[5]");
    private By largoPagoLocator = By.xpath("(//td[@class='table-text text-center'])[6]");
    private By anchoPagoLocator = By.xpath("(//td[@class='table-text text-center'])[7]");
    private By altoPagoLocator = By.xpath("(//td[@class='table-text text-center'])[8]");
    private By TNDePagoLocator = By.xpath("(//td[@class='table-text text-center'])[9]");
    private By mensajePagoLocator = By.xpath("//h6[@class='mb-1 text-muted' and normalize-space()='¡Genial! Tu pago fue procesado correctamente.']");
    public PagePayment(WebDriver driver){
        super(driver);
    }

    public void verificarPago() {
        boolean mensajeCorrecto = compararTextoConMensajeEsperado(mensajePagoLocator, "¡Genial! Tu pago fue procesado correctamente.");

        if (mensajeCorrecto) {
            System.out.println("El mensaje de confirmación del pago es correcto.");

            // Validar otros campos relevantes
            validarCampo("Integración", integracionPagoLocator, getText(integracionPagoLocator));
            validarCampo("Origen", origenPagoLocator, getText(origenPagoLocator));
            validarCampo("Destino", destinoPagoLocator, getText(destinoPagoLocator));
            validarCampo("Peso", pesoPagoLocator, getText(pesoPagoLocator));
            validarCampo("Largo", largoPagoLocator, getText(largoPagoLocator));
            validarCampo("Ancho", anchoPagoLocator, getText(anchoPagoLocator));
            validarCampo("Alto", altoPagoLocator, getText(altoPagoLocator));
            validarCampo("TN", TNDePagoLocator, getText(TNDePagoLocator));

            System.out.println("Todos los campos relevantes fueron validados correctamente.");

        } else {
            System.out.println("El mensaje de confirmación del pago no coincide con el texto esperado.");
        }
    }

}
