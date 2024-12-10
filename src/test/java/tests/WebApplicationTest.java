package tests;

import com.ecommerce.base.BaseTest;
import org.testng.annotations.Test;
import pom.WebApplicationPage;

public class WebApplicationTest extends BaseTest {

    @Test
    public void testVerifyImplementUserAuthenticationTicket() {

        WebApplicationPage webApplicationPage = new WebApplicationPage(page);
        webApplicationPage.verifyTicketInColumn(page, "To Do", "Implement user authentication");
        webApplicationPage.verifyPriorityTagOnAuthenticationTicket(page, "Implement user authentication", "High Priority");
        webApplicationPage.verifyTrackTagOnAuthenticationTicket(page, "Implement user authentication", "Feature");
    }

    @Test
    public void testVerifyFixNavigationBug() {
        WebApplicationPage webApplicationPage = new WebApplicationPage(page);
        webApplicationPage.verifyTicketInColumn(page, "To Do", "Fix navigation bug");
        webApplicationPage.verifyTrackTagOnAuthenticationTicket(page, "Fix navigation bug", "Bug");
    }

    @Test
    public void testVerifyDesignSystem() {
        WebApplicationPage webApplicationPage = new WebApplicationPage(page);
        webApplicationPage.verifyTicketInColumn(page, "In Progress", "Design system updates");
        webApplicationPage.verifyTrackTagOnAuthenticationTicket(page, "Design system updates", "Design");
    }
}
