package com.qa.page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class LoginModalPage {
    private final SelenideElement closeButton = $("[data-test-id='cross']");

    @Step("Закрываем форму авторизации")
    public void closeLoginModal() {
        closeButton.click();
    }
}