package co.com.serenity.web.tasks;

import co.com.serenity.web.userintefaces.SerenityMeetingsBoards;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class searchMeetingMenu implements Task {
  public static searchMeetingMenu clickOnMetting() {
    return Tasks.instrumented(searchMeetingMenu.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(SerenityMeetingsBoards.BUTTON_MEETING),
            Click.on(SerenityMeetingsBoards.BUTTON_MEETINGS),
            Click.on(SerenityMeetingsBoards.BUTTON_NEW_MEETING),
            Click.on(SerenityMeetingsBoards.TEXTBOX_NAME_MEETING),
            Enter.theValue("Reunion Mensual").into(SerenityMeetingsBoards.TEXTBOX_NAME_MEETING),
            Click.on(SerenityMeetingsBoards.MEETING_TYPE),
            Click.on(SerenityMeetingsBoards.OPTION_SELECTED),
            Click.on(SerenityMeetingsBoards.START_DATE_ICON),
            Click.on(SerenityMeetingsBoards.DAY_NUMBER_START),
            Click.on(SerenityMeetingsBoards.HOUR_START_COMBO),
            Click.on(SerenityMeetingsBoards.HOUR_START),
            Click.on(SerenityMeetingsBoards.LOCATION_LIST_ARROW),
            Click.on(SerenityMeetingsBoards.SELECT_LOCATION),
            Click.on(SerenityMeetingsBoards.HOST_LIST),
            Click.on(SerenityMeetingsBoards.SELECT_HOST),
            Click.on(SerenityMeetingsBoards.MEETING_NUMBER),
            Enter.theValue("1995").into(SerenityMeetingsBoards.MEETING_NUMBER),
            Click.on(SerenityMeetingsBoards.END_DATE_ICON),
            Click.on(SerenityMeetingsBoards.DAY_NUMBER_END),
            Click.on(SerenityMeetingsBoards.HOUR_END),
            Click.on(SerenityMeetingsBoards.LIST_UNIT),
            Click.on(SerenityMeetingsBoards.SELECT_UNIT),
            Click.on(SerenityMeetingsBoards.LIST_REPORTER),
            Click.on(SerenityMeetingsBoards.SELECT_REPORTER),
            Click.on(SerenityMeetingsBoards.LIST_ATTENDEE),
            Click.on(SerenityMeetingsBoards.SELECT_ATTENDEE),
            Click.on(SerenityMeetingsBoards.BUTTON_SAVE));
  }
}
