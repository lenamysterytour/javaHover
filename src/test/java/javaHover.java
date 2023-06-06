
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;

public class javaHover {

    @BeforeAll
    static void beforeAll() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com";
    }

    @Test
    void JavaHoverTest() {

        //открыть главную страницу
        open("https://github.com");
        //выбрать меню Solutions>Enterprise командой Hover
        $(byTagAndText("button", "Solutions")).hover();
        $(byText("Enterprise")).click();
//убедиться, что загрузилась нужная страница (например, заголовок "Build like the best"
        $(byTagAndText("h1", "Build like the best")).shouldBe(visible);
    }

}
