package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;



public class ChoucairLoginPage  extends PageObject{


    // FIRST STAGE
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").
            located(By.className("unauthenticated-nav-bar__sign-up"));

    public static final Target FRIST_NAME = Target.the("Where do we write the frist name").
            located(By.id("firstName"));

    public static final Target LAST_NAME = Target.the("Where do we write the last name").
            located(By.id("lastName"));

    public static final Target EMAIL = Target.the("Where do we write the e-mail").
            located(By.id("email"));

    public static final Target BIRTH_MONTH = Target.the("where is the birthday month chosen").
           located(By.cssSelector("#birthMonth"));

    public static final Target BIRTH_DAY = Target.the("where is the birthday day chosen").
            located(By.cssSelector("#birthDay"));

    public static final Target BIRTH_YEAR = Target.the("where is the birthday year chosen").
            located(By.cssSelector("#birthYear"));


    public static final Target LANGUAGES = Target.the("where the language is chosen").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[5]/div[2]/div[1]/input"));

    public static final Target LANGUAGES_LABEL = Target.the("where the language is chosen").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[5]/div[2]/ul/li/div[3]/span/div"));


    public static final Target NEXT_PAGE_TWO = Target.the("Button for next page ").
            located(By.className("btn-blue"));



}
