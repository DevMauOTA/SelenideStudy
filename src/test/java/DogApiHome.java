import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.testng.Assert.*;

public class DogApiHome {

    @Test
    public void VerifyHomepageCompleet() {
        open("https://dog.ceo/dog-api/");

        String url = url();

        assertEquals("https://dog.ceo/dog-api/", url);
        $(By.cssSelector(".vertical-nav h1")).shouldHave(text("Dog API"));
    }
}
