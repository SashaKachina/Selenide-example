package com.qa.page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class LoginModalPage {

    private final Duration TIMEOUT = Duration.ofSeconds(10);
    private final SelenideElement modal = $("[class*='loginAppPopup']");

    @Step("Проверяем отображение модального окна")
    public void checkDisplayingModalPage() {
//        modal.shouldBe(visible, TIMEOUT);
    }
}