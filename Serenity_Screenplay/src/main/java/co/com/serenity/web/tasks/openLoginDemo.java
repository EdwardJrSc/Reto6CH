package co.com.serenity.web.tasks;

import co.com.serenity.web.userintefaces.SerenityHomePage;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;

public class openLoginDemo implements Task{
  public static openLoginDemo buttonDemo() {
    return Tasks.instrumented(openLoginDemo.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(SerenityHomePage.BUTTON_DEMO));
  }
}
