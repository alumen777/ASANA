package pom;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.testng.Assert;

public class BasePage {
    private Page page;

    public void navigateToCrossFunctionalProject(){
        page.click("loc");
    }
    public void navigateToWorkRequests(){
        page.click("loc");
    }
    public boolean verifyColumn(Locator columnLocator, String columnName) {
        columnLocator.waitFor();
        return columnLocator.textContent().contains(columnName);
    }

    public boolean verifyPriorityTag(Locator priorityTagLocator, String priorityTag) {
        priorityTagLocator.waitFor();
        return priorityTagLocator.textContent().contains(priorityTag);
    }

    public boolean verifyTrackTag(Locator trackTagLocator, String trackTag) {
        trackTagLocator.waitFor();
        return trackTagLocator.textContent().contains(trackTag);
    }
}
