package co.com.serenity.web.tasks;

import co.com.serenity.web.userintefaces.SerenityDashboard;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class searchInSerenityMenu implements Task {
  public static searchInSerenityMenu clickOnOrganization() {
    return Tasks.instrumented(searchInSerenityMenu.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(SerenityDashboard.BUTTON_ORGANIZATION),
            Click.on(SerenityDashboard.BUTTON_BUSINESS_UNIT));
  }
}
