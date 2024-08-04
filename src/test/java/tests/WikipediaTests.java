package tests;

import data.TestData;
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

    @Tag("Onboarding")
    @DisplayName("Успешный просмотр экранов онбординга")
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
    @Tag("SuccessfulSearch")
    @Test
    @DisplayName("Поиск статьи по заданному значению")
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

    @Tag("EmptySearch")
    @Test
    @DisplayName("Отображение пустого списка при некорректном вводе значения в поиск")
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