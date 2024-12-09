package pom;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class CrossFunctionalProjectPage extends LoginPage {
    private Page page;
    private BasePage basePage;
    //DraftProjectBrie
    private Locator draftProjectBriePriorityTag = page.locator("role=cell");
    private Locator draftProjectBrieTrackTag = page.locator("role=cell");
    private Locator draftProjectBrieColumn = page.locator("role=columnheader");
    // scheduleKickoffMeeting
    private Locator scheduleKickoffMeetingPriorityTag = page.locator("role=cell");
    private Locator scheduleKickoffMeetingTrackTag = page.locator("role=cell");
    private Locator scheduleKickoffMeetingColumn = page.locator("role=columnheader");
    //shareTimelineWithTeammates
    private Locator shareTimelineWithTeammatesPriorityTag = page.locator("role=cell");
    private Locator shareTimelineWithTeammatesTrackTag = page.locator("role=cell");
    private Locator shareTimelineWithTeammatesColumn = page.locator("role=columnheader");


    public CrossFunctionalProjectPage(Page page) {
        super(page);
        basePage = new BasePage();
    }

    public boolean verifyDraftProjectBrieColumn(String columnName) {
        return basePage.verifyColumn(draftProjectBrieColumn, columnName);
    }

    public boolean verifyDraftProjectBriePriorityTag(String priorityTag) {
        return basePage.verifyPriorityTag(draftProjectBriePriorityTag, priorityTag);
    }

    public boolean verifyDraftProjectBrieTrackTag(String trackTag) {
        return basePage.verifyTrackTag(draftProjectBrieTrackTag, trackTag);
    }

    public boolean verifyScheduleKickoffMeetingColumn(String columnName) {
        return basePage.verifyColumn(scheduleKickoffMeetingColumn, columnName);
    }

    public boolean verifyScheduleKickoffMeetingPriorityTag(String priorityTag) {
        return basePage.verifyPriorityTag(scheduleKickoffMeetingPriorityTag, priorityTag);
    }

    public boolean verifyScheduleKickoffMeetingTrackTag(String trackTag) {
        return basePage.verifyTrackTag(scheduleKickoffMeetingTrackTag, trackTag);
    }

    public boolean verifyShareTimelineWithTeammatesColumn(String columnName) {
        return basePage.verifyColumn(shareTimelineWithTeammatesColumn, columnName);
    }

    public boolean verifyShareTimelineWithTeammatesPriorityTag(String priorityTag) {
        return basePage.verifyPriorityTag(shareTimelineWithTeammatesPriorityTag, priorityTag);
    }

    public boolean verifyShareTimelineWithTeammatesTrackTag(String trackTag) {
        return basePage.verifyTrackTag(shareTimelineWithTeammatesTrackTag, trackTag);
    }

}
