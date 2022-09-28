package co.com.serenity.web.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import co.com.serenity.web.tasks.*;

public class UserHistoryStepDefinitions {

  @Before
  public void setStage() {
    OnStage.setTheStage(new OnlineCast());
  }

  @Given("^Edward opens the website$")
  public void edwardOpensTheWebsite() {
    OnStage.theActorCalled("Edward").attemptsTo(Open.url("https://serenity.is"),
            (openLoginDemo.buttonDemo()),
            completeLogin.LoginForm());
  }


  @When("^Edward attemps to create a new bussiness unit$")
  public void edwardAttempsToCreateANewBussinessUnit() {
    OnStage.theActorInTheSpotlight().attemptsTo(searchInSerenityMenu.clickOnOrganization(),
            createNewBusinessUnit.clickButtonNew());

  }

  @When("^after that creates a new meeting on that unit bussiness$")
  public void afterThatCreatesANewMeetingOnThatUnitBussiness() {
    OnStage.theActorInTheSpotlight().attemptsTo(searchMeetingMenu.clickOnMetting());

  }

  @Then("^will see the created meeting$")
  public void willSeeTheCreatedMeeting() {
    OnStage.theActorInTheSpotlight().attemptsTo(verifyCreatedMeeting.reviewOnMeetsBoard());
  }
}
