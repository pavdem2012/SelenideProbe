package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

/*
Главная страница сайта appleinsider.ru
 */
public class MainPage {
    //Кнопка поиска (приватная неизменияемая)
    private final SelenideElement searchBtn = $x("//form");
    //Поле ввода
    private final SelenideElement inputField = $x("//input[@type='text']");


    //Открыть веб страницу способ 2 (через конструктор)
    public MainPage(String url) {
        Selenide.open(url);
    }

    //Установить значение поля ввода

    /**
     * Выполнить поиск на сайте, нажимается кнопка ENTER
     * @param searchString поисковая строка
     */
    public SearchResultPage setInputField(String searchString) {
        inputField.setValue(searchString);
        inputField.sendKeys(Keys.ENTER);
        return new SearchResultPage();
    }

    //Клик по поиску
    public void clickOnSearch() {
        searchBtn.click();
    }

    //Открыть веб страницу метод 1
    public void openWebSite(String url) {
        Selenide.open(url);
    }
}
