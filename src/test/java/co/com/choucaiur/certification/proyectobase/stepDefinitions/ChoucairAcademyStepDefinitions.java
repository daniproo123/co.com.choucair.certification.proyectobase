package co.com.choucaiur.certification.proyectobase.stepDefinitions;

import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class ChoucairAcademyStepDefinitions {


    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^you want to complete the Choucair technical test associated with automation$")
    public void youWantToCompleteTheChoucairTechnicalTestAssociatedWithAutomationn() {
        OnStage.theActorCalled("").wasAbleTo(OpenUp.thePage());
    }

    @When("^enter join day to enter data related to the login on the Utest page$")
    public void enterJoinDayToEnterDataRelatedToTheLoginOnTheUtestPage() {
        OnStage.theActorCalled("").attemptsTo((Login.onThePage()));

    }

    @Then("^Fill in all the data on the registration form, to complete it successfully$")
    public void FillInAllTheDataOnTheegistrationFormToCompleteItSuccessfully() {

    }

}
