package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.AddLanguageScreen;

public class LanguageTests extends TestBase{
    AddLanguageScreen addLanguageScreen = new AddLanguageScreen();
    @Feature("Тестирование добавления языка с проверкой данных")
    @Story("Проверка добавления нескольких языков")
    @Tag("language")
    @DisplayName("Успешный просмотр экранов онбординга")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    void addLanguageOnFirstScreen() {
        addLanguageScreen
                .clickAddOrEditLanguages()
                .clickAddLanguage()
                .addLanguage()
                .checkListOfAddedLanguages("EN","RU")
                .clickBackButton()
                .checkSizeOfLanguagesList(2);
    }
}
