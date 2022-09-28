package co.com.serenity.web.userintefaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class StartSharpUserInterface extends PageObject {
  public static final Target USERNAME_TEXTBOX = Target.the("Username Textbox")
          .located(By.xpath("//div//div//input[contains(@placeholder,'admin')]"));
  public static final Target PASSWORD_TEXTBOX = Target.the("Password Textbox")
          .located(By.xpath("//div//div//input[contains(@type,'password')]"));
  public static final Target SUBMIT_BUTTON = Target.the("Submit Button")
          .located(By.xpath("//div//button[contains(@type,'submit')]"));
}


