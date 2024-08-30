package screens;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class FirstOnboardingScreen {
    private static final SelenideElement
            addLanguageButton = $(id("org.wikipedia.alpha:id/addLanguageButton")),
            forwardButtonOnFirstPage = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")),
            skipButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_skip_button"));

    @Step("Проверка отображения кнопки Add or edit languages")
    public FirstOnboardingScreen checkTextOnAddLanguageButton() {
        addLanguageButton.shouldHave(text("Add or edit languages"));
        return this;
    }

    @Step("Нажатие на кнопку Continue на первой странице")
    public void clickOnForwardButtonOnFirstPage() {
        forwardButtonOnFirstPage.click();
    }

    @Step("Проверяем отображение кнопки Skip на первой странице")
    public FirstOnboardingScreen checkSkipButtonOnFirstPage() {
        skipButton.shouldBe(visible);
        skipButton.shouldHave(text("Skip"));
        return this;
    }

    @Step("Нажимаем на кнопку Skip на первой странице")
    public void clickSkipButtonOnFirstPage() {
        skipButton.click();
    }
}