package co.com.choucair.certification.proyectolatam.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchPage extends PageObject {

    public static final Target BUTTON_MISVIAJES = Target.the("Selecciona MIS VIAJES").located(By.xpath("//*[@id='lnk-xp_all_web_header_menuMyTripsTxt']"));
    public static final Target BUTTON_INGRESAR = Target.the("Dar clic en Ingresa con los datos de tu viaje").located(By.xpath("//*[@id='tab_search_order']/span[2]/span"));
    public static final Target SELECT_DONDE_ENCONTRARLOS = Target.the("Dar clic en la opción donde encontrarlos").located(By.xpath("//a[@id='undefined-dialog-open']"));
    public static final Target SELECT_NRO_ORDEN = Target.the("Dar clic en la opción NRO RESERVA").located(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/button[1]/div[1]/div/span"));
    public static final Target SELECT_COD_RESERVA = Target.the("Dar clic en la opción COD RESERVA").located(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/button[2]/div[1]/div/span"));
    public static final Target NAME_RESERVA = Target.the("Dar clic en la opción NAME RESERVA").located(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/button[2]/div[2]/div/span"));


}
