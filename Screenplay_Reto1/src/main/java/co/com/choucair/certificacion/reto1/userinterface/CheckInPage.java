package co.com.choucair.certificacion.reto1.userinterface;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;



public class CheckInPage {
    WebDriver driver;

    public static final Target PRIMERNOMBRE = Target.the("PRIMER NOMBRE").located(By.xpath("//*[@id=\'basicBootstrapForm\']/div[1]/div[1]/input"));
    public static final Target APELLIDO = Target.the("PRIMER APELLIDO").located(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4'] //input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required']"));
    public static final Target DIRECCION = Target.the("DIRECCION").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));

    public static final Target HABILIDADES = Target.the("HABILIDADES").located(By.id("Skills"));

   /* public void seleccionarhabilidades( ) {
           Select HABILIDADES = new Select(driver.findElement(By.id("Skills")));
        HABILIDADES.selectByVisibleText("APIs");

    }*/



    /*
    public static final Target CORREO = Target.the("CORREO ELECTRONICO").located(By.xpath());
    public static final Target TELEFONO = Target.the("TELEFONO").located(By.xpath());
    public static final Target GENERO = Target.the("GENERO").located(By.xpath());
    public static final Target AFICIONES = Target.the("AFICIONES").located(By.xpath());
    public static final Target IDIOMAS = Target.the("IDIOMAS").located(By.xpath());
    public static final Target HABILIDADES = Target.the("HABILIDADES").located(By.xpath());

    public static final Target PAIS = Target.the("PAIS").located(By.xpath());
    public static final Target SELE_PAIS = Target.the("SELECCIONAR PAIS").located(By.xpath());
    public static final Target FECHANAC_AÑO = Target.the("FECHA DE NACIMIETO AÑO").located(By.xpath());
    public static final Target FECHANAC_MES = Target.the("FECHA DE NACIMIETO MES").located(By.xpath());
    public static final Target FECHANAC_DIA = Target.the("FECHA DE NACIMIETO DIA").located(By.xpath());
    public static final Target CONTRASEÑA = Target.the("CONTRASEÑA").located(By.xpath());
    public static final Target CONF_CONTRASEÑA = Target.the("CONFIRMAR CONTRASEÑA ").located(By.xpath());
    public static final Target BUTTON_INGRESAR = Target.the("Dar clic en Ingresa con los datos de tu viaje").located(By.xpath("//*[@id='tab_search_order']/span[2]/span"));*/



}
