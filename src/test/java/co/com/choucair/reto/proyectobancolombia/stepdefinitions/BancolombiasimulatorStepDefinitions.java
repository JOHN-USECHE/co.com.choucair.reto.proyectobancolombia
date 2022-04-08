package co.com.choucair.reto.proyectobancolombia.stepdefinitions;

import co.com.choucair.reto.proyectobancolombia.tasks.InterfaceOne;
import co.com.choucair.reto.proyectobancolombia.tasks.InterfaceSimuladorVivienda;
import co.com.choucair.reto.proyectobancolombia.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class BancolombiasimulatorStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Than John wants to perform a simulation of his installments in the Bancolombia simulator$")
    public void thanJohnWantsToPerformASimulationOfHisInstallmentsInTheBancolombiaSimulator() {
        OnStage.theActorCalled("John").wasAbleTo(OpenUp.thePage());
    }

    @When("^he search looking for the Bancolombia housing simulator$")
    public void heSearchLookingForTheBancolombiaHousingSimulator()  {
        OnStage.theActorInTheSpotlight().attemptsTo(InterfaceOne.OnThePage());

    }

    @Then("^successfully carry out a home credit simulation Bancolombia$")
    public void successfullyCarryOutAHomeCreditSimulationBancolombia()  {
        OnStage.theActorInTheSpotlight().attemptsTo(InterfaceSimuladorVivienda.EndThePage());

    }
}
