package co.com.serenity.web.userintefaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MeetingBoard extends PageObject {
  public static final Target BUTTON_MEETINGS = Target.the("Create a new meeting")
          .located(By.xpath("//*[@id='nav_menu1_3_2']/li[1]/a/span"));
}
