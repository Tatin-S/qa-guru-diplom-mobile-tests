package tests;

import data.TestData;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.ArticleScreen;
import screens.FirstOnboardingScreen;
import screens.SearchScreen;

@Owner("Stulova Tatiana")
public class SearchArticleTests extends TestBase {
    FirstOnboardingScreen firstOnboardingScreen = new FirstOnboardingScreen();
    SearchScreen searchScreen = new SearchScreen();
    ArticleScreen articleScreen = new ArticleScreen();
    TestData testData = new TestData();

    @Feature("Проверка поиска Википедии с выпадающим списком ")
    @Story("Тестирование выпадающего списка поиска с проверкой найденного значения")
    @Tag("search")
    @Test
    @DisplayName("Поиск статьи по заданному значению")
    @Severity(SeverityLevel.BLOCKER)
    void successfulOpenArticleTest() {
        firstOnboardingScreen
                .clickSkipButtonOnFirstPage();
        searchScreen
                .checkAccessibilityOfSearchBar()
                .enterValueIntoSearch(testData.valueSearch)
                .checkListTitles()
                .clickFirstArticleInResultList();
        articleScreen
                .findText(testData.valueSearch);
    }

    @Story("Тестирование выпадающего списка поиска с проверкой пустого списка")
    @Tag("search")
    @Test
    @DisplayName("Отображение пустого списка при некорректном вводе значения в поиск")
    @Severity(SeverityLevel.NORMAL)
    void emptySearchTest() {
        firstOnboardingScreen
                .clickSkipButtonOnFirstPage();
        searchScreen
                .checkAccessibilityOfSearchBar()
                .enterValueIntoSearch(testData.valueEmptySearch);
        articleScreen
                .findText(testData.noResults);
    }
}
