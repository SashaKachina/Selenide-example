package com.qa.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private final Duration TIMEOUT = Duration.ofSeconds(10);
    private final SelenideElement logo = $("[data-testid='whiteline-logo-item']");
    private final SelenideElement logIn = $("[class*='logged-out-one-click'] [class*='resplash-btn']");

    @Deprecated
    @Step("Открываем форму логина")
    public void openLoginForm() {
        logIn.shouldBe(visible, TIMEOUT).click();
    }

    @Step("Лого должно быть {condition}")
    public void logoShouldBe(Condition condition) {
        logo.shouldBe(condition, TIMEOUT);
    }
}