package co.com.serenity.web.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import co.com.serenity.web.userintefaces.SerenityBusinessUnitBoard;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class createNewBusinessUnit implements Task {
  public static createNewBusinessUnit clickButtonNew() {
    return Tasks.instrumented(createNewBusinessUnit.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(SerenityBusinessUnitBoard.BUTTON_CREATE_NEW),
            Enter.theValue("Edward Testing").into(SerenityBusinessUnitBoard.NAME_TEXT_BOX),
            Click.on(SerenityBusinessUnitBoard.PARENT_UNIT_LIST),
            Click.on(SerenityBusinessUnitBoard.LIST_PARENT),
            Click.on(SerenityBusinessUnitBoard.BUTTON_SAVE));
  }
}
