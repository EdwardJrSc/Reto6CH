package co.com.serenity.web.userintefaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SerenityMeetingsBoards extends PageObject {
  public static final Target BUTTON_MEETING = Target.the("Create a new meeting")
          .located(By.xpath("//*[@id='nav_menu1_3']/li[2]/a"));

  public static final Target BUTTON_MEETINGS = Target.the("Create a new meeting")
          .located(By.xpath("//*[@id='nav_menu1_3_2']/li[1]/a"));
  public static final Target BUTTON_NEW_MEETING = Target.the("Create a new meeting")
          .located(By.xpath("//*[@class='button-inner'][contains(text(),'New Meeting')]"));
  public static final Target TEXTBOX_NAME_MEETING = Target.the("Name to the new meeting")
          .located(By.xpath("//*[@class='field MeetingName']//input[@type='text']"));
  public static final Target MEETING_TYPE = Target.the("Select the meeting type")
          .located(By.xpath("//*[@class='field MeetingTypeId col-sm-6']//a[@class='select2-choice']"));
  public static final Target OPTION_SELECTED = Target.the("")
          .locatedBy("//ul[@id='select2-results-6']//li[5]");
  public static final Target START_DATE_ICON = Target.the("Click date icon")
          .located(By.xpath("//*[@class='field StartDate col-sm-6']//i[@class='fa fa-calendar']"));
  public static final Target DAY_NUMBER_START = Target.the("Select the date to start")
          .located(By.xpath("//*[@class='ui-state-default'][contains(text(),'29')]"));
  public static final Target HOUR_START_COMBO = Target.the("Select the hour to start")
          .located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid']/div/div/div[4]/select"));
  public static final Target HOUR_START = Target.the("Select the hour to start")
          .located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid']/div/div/div[4]/select/option[@value='08:00']"));
  public static final Target LOCATION_LIST_ARROW = Target.the("Select the location arrow")
          .located(By.xpath("//*[@id='select2-chosen-7']"));
  public static final Target SELECT_LOCATION = Target.the("Select the location")
          .located(By.xpath("//*[@class='select2-results']//li[3]"));
  public static final Target HOST_LIST = Target.the("Open host list")
          .located(By.xpath("//*[@id='select2-chosen-9']"));
  public static final Target SELECT_HOST = Target.the("Select the host")
          .located(By.xpath("//*[@id='select2-results-9']//li[25]"));
  public static final Target MEETING_NUMBER = Target.the("Type the meeting number")
          .located(By.xpath("//*[@class='field MeetingNumber col-sm-6']/input[@type='text']"));
  public static final Target END_DATE_ICON = Target.the("Click date icon")
          .located(By.xpath("//*[@class='field EndDate col-sm-6']//i"));
  public static final Target DAY_NUMBER_END = Target.the("Select the date to end")
          .located(By.xpath("//*[@class='ui-state-default'][contains(text(),'30')]"));
  public static final Target HOUR_END = Target.the("Select the hour to end")
          .located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid']/div/div/div[5]/select/option[@value='09:00']"));
  public static final Target LIST_UNIT = Target.the("List unit")
          .located(By.xpath("//*[@id='select2-chosen-8']"));
  public static final Target SELECT_UNIT = Target.the("Select the unit")
          .located(By.xpath("(//*[@class='select2-result-label'][contains(text(),'Administration')])[1]"));
  public static final Target LIST_REPORTER = Target.the("List reporter")
          .located(By.xpath("//*[@id='select2-chosen-10']"));
  public static final Target SELECT_REPORTER = Target.the("Select reporter")
          .located(By.xpath("//*[@id='select2-results-10']//li[5]"));
  public static final Target LIST_ATTENDEE = Target.the("List attendee")
          .located(By.xpath("//*[@id='select2-chosen-12']"));
  public static final Target SELECT_ATTENDEE = Target.the("List attendee")
          .located(By.xpath("//*[@id='select2-results-12']//li[26]"));
  public static final Target BUTTON_SAVE = Target.the("Button Save")
          .located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_Toolbar']/div/div/div/div[1]"));
}