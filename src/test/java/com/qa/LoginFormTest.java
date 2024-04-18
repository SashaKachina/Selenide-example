package com.qa;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;

public class LoginFormTest extends BaseTest {

    @Test(
            description = "Проверка открытия формы логина с главной страницы при нажатии на 'Войти'",
            testName = "Открытие формы логина с главной"
    )
    public void checkOpeningLoginForm() {
        mainPage.logoShouldBe(visible);
        mainPage.openLoginForm();
        loginModalPage.closeLoginModal();
    }
}