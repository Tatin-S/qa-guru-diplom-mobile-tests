package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.AddLanguageScreen;

import static io.qameta.allure.Allure.step;

public class LanguageTests extends TestBase{
    AddLanguageScreen addLanguageScreen = new AddLanguageScreen();
    @Feature("Тестирование добавления языка с проверкой данных")
    @Story("Проверка добавления нескольких языков")
    @Tag("language")
    @DisplayName("Успешное добавление второго языка")
    @Severity(SeverityLevel.CRITICAL)
    @Test
/*    void addLanguageOnFirstScreen() {
        addLanguageScreen
                .clickAddOrEditLanguages()
                .clickAddLanguage()
                .addLanguage()
                .checkListOfAddedLanguages("EN","RU")
                .clickBackButton()
                .checkSizeOfLanguagesList(2);
    }*/

    void addLanguageOnFirstScreen() {

        step("Нажать на кнопку 'add or edit languages'", ()
                -> addLanguageScreen.clickAddOrEditLanguages());
        step("Нажать на кнопку 'add language'", ()
                -> addLanguageScreen.clickAddLanguage());
        step("Выбрать немецкий язык 'German'", ()
                -> addLanguageScreen.addGermanLanguage());
        step("Проверить что немецкий язык добавлен в список языков Wikipedia", ()
                -> addLanguageScreen.checkListOfAddedLanguages("EN", "DE"));
        step("Вернуться на первый экран", ()
                -> addLanguageScreen.clickBackButton());
        step("Проверить, что список языков на первом экране состоит из 2 языков", ()
                -> addLanguageScreen.checkSizeOfLanguagesList(2));
    }
}