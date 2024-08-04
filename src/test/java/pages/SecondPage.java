package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class SecondPage {
    private static final SelenideElement
            forwardButtonOnSecondPage = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")),
            primaryText = $(id("org.wikipedia.alpha:id/primaryTextView")),
            skipButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_skip_button"));

    @Step("Проверка отображения текста New ways to explore на второй странице")
    public SecondPage checkPrimaryTextOnSecondPage() {
        primaryText.shouldHave(text("New ways to explore"));
        return this;
    }

    @Step("Нажатие на кнопку Continue на второй странице")
    public SecondPage clickOnForwardButtonOnSecondPage() {
        forwardButtonOnSecondPage.click();
        return this;
    }

    @Step("Проверка отображения кнопки Skip на второй странице")
    public SecondPage checkSkipButtonOnSecondPage() {
        skipButton.shouldBe(visible);
        skipButton.shouldHave(text("Skip"));
        return this;
    }
}