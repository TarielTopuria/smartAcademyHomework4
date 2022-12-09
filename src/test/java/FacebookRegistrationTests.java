import com.codeborne.selenide.*;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static com.codeborne.selenide.Selenide.*;

public class FacebookRegistrationTests extends Elements {
    @Test
    public void successfulRegistration(){
        open(absolutePath);
        $(newAccID).click();
        $(fNameFieldName).sendKeys("Tato");
        $(lNameFieldName).sendKeys("Topuria");
        $(numOrEmailName).sendKeys("tatotophuria@gmail.com");
        $(reEntNumOrEmailName).shouldBe(Condition.visible).sendKeys("tatotophuria@gmail.com");
        $(passFieldId).sendKeys("TestPassword123");
        $(birthMonthId).selectOptionByValue("5");
        $(birthDayId).selectOptionByValue("29");
        $(birthYearId).selectOptionByValue("1997");
        $(customGenderButtonText).click();
        $(pronounButtonName).shouldBe(Condition.visible, Duration.ofSeconds(2)).selectOptionByValue("2");
        $(genderInputName).shouldBe(Condition.visible, Duration.ofSeconds(2));
        $(maleGenderButtonText).click();
        $(pronounButtonName).shouldBe(Condition.hidden, Duration.ofSeconds(2)).selectOptionByValue("2");
        $(genderInputName).shouldBe(Condition.hidden, Duration.ofSeconds(2));
    }
}
