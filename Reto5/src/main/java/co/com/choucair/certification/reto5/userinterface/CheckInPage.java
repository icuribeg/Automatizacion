package co.com.choucair.certification.reto5.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CheckInPage {

    public static final Target BUTTON_REGISTRO = Target.the("Selecciona boton de registro").located(By.xpath("//*[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target NOMBRE = Target.the("PRIMER NOMBRE").located( By.id("firstName"));
    public static final Target APELLIDO = Target.the("PRIMER APELLIDO").located(By.id( "lastName" ));
    public static final Target CORREO = Target.the("CORREO").located(By.id( "email" ));
    public static final Target FECHA_MES = Target.the("FECHA MES ").located(By.id( "birthMonth" ));
    public static final Target FECHA_DIA = Target.the("FECHA DIA ").located(By.id( "birthDay" ));
    public static final Target FECHA_ANO = Target.the("FECHA AÑO ").located(By.id( "birthYear" ));
    public static final Target SPOKEN = Target.the("Selecciona SPOKEN").located(By.name( "languages" ));
    public static final Target SELECT_SPOKEN = Target.the("Selecciona SPOKEN").located( By.xpath( "//*[@id='languages']/div[1]/input" ) );
    public static final Target SIGUIENTE1 = Target.the("SIGUIENTE").located(By.xpath("//*[@class='material-icons']"));
    public static final Target SIGUIENTE2 = Target.the("SIGUIENTE").located(By.xpath("//*[@class='btn btn-blue pull-right']"));
    public static final Target LIST_COMPUTER = Target.the("").located(By.name("osId"));
    public static final Target SELECT_LIST_COMPUTER = Target.the("").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target  VERSION = Target.the("").located(By.name("osVersionId"));
    public static final Target SELECT_VERSION = Target.the("").located(By.xpath("//*[@id=\'web-device\']/div[2]/div[2]/div/input[1]"));

    public static final Target lENGUAGE = Target.the("Selecciona SPOKEN").located(By.name( "osLanguageId" ));
    public static final Target SELECT_LEGUAGE = Target.the("Selecciona SPOKEN").located( By.xpath("//*[@id=\'web-device\']/div[3]/div[2]/div/input[1]") );

    public static final Target MOVIL = Target.the("MOVIL ").located(By.name( "handsetMakerId" ));
    public static final Target SELECT_MOVIL = Target.the("MOVIL1 ").located(By.xpath("//*[@id=\'mobile-device\']/div[1]/div[2]/div/input[1]"));

    public static final Target MODEL = Target.the("MODEL").located(By.name( "handsetModelId" ));
    public static final Target SELECT_MODEL = Target.the("MODEL").located(By.xpath( "//*[@id=\'mobile-device\']/div[2]/div[2]/div/input[1]" ));

    public static final Target SYSTEM = Target.the("SYSTEM").located(By.name( "handsetOSId" ));
    public static final Target SELECT_SYSTEM = Target.the("SYSTEM").located(By.xpath( "//*[@id=\'mobile-device\']/div[3]/div[2]/div/input[1]" ));

    public static final Target SIGUIENTE3 = Target.the("SIGUIENTE3").located(By.xpath("//*[@class ='btn btn-blue pull-right']"));
    public static final Target PASS = Target.the("PASS").located( By.id("password"));
    public static final Target CONF_PASS = Target.the("CONF_PASS").located( By.id("confirmPassword"));

    public static final Target ACEPTAR_TERMINOS = Target.the("COMBO1").located( By.xpath( "//*[@class = 'checkmark signup-consent__checkbox error']" ));
    public static final Target ACEPTAR_POLITICAS = Target.the("COMBO1").located( By.xpath( "//*[@class = 'checkmark signup-consent__checkbox error']" ));

    public static final Target TERMINAR = Target.the("SIGUIENTE").located(By.id( "laddaBtn" ));

    public static final Target CONFIR_REGISTRO = Target.the("CONFRIMACION DE REGISTRO ").located(By.xpath( "//h1[contains(text(),'Welcome to the world's largest community of freelance software testers!')]"));







}
