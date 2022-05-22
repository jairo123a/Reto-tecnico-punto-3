package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosWebMilEscarrental {
    public static final Target LOCATION = Target.the("location").located(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/form[1]/div[1]/div[2]/div[2]/label[1]/input[1]"));
    public static final Target LASTNAME = Target.the("lastName").located(By.xpath("//input[@value='Aeropuerto Internacional de Miami' and @data-val='Aeropuerto Internacional de Miami']"));
    public static final Target LISTADIAS = Target.the("Email").located(By.xpath("//div[@class='month-item']//div[@class='container__days']"));
    public static final Target CLICK_ELEMENTO_FECHA_RECOGIDA = Target.the("Click elemento fecha recogida").located(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/form[1]/div[1]/label[1]/input[1]"));
    public static final Target CLICK_ELEMENTO_FECHA_DEVOLUVION = Target.the("Click elemento fecha devoluvion").located(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/form[1]/div[1]/label[2]/input[1]"));
    public static final Target AEROPUERTO = Target.the("Click en aeropuerto").located(By.xpath("//span[contains(text(),'Aeropuerto de Florida Keys Marathon, Marathon, Flo')]"));
    public static final Target DIA1= Target.the("Click en aeropuerto").located(By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[3]"));
    public static final Target BUSCARCARROS = Target.the("Botton buscar carro").located(By.xpath("//div//a[@data-label='searchCar']"));
    public static final Target RESERVARCARRO = Target.the("Botton reservar carro").located(By.xpath("//div[@id='car_1']//button[contains(text(),'RESERVAR AHORA')]"));
    public static final Target LISTADIASMESANTERIOR = Target.the("Email").located(By.xpath("//div[@class='month-item no-previous-month']//div[@class='container__days']"));
    public static final Target NOMBRE = Target.the("Nombre").located(By.id("inpName"));
    public static final Target TELEFONO= Target.the("Telefono").located(By.id("phoneCustom"));
    public static final Target CORREO = Target.the("Correo").located(By.id("inpEmail"));
    public static final Target BOTTONSIGUIENTE = Target.the("Siguiente").located(By.xpath("//span[contains(text(),'Siguiente')]"));
}
