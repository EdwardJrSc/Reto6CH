package co.com.serenity.web.tasks;

import co.com.serenity.web.userintefaces.MeetingBoard;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class verifyCreatedMeeting implements Task {
  public static verifyCreatedMeeting reviewOnMeetsBoard() {
    return Tasks.instrumented(verifyCreatedMeeting.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(MeetingBoard.BUTTON_MEETINGS));
  }
}
