package pom;

import com.microsoft.playwright.Page;
import org.testng.Assert;

public class WebApplicationPage extends LoginPage {
    private Page page;
    private BasePage basePage;


    private static final String COLUMN_LOCATOR = ".flex.flex-col.w-80.bg-gray-50.rounded-lg.p-4";
    private static final String TICKET_LOCATOR = ".flex.flex-col.gap-3";
    private static final String PRIORITY_TAG_LOCATOR = ".flex.flex-wrap.gap-2.mb-3 :nth-child(2)";
    private static final String TRACK_TAG_LOCATOR = ".flex.flex-wrap.gap-2.mb-3 :nth-child(1)";


    public WebApplicationPage(Page page) {
        super(page);
        this.page = page;
        basePage = this;
    }

    public void verifyTicketInColumn(Page page, String columnName, String ticketName) {
        boolean result = isTicketInColumn(page, columnName, ticketName, COLUMN_LOCATOR);
        System.out.println(result);
        Assert.assertTrue(result);
    }

    public void verifyPriorityTagOnAuthenticationTicket(Page page, String ticketName, String tagName) {
        boolean result = isTagPresentOnTicket(page, ticketName, tagName, TICKET_LOCATOR, PRIORITY_TAG_LOCATOR);
        Assert.assertTrue(result);
    }

    public void verifyTrackTagOnAuthenticationTicket(Page page, String ticketName, String tagName) {
        boolean result = isTagPresentOnTicket(page, ticketName, tagName, TICKET_LOCATOR, TRACK_TAG_LOCATOR);
        Assert.assertTrue(result);
    }
}
