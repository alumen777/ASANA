package pom;

import com.microsoft.playwright.Page;

public class LoginPage extends BasePage{
    private Page page;

    public LoginPage(Page page) {
        this.page = page;
    }

    public void login(String login, String password) {
        page.fill("//input[@type='email']", login);
        page.click("//div[contains(@class, 'LoginEmailForm-continueButton')]");
        page.fill("//input[@name='p']", password);
        //page.isEnabled(("/"));
        page.click(("div.ButtonThemeablePresentation--isEnabled.ButtonThemeablePresentation"));
    }
}