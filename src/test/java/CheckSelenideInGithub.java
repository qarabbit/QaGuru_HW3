import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class CheckSelenideInGithub {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void CheckSelenideSoftAssertionsAndJUnit5() {
        open("https://github.com/selenide/selenide");
        $("[data-selected-links='repo_wiki /selenide/selenide/wiki']").click();
        $(byText("Soft assertions")).click();
        $("#wiki-content").shouldHave(text("Using JUnit5 extend test class:"));
    }
}
