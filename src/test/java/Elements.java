import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Elements {
    String absolutePath = "https://www.facebook.com/";
    SelenideElement newAccID = $(By.linkText("Create new account"));
    SelenideElement fNameFieldName = $(By.name("firstname"));
    SelenideElement lNameFieldName = $(By.name("lastname"));
    SelenideElement numOrEmailName = $(By.name("reg_email__"));
    SelenideElement reEntNumOrEmailName = $(By.name("reg_email_confirmation__"));
    SelenideElement passFieldId = $(By.id("password_step_input"));
    SelenideElement birthMonthId = $(By.id("month"));
    SelenideElement birthDayId = $(By.id("day"));
    SelenideElement birthYearId = $(By.id("year"));
    SelenideElement customGenderButtonText = $(byText("Custom"));
    SelenideElement maleGenderButtonText = $(byText("Male"));
    SelenideElement pronounButtonName = $(By.name("preferred_pronoun"));
    SelenideElement genderInputName = $(By.name("custom_gender"));
}
