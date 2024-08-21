package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.*;
@DisplayName("Тесты для проверки стартовых страниц Wikipedia")
public class OnboardingTests {
    FirstOnboardingScreen firstOnboardingScreen = new FirstOnboardingScreen();
    SecondOnboardingScreen secondOnboardingScreen = new SecondOnboardingScreen();
    ThirdOnboardingScreen thirdOnboardingScreen = new ThirdOnboardingScreen();
    FourthOnboardingScreen fourthOnboardingScreen = new FourthOnboardingScreen();

    @Feature("Тестирование стартовых страниц после запуска приложения с проверкой данных")
    @Story("Проверка четырех страниц, содержащих текст для ознакомления с приложением")
    @Tag("onboarding")
    @DisplayName("Успешный просмотр экранов онбординга")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    void onboardingTest() {
        firstOnboardingScreen
                .checkTextOnAddLanguageButton()
                .checkSkipButtonOnFirstPage()
                .clickOnForwardButtonOnFirstPage();

        secondOnboardingScreen
                .checkPrimaryTextOnSecondPage()
                .checkSkipButtonOnSecondPage()
                .clickOnForwardButtonOnSecondPage();

        thirdOnboardingScreen
                .checkPrimaryTextOnThirdPage()
                .checkSkipButtonOnThirdPage()
                .clickOnContinueButtonOnThirdPage();

        fourthOnboardingScreen
                .checkPrimaryTextOnFourthPage()
                .visibilityCheckOfDoneButtonOnFourthPage()
                .clickToGetStarted();
    }
}
