package co.com.choucair.reto.proyectobancolombia.tasks;

import co.com.choucair.reto.proyectobancolombia.userinterface.BancolombiaInterfaceSimuladorVivienda;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class InterfaceSimuladorVivienda implements Task {

    BancolombiaInterfaceSimuladorVivienda bancolombiaInterfaceSimuladorVivienda;

    public static InterfaceSimuladorVivienda EndThePage() {
        return Tasks.instrumented(InterfaceSimuladorVivienda.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("150000000").into(BancolombiaInterfaceSimuladorVivienda.DATO_ONE),
                Enter.theValue("15").into(BancolombiaInterfaceSimuladorVivienda.DATO_TWO),
                Click.on(BancolombiaInterfaceSimuladorVivienda.DATO_THREE),
                Click.on(BancolombiaInterfaceSimuladorVivienda.DATO_NUMPORCE),
                Click.on(BancolombiaInterfaceSimuladorVivienda.SELECT_CAMPO),
                Click.on(BancolombiaInterfaceSimuladorVivienda.SELECT_YEAR),
                Click.on(BancolombiaInterfaceSimuladorVivienda.SELECT_MONTH),
                Click.on(BancolombiaInterfaceSimuladorVivienda.SELECT_DAY),
                Click.on(BancolombiaInterfaceSimuladorVivienda.BUTTON_GO)



        );
    }

}
