import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTest extends TestBase{



    @Test
    void successCompleteFulfillTest(){

        open("/text-box");
        $("#userName").setValue("Aleks");
        $("#userEmail").setValue("aleks@test.com");
        $("#currentAddress").setValue("ny 123");
        $("#permanentAddress").setValue("same");
        $("#submit").click();
        $("#output").shouldHave(text("Aleks"),text("aleks@test.com"));


    }


    @Test
    void completeTestForm() {
        open("/automation-practice-form");
        $("#firstName").setValue("Aleks");
        $("#lastName").setValue("Ivanov");
        $("#userEmail").setValue("aleks@test.com");
        $("#gender-radio-1").parent().click();
        $("#subjectsInput").setValue("Commerce").pressEnter();
        $("#hobbies-checkbox-1").parent().click();

        System.out.println();



    }
    @Test
    void test1() {
        open("/automation-practice-form");
        $("#firstName").setValue("Aleks");
        $("#lastName").setValue("Ivanov");
        $("#userEmail").setValue("aleks@test.com");
        $("#gender-radio-1").parent().click();
        $("#subjectsInput").setValue("Commerce").pressEnter();
        $("#hobbies-checkbox-1").parent().click();
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("June");
        $(".react-datepicker__year-select").selectOption("1965");
        $(".react-datepicker__day--030:not(.react-datepicker__day--outside-month)").click();
        $("#uploadPicture").uploadFromClasspath("img/1.png");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#currentAddress").setValue("MyAdress");
        $("#userNumber").setValue("1234567890");
        $("#submit").click();

        $(".modal-dialog").should(appear);
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));

    }






}
