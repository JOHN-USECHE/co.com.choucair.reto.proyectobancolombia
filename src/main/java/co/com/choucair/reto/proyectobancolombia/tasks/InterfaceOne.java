package co.com.choucair.reto.proyectobancolombia.tasks;

import co.com.choucair.reto.proyectobancolombia.userinterface.BancolombiaInterfaceOnePage;
import co.com.choucair.reto.proyectobancolombia.userinterface.BancolombiasimulatorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class InterfaceOne  implements Task {

    BancolombiasimulatorPage bancolombiasimulatorPage;

    public static InterfaceOne OnThePage() {
        return Tasks.instrumented(InterfaceOne.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BancolombiaInterfaceOnePage.ENTER_BUTTON),
                Click.on(BancolombiaInterfaceOnePage.SELECT_MENU),
                Click.on(BancolombiaInterfaceOnePage.BUTTON_GOLEASING),
                Click.on(BancolombiaInterfaceOnePage. BUTTON_HABIGOLEASING),
                Click.on(BancolombiaInterfaceOnePage. BUTTON_SIMULA),
                Click.on(BancolombiaInterfaceOnePage. BUTTON_CALCUOTA)


        );
    }

}
