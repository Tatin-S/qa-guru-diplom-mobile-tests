package tests;

import data.TestData;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

@DisplayName("Тесты для Wikipedia")
public class WikipediaTests extends TestBase {
    FirstPage firstPage = new FirstPage();
    SecondPage secondPage = new SecondPage();
    ThirdPage thirdPage = new ThirdPage();
    FourthPage fourthPage = new FourthPage();
    SearchPage searchPage = new SearchPage();
    ArticlePage articlePage = new ArticlePage();
    TestData testData = new TestData();

    @Feature("Тестирование стартовых страниц после запуска приложения с проверкой данных")
    @Story("Проверка четырех страниц, содержащих текст для ознакомления с приложением")
    @Tag("onboarding")
    @DisplayName("Успешный просмотр экранов онбординга")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    void onboardingTest() {
        firstPage
                .checkTextOnAddLanguageButton()
                .checkSkipButtonOnFirstPage()
                .clickOnForwardButtonOnFirstPage();

        secondPage
                .checkPrimaryTextOnSecondPage()
                .checkSkipButtonOnSecondPage()
                .clickOnForwardButtonOnSecondPage();

        thirdPage
                .checkPrimaryTextOnThirdPage()
                .checkSkipButtonOnThirdPage()
                .clickOnContinueButtonOnThirdPage();

        fourthPage
                .checkPrimaryTextOnFourthPage()
                .visibilityCheckOfDoneButtonOnFourthPage()
                .clickToGetStarted();
    }

    @Feature("Проверка поиска Википедии с выпадающим списком ")
    @Story("Тестирование выпадающего списка поиска с проверкой найденного значения")
    @Tag("search")
    @Test
    @DisplayName("Поиск статьи по заданному значению")
    @Severity(SeverityLevel.BLOCKER)
    void successfulOpenArticleTest() {
        firstPage
                .clickSkipButtonOnFirstPage();
        searchPage
                .checkAccessibilityOfSearchBar()
                .enterValueIntoSearch(testData.valueSearch)
                .checkListTitles()
                .clickFirstArticleInResultList();
        articlePage
                .findText(testData.valueSearch);

    }

    @Story("Тестирование выпадающего списка поиска с проверкой пустого списка")
    @Tag("search")
    @Test
    @DisplayName("Отображение пустого списка при некорректном вводе значения в поиск")
    @Severity(SeverityLevel.NORMAL)
    void emptySearchTest() {
        firstPage
                .clickSkipButtonOnFirstPage();
        searchPage
                .checkAccessibilityOfSearchBar()
                .enterValueIntoSearch(testData.valueEmptySearch);
        articlePage
                .findText(testData.noResults);
    }
}