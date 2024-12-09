package com.ecommerce.base;

import com.microsoft.playwright.*;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pom.LoginPage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    protected Page page;
    protected Browser browser;
    protected BrowserContext context;
    protected Playwright playwright;
    protected LoginPage loginPage;
    protected String login;
    protected String password;

    @BeforeMethod(
            groups = "before"
    )
    public void setUp() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/test/resources/login.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        login = properties.getProperty("login");
        password = properties.getProperty("password");

        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
        context = browser.newContext();
        page = context.newPage();
        page.navigate("https://app.asana.com/-/login");
        page.setViewportSize(1920, 1080); // maximize window

        loginPage = new LoginPage(page);
        loginPage.login(login, password);
    }

    protected String getLogin() {
        return login;
    }

    protected String getPassword() {
        return password;
    }

    @AfterMethod(
            groups = "after"
    )
    public void tearDown() {
        if (browser != null) {
            browser.close();
        }
        if (playwright != null) {
            playwright.close();
        }
    }
}