package Prueba.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.DataDriveMilesCarrenta;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ElCarro;
import tasks.Abrir;
import tasks.Diligenciar;

import java.util.List;

public class MilesCarreraStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^yo ingreso al sitio web$")
    public void yoIngresoAlSitioWeb() {
        OnStage.theActorCalled("jairo").attemptsTo(Abrir.laPagina());
    }

    @When("^yo diligencio los campos  y selecciono  el segundo vehiculo$")
    public void yoDiligencioLosCamposYSeleccionoElSegundoVehiculo(List<DataDriveMilesCarrenta> losdatos) {
        OnStage.theActorInTheSpotlight().attemptsTo(Diligenciar.losCamposcon(losdatos));
    }

    @Then("^yo verifico el  vehiculo seleccionado\"([^\"]*)\"$")
    public void yoVerificoElVehiculoSeleccionado(String dato) {
       OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ElCarro.SeEscogioConEl(dato)));
    }



}
