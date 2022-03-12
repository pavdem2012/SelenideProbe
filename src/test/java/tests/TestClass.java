package tests;

import common.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.MainPage;
import pages.SearchResultPage;

public class TestClass extends BaseTest {
    private final static String BASE_URL = "https://appleinsider.ru/";
    private final static String SEARCH_STRING = "Чем iPhone 13 отличается от iPhone 12";
    private final static String EXPECTED_WORD = "iphone-13";


    @Test
    public void checkHrefArticle() {
        MainPage mainPage = new MainPage(BASE_URL);
        //mainPage.openWebSite(BASE_URL);
        mainPage.setInputField(SEARCH_STRING);
        SearchResultPage searchResultPage = new SearchResultPage();
        String href = searchResultPage.getHrefFromFirsArticle();
        //boolean contains = href.contains("iphone-13");
        Assert.assertTrue(href.contains("iphone-13"));
    }

    @Test
    public void checkHrefArticleInLine() {
        Assert.assertTrue(new MainPage(BASE_URL)
                .setInputField(SEARCH_STRING)
                .getHrefFromFirsArticle()
                .contains(EXPECTED_WORD));
    }

}
