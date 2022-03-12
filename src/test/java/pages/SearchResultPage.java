package pages;


import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.Selenide.$$x;

public class SearchResultPage {

    /*
    Коллеккция ссылок со страницы рекзультатов поиска
     */
    private final ElementsCollection articleTitles = $$x("//h2//a");

    /**
     * Возвращает содержимое тэга href первой статьи
     * */
    public String getHrefFromFirsArticle(){
        return articleTitles.first().getAttribute("href");
    }

}
