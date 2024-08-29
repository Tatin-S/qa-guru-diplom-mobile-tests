package screens;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AddLanguageScreen {
    SelenideElement
            addOrEditLanguagesButton = $(AppiumBy.id("org.wikipedia.alpha:id/addLanguageButton")),
            addLanguageButton = $$(AppiumBy.id("org.wikipedia.alpha:id/wiki_language_title")).last(),
            addRussian = $$(AppiumBy.id("org.wikipedia.alpha:id/localized_language_name")).findBy(text("Русский")),
            backButton = $(AppiumBy.className("android.widget.ImageButton")),
            languagesList = $(AppiumBy.id("org.wikipedia.alpha:id/languagesList"));

    ElementsCollection
            languageCodeList = $$(AppiumBy.id("org.wikipedia.alpha:id/langCodeText"));


    @Step("Нажимаем на кнопку Add or edit languages")
    public AddLanguageScreen clickAddOrEditLanguages() {
        addOrEditLanguagesButton.click();
        return this;
    }
    @Step("Нажимаем на кнопку Add language")
    public AddLanguageScreen clickAddLanguage() {
        addLanguageButton.click();
        return this;
    }
    @Step("Выбираем язык Russian")
    public AddLanguageScreen addLanguage() {
        addRussian.shouldBe(visible).click();
        return this;
    }
    @Step("Возвращаемся на первый экран")
    public AddLanguageScreen clickBackButton() {
        backButton.click();
        return this;
    }
    @Step("Проверяем, что русский язык добавлен в список языков Wikipedia")
    public AddLanguageScreen checkListOfAddedLanguages(String firstLanguageCode, String secondLanguageCode) {
        languageCodeList.shouldHave(texts(firstLanguageCode, secondLanguageCode));
        return this;
    }
    @Step("Проверем, что список языков на первом экране состоит из 2")
    public void checkSizeOfLanguagesList(int sizeValue) {
        languagesList.$$(AppiumBy.id("org.wikipedia.alpha:id/option_label")).shouldHave(size(sizeValue));
    }
}
