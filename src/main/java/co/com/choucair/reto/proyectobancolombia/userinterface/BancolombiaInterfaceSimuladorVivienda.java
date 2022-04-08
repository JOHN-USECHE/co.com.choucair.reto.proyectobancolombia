package co.com.choucair.reto.proyectobancolombia.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BancolombiaInterfaceSimuladorVivienda extends PageObject {

    public static final Target DATO_ONE = Target.the("button to close")
            .located(By.id("valor-simulacion"));

    public static final Target  DATO_TWO = Target.the("button to close")
            .located(By.id("valor-year"));

    public static final Target  DATO_THREE = Target.the("button to close")
            .located(By.xpath("//div[@class='mat-select-value']"));

    public static final Target  DATO_NUMPORCE= Target.the("button to close")
            .located(By.id("mat-option-0"));

    public static final Target SELECT_CAMPO= Target.the("button to close")
            .located(By.id("campo-fecha"));

    public static final Target  SELECT_YEAR= Target.the("button to close")
            .located(By.xpath("//*[@id=\"mat-datepicker-0\"]/div/mat-multi-year-view/table/tbody/tr[5]/td[4]/div"));

    public static final Target  SELECT_MONTH= Target.the("button to close")
            .located(By.xpath("//*[@id=\"mat-datepicker-0\"]/div/mat-year-view/table/tbody/tr[3]/td[2]"));

    public static final Target  SELECT_DAY= Target.the("button to close")
            .located(By.xpath("//*[@id=\"mat-datepicker-0\"]/div/mat-month-view/table/tbody/tr[4]/td[3]"));

    public static final Target  BUTTON_GO= Target.the("button go")
            .located(By.xpath("//*[@id=\"boton-simular\"]"));



}
