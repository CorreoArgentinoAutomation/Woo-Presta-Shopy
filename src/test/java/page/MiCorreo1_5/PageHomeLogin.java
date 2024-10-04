package page.MiCorreo1_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import framework.BasePage;

public class PageHomeLogin extends BasePage {

    public By emailLocator = By.id("email");
    public By passwordLocator = By.id("password");
    public By btnLogin = By.xpath("//button[@type=\"submit\" and @onclick=\"ValidacionLogin(event)\"]\n");
    private By miCuentaLocator = By.xpath("//span[normalize-space()='Mi cuenta']");
    private By btnlogOut = By.xpath("//a[@class='dropdown-item']");

    public PageHomeLogin(WebDriver driver) {
        super(driver);
    }
    public void login() {
        boolean loginExitoso = false;
        String expectedUrl = "https://wcpzt.correo.local/MiCorreo/public/message-home";
        int intentos = 0;
        int maxIntentos = 2; // Establece el número máximo de intentos

        while (!loginExitoso && intentos < maxIntentos) {
            try {
                // Paso 2
                writeText(emailLocator, "empctacte_test@yopmail.com");
                writeText(passwordLocator, "123123");
                click(btnLogin);

                // Paso 3
                waitForUrlToBe(expectedUrl, 2);

                // Verificar si la URL es la esperada
                String currentUrl = getCurrentURL(); // Utilizando la función encapsulada
                if (currentUrl.equals(expectedUrl)) {
                    // Si estamos en la página principal, el inicio de sesión es exitoso
                    System.out.println("¡Inicio de sesión exitoso!");
                    System.out.println("Estamos en la página principal (message-home).");
                    return; // Salir del método después de un inicio de sesión exitoso
                } else {
                    // Si no estamos en la página principal, continuar con el siguiente intento
                    System.out.println("Inicio de sesión fallido. No estamos en la página principal.");
                    intentos++;
                }
            } catch (Exception e) {
                // Si se produce una excepción, incrementar el contador de intentos
                intentos++;
                System.out.println("Intento de inicio de sesión #" + intentos + " fallido.");
            }
        }
        System.out.println("Inicio de sesión fallido después de " + maxIntentos + " intentos.");
    }

    public void loginOutline(String tipoUsuario) {
        String email;
        String password = "123123"; // Contraseña común para todos los tipos de usuario
        boolean loginExitoso = false;
        String expectedUrl = "https://wcpzt.correo.local/MiCorreo/public/message-home";
        int intentos = 0;
        int maxIntentos = 2; // Establece el número máximo de intentos


        if (tipoUsuario.equals("Consumidor final")) {
            email = "cf_tester02@yopmail.com";
        } else if (tipoUsuario.equals("Monotributista")) {
            email = "mono_tester@yopmail.com";
        } else if (tipoUsuario.equals("Empresa")) {
            email = "empctacte_test@yopmail.com";
        } else {
            throw new IllegalArgumentException("Tipo de usuario no válido: " + tipoUsuario);
        }

        while (!loginExitoso && intentos < maxIntentos) {
            try {
                // Llenar campos de email y contraseña con las credenciales específicas
                writeText(emailLocator, email);
                writeText(passwordLocator, password);
                click(btnLogin);

                // Esperar a que la URL sea la esperada después del inicio de sesión
                waitForUrlToBe(expectedUrl, 2);

                // Verificar si la URL es la esperada
                String currentUrl = getCurrentURL(); // Utilizando la función encapsulada
                if (currentUrl.equals(expectedUrl)) {
                    // Si estamos en la página principal, el inicio de sesión es exitoso
                    System.out.println("¡Inicio de sesión exitoso!");
                    System.out.println("Estamos en la página principal (message-home).");
                    loginExitoso = true;
                } else {
                    // Si no estamos en la página principal, continuar con el siguiente intento
                    System.out.println("Inicio de sesión fallido. No estamos en la página principal.");
                    intentos++;
                }
            } catch (Exception e) {
                // Si se produce una excepción, incrementar el contador de intentos
                intentos++;
                System.out.println("Intento de inicio de sesión #" + intentos + " fallido.");
            }
        }
        if (!loginExitoso) {
            System.out.println("Inicio de sesión fallido después de " + maxIntentos + " intentos.");
        }
    }


    public void logout(){
        click(miCuentaLocator);
        waitForSeconds(1);
        clickLastElementInDropdown(btnlogOut);
        waitForSeconds(3);
        System.out.println("Logout Exitoso!");
    }
}
