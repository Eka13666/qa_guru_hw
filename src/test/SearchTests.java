import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {
  @Test
  void successfulSearchTest() {
    System.setProperty("webdriver.chrome.driver", "/Users/eka/chromedriver");
    Configuration.browser = "chrome";
//        Configuration.browserBinary = "/Applications/Google Chrome.app";
    open("https://www.google.com/");
    $("[name=q]").setValue("selenide").pressEnter();
    $("[id=search]").shouldHave(text("https://ru.selenide.org"));
  }
}
