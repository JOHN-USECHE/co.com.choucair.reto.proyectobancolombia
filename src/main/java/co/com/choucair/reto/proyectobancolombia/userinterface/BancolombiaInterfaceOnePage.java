package co.com.choucair.reto.proyectobancolombia.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class BancolombiaInterfaceOnePage extends PageObject{

    public static final Target ENTER_BUTTON = Target.the("button to close")
            .located(By.xpath("//button[contains(@class,'btn-close-modal btn-modal')]"));

    public static final Target SELECT_MENU = Target.the("select products and services")
            .located(By.id("menu-productos"));

    public static final Target  BUTTON_GOLEASING = Target.the("select Leasing")
            .located(By.id("header-productos-leasing"));

    public static final Target  BUTTON_HABIGOLEASING = Target.the("select Leasing housing ")
            .located(By.linkText("Leasing Habitacional"));

    public static final Target  BUTTON_SIMULA = Target.the("select simula")
            .located(By.linkText("Simula"));

    public static final Target  BUTTON_CALCUOTA = Target.the("select button calculate housing installments")
            .located(By.id("calcular-cuotas"));



}
