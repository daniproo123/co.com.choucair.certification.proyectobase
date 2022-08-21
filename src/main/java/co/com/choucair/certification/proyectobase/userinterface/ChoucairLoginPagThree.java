package co.com.choucair.certification.proyectobase.userinterface;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPagThree extends PageObject {
    public static final Target YOURCOMPUTER = Target.the("Select the operating system").
            located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span"));

    public static final Target YOURCOMPUTER_LABEL = Target.the("Choose the operating system").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/ul/li/div[7]/span"));


    public static final Target VERSION = Target.the("Choose the operating system").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/div[1]/span"));

    public static final Target VERSION_LABEL = Target.the("Choose the operating version system").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/ul/li/div[6]/span"));


    public static final Target LANGUAGES = Target.the("Select the Languages").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/div[1]/span"));

    public static final Target LANGUAGES_LABEL = Target.the("Choose the Languages").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/ul/li/div[40]/span"));


    public static final Target MOBILE_DEVICE = Target.the("Select the mobil device").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]/span"));

    public static final Target MOBILE_DEVICE_LABEL = Target.the("Choose the mobil device").
            located(By.xpath(" /html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/ul/li/div[5]/span"));


    public static final Target MODEL = Target.the("Select the mobile model").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[1]/span"));

    public static final Target MODEL_LABEL = Target.the("Choose the mobile model").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/ul/li/div[84]/span"));


    public static final Target OPERATING = Target.the("SELECT SYSTEM OPERATIVE").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/span"));

    public static final Target OPERATING_LABEL = Target.the("SELECT SYSTEM OPERATIVE").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/ul/li/div[26]/span"));


    public static final Target NEXT_LAST_STEP=Target.the("Next page Four").
            located(By.className("btn-blue"));

}
