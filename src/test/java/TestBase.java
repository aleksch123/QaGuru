import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    @BeforeAll
    static void beforeAll(){

        Configuration.baseUrl="https://cloud.google.com";

        Configuration.browserSize="1366x1200";
        Configuration.pageLoadStrategy="eager";
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "chrome";

    }
}
