package co.com.serenity.web.tasks;

import co.com.serenity.web.userintefaces.StartSharpUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class completeLogin implements Task {

  public static completeLogin LoginForm() {
    return Tasks.instrumented(completeLogin.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(StartSharpUserInterface.USERNAME_TEXTBOX),
            Enter.theValue("admin").into(StartSharpUserInterface.USERNAME_TEXTBOX),
            Click.on(StartSharpUserInterface.PASSWORD_TEXTBOX),
            Enter.theValue("serenity").into(StartSharpUserInterface.PASSWORD_TEXTBOX),
            Click.on(StartSharpUserInterface.SUBMIT_BUTTON));
  }
}
