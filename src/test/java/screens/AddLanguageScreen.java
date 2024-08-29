package screens;
/*import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AddLanguageScreen {*/
   /* SelenideElement
            addOrEditLanguagesButton = $(AppiumBy.id("org.wikipedia.alpha:id/addLangContainer")),
            addLanguageButton = $$(AppiumBy.id("org.wikipedia.alpha:id/wiki_language_title")).last(),
            addRussian = $$(AppiumBy.id("org.wikipedia.alpha:id/language_subtitle")).findBy(text("Russian")),
            backButton = $(AppiumBy.className("android.widget.ImageButton")),
            languagesList = $(AppiumBy.id("org.wikipedia.alpha:id/languagesList"));

    ElementsCollection
            languageCodeList = $$(AppiumBy.id("org.wikipedia.alpha:id/wiki_language_code"));

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
    @Step("Проверем, что русский язык добавлен в список языков Wikipedia")
    public AddLanguageScreen checkListOfAddedLanguages(String firstLanguageCode, String secondLanguageCode) {
        languageCodeList.shouldHave(texts(firstLanguageCode, secondLanguageCode));
        return this;
    }
    @Step("Проверем, что список языков на первом экране состоит из 3")
    public void checkSizeOfLanguagesList(int sizeValue) {
        languagesList.$$(AppiumBy.id("org.wikipedia.alpha:id/option_label")).shouldHave(size(sizeValue));
    }*/



import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

    public class AddLanguageScreen {
        SelenideElement
                addOrEditLanguagesBtn = $(AppiumBy.id("org.wikipedia.alpha:id/addLanguageButton")),
                addLanguageBtn = $$(AppiumBy.id("org.wikipedia.alpha:id/wiki_language_title")).last(),
                addGerman = $$(AppiumBy.id("org.wikipedia.alpha:id/localized_language_name")).findBy(text("Русский")),
                backButton = $(AppiumBy.className("android.widget.ImageButton")),
                languagesList = $(AppiumBy.id("org.wikipedia.alpha:id/languagesList"));

        ElementsCollection
                languageCodeList = $$(AppiumBy.id("org.wikipedia.alpha:id/wiki_language_code"));

        public void clickAddOrEditLanguages() {
            addOrEditLanguagesBtn.click();
        }

        public void clickAddLanguage() {
            addLanguageBtn.click();
        }

        public void addGermanLanguage() {
            addGerman.shouldBe(visible).click();
        }

        public void clickBackButton() {
            backButton.click();
        }

        public void checkListOfAddedLanguages(String firstCode, String secondCode) {
            languageCodeList.shouldHave(texts(firstCode, secondCode));
        }

        public void checkSizeOfLanguagesList(int sizeValue) {
            languagesList.$$(AppiumBy.id("org.wikipedia.alpha:id/option_label")).shouldHave(size(sizeValue));
        }
    }
