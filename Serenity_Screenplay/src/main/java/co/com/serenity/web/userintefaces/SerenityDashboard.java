package co.com.serenity.web.userintefaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SerenityDashboard extends PageObject {

  public static final Target BUTTON_ORGANIZATION = Target.the("Button Organization")
          .located(By.xpath("//*[@id='nav_menu1_3']/li[1]/a/span"));
  public static final Target BUTTON_BUSINESS_UNIT = Target.the("Button Business Unit")
          .located(By.xpath("//*[contains(text(),'Business Units')]"));

  public static final Target BUTTON_MEETING = Target.the("Button Meeting")
          .located(By.xpath("(//*[contains(text(),'Meeting')])[2]"));

  public static final Target BUTTON_MEETINGS = Target.the("Button Meetings")
          .located(By.xpath("//*[contains(text(),'Meetings')]"));
}

