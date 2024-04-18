package com.qa;

import com.qa.page.MainPage;
import com.qa.page.LoginModalPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

public class BaseTest {
    protected final MainPage mainPage = new MainPage();
    protected final LoginModalPage loginModalPage = new LoginModalPage();

    @BeforeMethod
    public void setUpBaseURL() {
        open(System.getProperty("baseUrl"));
        addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
    }

    @AfterMethod
    public void closeBrowserAfterTest() {
        closeWebDriver();
    }
}