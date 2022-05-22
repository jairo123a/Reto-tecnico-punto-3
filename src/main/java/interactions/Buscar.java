package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import userinterface.ElementosWebMilEscarrental;

import java.util.List;

public class Buscar implements Interaction {
    Target listaMenu;
    String opcionMenu;
    Target post;
    public Buscar(Target listaMenu, String opcionMenu, Target post){
        this.listaMenu=listaMenu;
        this.opcionMenu=opcionMenu;
        this.post=post;
    }

    public static Buscar elPost(Target listaMenu, String opcionMenu, Target post) {
        return Tasks.instrumented(Buscar.class,listaMenu,opcionMenu,post);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElement> elementList= ElementosWebMilEscarrental.LISTADIASMESANTERIOR.resolveFor(actor).findElements(By.xpath("//div[@class='day-item']"));
        for(int i=0;i<elementList.size();i++) {
            if (elementList.get(i).getText().equals(opcionMenu)) {
                elementList.get(i).click();
                break;
            }
        }
    }
}
