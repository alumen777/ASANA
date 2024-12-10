package pom;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class LoginPage extends BasePage{
    private Page page;

    public LoginPage(Page page) {
        super(page);
        this.page = page;
    }
    //private Locator  userLogin page.locator("role=cell");
    public void login(String login, String password) {
        page.fill("#username", login);
        //page.click("//div[contains(@class, 'LoginEmailForm-continueButton')]");
        page.fill("#password", password);
        //page.isEnabled(("/"));
        page.click(("//button[@type='submit']"));
    }
}