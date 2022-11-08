package ambientepruebas;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Karina Madrigal
 */
public class AmbientePruebas {

    static WebDriver driver;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String url = "https://www.nacion.com/"; //probando la página de La Nacion CR

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Usuario\\Documents\\Sistemas"
                + "\\2022\\Cuatri III\\Calidad Software"
                + "\\Selenium\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        System.out.println("Page title is " + driver.getTitle());

//        driver.quit();
    }

}
