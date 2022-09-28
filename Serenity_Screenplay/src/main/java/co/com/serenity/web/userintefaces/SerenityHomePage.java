package co.com.serenity.web.userintefaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class SerenityHomePage extends PageObject {

  public static final Target BUTTON_DEMO = Target.the("Button demo")
          .located(By.xpath("(//div//li//a)[1][contains(text(),'Demo')]"));
}
