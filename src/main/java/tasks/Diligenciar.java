package tasks;

import interactions.Buscar;
import model.DataDriveMilesCarrenta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.ElementosWebMilEscarrental;
import util.Constantes;

import java.util.List;

public class Diligenciar implements Task {
    List<DataDriveMilesCarrenta> losdatos;
    public Diligenciar( List<DataDriveMilesCarrenta> losdatos){
        this.losdatos=losdatos;
    }


    public static Diligenciar losCamposcon(List<DataDriveMilesCarrenta> losdatos) {
        return new Diligenciar(losdatos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ElementosWebMilEscarrental.LOCATION),
               Enter.keyValues(losdatos.get(Constantes.NUMERO).localidad).into(ElementosWebMilEscarrental.LASTNAME),
                Click.on(ElementosWebMilEscarrental.AEROPUERTO),
                Click.on(ElementosWebMilEscarrental.CLICK_ELEMENTO_FECHA_RECOGIDA),
                Click.on(ElementosWebMilEscarrental.DIA1),
                Buscar.elPost(ElementosWebMilEscarrental.LISTADIAS,losdatos.get(Constantes.NUMERO).fecharecogida,ElementosWebMilEscarrental.CLICK_ELEMENTO_FECHA_DEVOLUVION),
                Click.on(ElementosWebMilEscarrental.CLICK_ELEMENTO_FECHA_DEVOLUVION),
                Buscar.elPost(ElementosWebMilEscarrental.LISTADIAS,losdatos.get(Constantes.NUMERO).fechadevolucion,ElementosWebMilEscarrental.CLICK_ELEMENTO_FECHA_DEVOLUVION),
                Click.on(ElementosWebMilEscarrental.BUSCARCARROS),
                Click.on(ElementosWebMilEscarrental.RESERVARCARRO),
                Enter.keyValues(losdatos.get(Constantes.NUMERO).getNombre()).into(ElementosWebMilEscarrental.NOMBRE),
                Enter.keyValues(losdatos.get(Constantes.NUMERO).getTelefono()).into(ElementosWebMilEscarrental.TELEFONO),
                Enter.keyValues(losdatos.get(Constantes.NUMERO).getCorreo()).into(ElementosWebMilEscarrental.CORREO),
                Click.on(ElementosWebMilEscarrental.BOTTONSIGUIENTE)
        );
    }

}
