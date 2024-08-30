package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.AddLanguageScreen;

@Owner("Stulova Tatiana")
public class LanguageTests extends TestBase {
    AddLanguageScreen addLanguageScreen = new AddLanguageScreen();

    @Feature("Тестирование добавления языка с проверкой данных")
    @Story("Проверка добавления нескольких языков")
    @Tag("language")
    @DisplayName("Успешное добавление второго языка")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    void addLanguageOnFirstScreen() {
        addLanguageScreen
                .clickAddOrEditLanguages()
                .clickAddLanguage()
                .addLanguage()
                .checkListOfAddedLanguages("EN", "RU")
                .clickBackButton()
                .checkSizeOfLanguagesList(2);
    }
}