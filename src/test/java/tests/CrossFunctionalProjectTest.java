package tests;

import com.ecommerce.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.CrossFunctionalProjectPage;
@Deprecated
public class CrossFunctionalProjectTest extends BaseTest {

    @Test
    public void testDraftProjectBrie() {
        CrossFunctionalProjectPage projectPage = new CrossFunctionalProjectPage(page);
        projectPage.navigateToCrossFunctionalProject();

        Assert.assertTrue(projectPage.verifyDraftProjectBrieColumn("To do"));
        Assert.assertTrue(projectPage.verifyDraftProjectBriePriorityTag("Non-Priority"));
        Assert.assertTrue(projectPage.verifyDraftProjectBrieTrackTag("On track"));
    }

    @Test
    public void testScheduleKickoffMeeting() {
        CrossFunctionalProjectPage projectPage = new CrossFunctionalProjectPage(page);
        projectPage.navigateToCrossFunctionalProject();

        Assert.assertTrue(projectPage.verifyScheduleKickoffMeetingColumn("To do"));
        Assert.assertTrue(projectPage.verifyScheduleKickoffMeetingPriorityTag("Medium"));
        Assert.assertTrue(projectPage.verifyScheduleKickoffMeetingTrackTag("At risk."));
    }

    @Test
    public void testShareTimelineWithTeammates() {
        CrossFunctionalProjectPage projectPage = new CrossFunctionalProjectPage(page);
        projectPage.navigateToCrossFunctionalProject();

        Assert.assertTrue(projectPage.verifyShareTimelineWithTeammatesColumn("To do"));
        Assert.assertTrue(projectPage.verifyShareTimelineWithTeammatesPriorityTag("High"));
        Assert.assertTrue(projectPage.verifyShareTimelineWithTeammatesTrackTag("Off track"));
    }
}