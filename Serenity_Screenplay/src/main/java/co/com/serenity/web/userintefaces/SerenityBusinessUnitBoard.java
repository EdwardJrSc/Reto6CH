package co.com.serenity.web.userintefaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SerenityBusinessUnitBoard extends PageObject {
  public static final Target BUTTON_CREATE_NEW = Target.the("Button create a new business unit")
          .located(By.xpath("//*[@class='button-inner'][contains(text(),'New Business Unit')]"));
  public static final Target NAME_TEXT_BOX= Target.the("Textbox name to the new unit")
          .located(By.xpath("//*[@class='field Name']//input[@name='Name']"));
  public static final Target PARENT_UNIT_LIST = Target.the("Textbox patern to the new unit")
          .located(By.xpath("//*[@class='field ParentUnitId']//span[contains(text(),'--select--')]"));
  public static final Target BUTTON_SAVE = Target.the("Button save")
          .located(By.xpath("//*[@class='buttons-inner']//div//span[contains(text(),'Save')]"));
  public static final Target LIST_PARENT = Target.the("Parent List")
          .located(By.xpath("(//*[@class='select2-results']//li)[17]"));
}

