import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTest {

 @Test
    public void successTest(){

    open("https://www.google.com");
    $("[name=q]").setValue("selenide").pressEnter();
    $("[id=search]").shouldHave(text("https://ru.selenide.org"));
}

   public String getValue(){
     return "Selenide";
   }

    void shouldOpen() {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate  localDate =   LocalDate.parse("", dateTimeFormatter);

    }


}
