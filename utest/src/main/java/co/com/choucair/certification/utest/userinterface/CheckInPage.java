package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CheckInPage {

    public static final Target BUTTON_REGISTRO = Target.the("click boton de registro").located( By.xpath("//*[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target FIRST_NAME = Target.the("ingresar el nombre").located( By.id("firstName"));
    public static final Target LAST_NAME = Target.the("ingresar el apellido").located( By.id("lastName"));
    public static final Target EMAIL = Target.the("ingresar el email").located( By.id("email"));
    public static final Target BIRTH_MES = Target.the("ingresar el mes de cumpleaños").located( By.id("birthMonth"));
    public static final Target BIRTH_DIA = Target.the("Ingresar el dia cumpleaños").located( By.id("birthDay"));
    public static final Target BIRTH_AÑO = Target.the("ingresar el año de cumpleaños").located( By.id("birthYear"));
    public static final Target SPOKEN = Target.the("ingresar idioma").located( By.xpath( "//*[@id=\'languages\']/div[1]/input" ));
    public static final Target SELECT_SPOKEN = Target.the("ingresar idioma").located( By.xpath( "//*[@id=\"languages\"]/div[1]/input" ));
    public static final Target CONTINUAR = Target.the("click boton de CONTINUAR").located( By.xpath("//*[@class='material-icons']"));
    public static final Target CITY  = Target.the("ingresar computer").located( By.name( "city" ));

    public static final Target CONTINUAR1 = Target.the("click boton de CONTINUAR").located( By.xpath("//*[@class='btn btn-blue pull-right']"));
    public static final Target COMPUTER  = Target.the("ingresar computer").located( By.name( "osId" ));
    public static final Target SELECT_COMPUTER  = Target.the("ingresar computer").located( By.xpath( "//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]" ));
    public static final Target VERSION  = Target.the("ingresar version").located( By.name( "osVersionId" ));
    public static final Target SELECT_VERSION  = Target.the("ingresar version").located( By.xpath( "//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]" ));
    public static final Target LANGUAGE  = Target.the("ingresar lenguaje").located( By.name( "osLanguageId" ));
    public static final Target SELECT_LANGUAGE  = Target.the("ingresar lenguaje").located( By.xpath( "//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]" ));

    public static final Target MOBILE  = Target.the("ingresar movil ").located( By.name( "handsetMakerId" ));
    public static final Target SELECT_MOBILE  = Target.the("ingresar movil ").located( By.xpath( "//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]" ));

    public static final Target MODEL   = Target.the("ingresar modelo ").located( By.name( "handsetModelId" ));
    public static final Target SELECT_MODEL   = Target.the("ingresar modelo ").located( By.xpath( "//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]" ));

    public static final Target SYSTEM   = Target.the("ingresar system ").located( By.name( "handsetOSId" ));
    public static final Target SELECT_SYSTEM   = Target.the("ingresar system ").located( By.xpath( "//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]" ));

    public static final Target PASS   = Target.the("ingresar pass ").located( By.id("password"));
    public static final Target CONF_PASS   = Target.the("ingresar confirmar pass ").located( By.id("confirmPassword"));

    public static final Target CHECK_TERMINOS  = Target.the("ingresar confirmar pass ").located( By.xpath("//*[@class='checkmark signup-consent__checkbox error']"));
    public static final Target CHECK_POLITICA   = Target.the("ingresar confirmar pass ").located(By.xpath("//*[@class='checkmark signup-consent__checkbox error']"));

    public static final Target TERMINAR = Target.the("click boton de CONTINUAR").located( By.id( "laddaBtn" ));

    public static final Target MENSAJE = Target.the("click boton de CONTINUAR").located( By.xpath( "//h1[contains(text(),'Welcome to the world's largest community of freelance software testers!')]" ));





}
