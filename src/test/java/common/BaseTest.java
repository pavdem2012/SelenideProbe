package common;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;

abstract public class BaseTest {
    //Настройки
    public void setUp() {
        //Инициализация драйвера
        WebDriverManager.chromedriver().setup();
        //Инициализация браузера
        Configuration.browser = "chrome";
        //Инициализация драйвер мэнэджера
        Configuration.driverManagerEnabled = true;
        //Определение разрешения
        Configuration.browserSize = "1920x1080";
        //Определение отображения процесса при true  экран не видно
        Configuration.headless = false;
    }

    @Before
    public void init() {
        setUp();
    }

    @After
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
