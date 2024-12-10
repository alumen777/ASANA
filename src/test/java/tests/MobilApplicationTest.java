package tests;

import com.ecommerce.base.BaseTest;
import org.testng.annotations.Test;
import pom.MobilApplicationPage;
import pom.WebApplicationPage;

public class MobilApplicationTest extends BaseTest {
    @Test
    public void testVerifyPushNotification() {
        MobilApplicationPage mobilApplicationPage = new MobilApplicationPage(page);
        mobilApplicationPage.verifyTicketInColumnOnMob(page, "To Do", "Push notification system");
        mobilApplicationPage.verifyTrackTagOnMob(page, "Push notification system", "Feature");
    }

    @Test
    public void testVerifyOfflineMode() {
        MobilApplicationPage mobilApplicationPage = new MobilApplicationPage(page);
        mobilApplicationPage.verifyTicketInColumnOnMob(page, "In Progress", "Offline mode");
        mobilApplicationPage.verifyTrackTagOnMob(page, "Offline mode", "Feature");
        mobilApplicationPage.verifyPriorityTagOnMob(page, "Offline mode", "High Priority");
    }

    @Test
    public void testVerifyIconDesign() {
        MobilApplicationPage mobilApplicationPage = new MobilApplicationPage(page);
        mobilApplicationPage.verifyTicketInColumnOnMob(page, "Done", "App icon design");
        mobilApplicationPage.verifyTrackTagOnMob(page, "App icon design", "Design");
    }
}
