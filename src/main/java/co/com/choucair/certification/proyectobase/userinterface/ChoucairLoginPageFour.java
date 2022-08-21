package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;



public class ChoucairLoginPageFour extends PageObject{

    public static final Target PASSWORD = Target.the("Write the password").
            located(By.id("password"));

    public static final Target PASSWORD_CONFIRM = Target.the("Confirm the password ").
            located(By.id("confirmPassword"));

    public static final Target CHECK_MARK_TOU = Target.the("").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target CHECK_MARK_PSP = Target.the("WRITE YOUR PASSWORD PASSWORD_CONFIRM").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
}
