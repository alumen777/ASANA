package pom;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class WorkRequestPage extends LoginPage {

    private Page page;
    private BasePage basePage;

    private Locator laptopSetupNewHireColumn = page.locator("//[role=columnheader]");
    private Locator laptopSetupNewHirePriorityTag = page.locator("//[role=columnheader]");
    private Locator laptopSetupNewHireTrackTag = page.locator("//[role=columnheader]");

    private Locator passwordNotWorkingColumn = page.locator("//[role=columnheader]r");
    private Locator passwordNotWorkingPriorityTag = page.locator("//[role=columnheader]");
    private Locator passwordNotWorkingTrackTag = page.locator("//[role=columnheader]");

    private Locator newKeycardDanielaVColumn = page.locator("//[role=columnheader]r");
    private Locator newKeycardDanielaVPriorityTag = page.locator("//[role=columnheader]");
    private Locator newKeycardDanielaVTrackTag = page.locator("//[role=columnheader]");
    public WorkRequestPage(Page page) {
        super(page);
       // basePage = new BasePage();
    }
    public boolean verifyLaptopSetupNewHireColumn(String columnName) {
        return basePage.verifyColumn(laptopSetupNewHireColumn, columnName);
    }

    public boolean verifyLaptopSetupNewHirePriorityTag(String priorityTag) {
        return basePage.verifyPriorityTag(laptopSetupNewHirePriorityTag, priorityTag);
    }

    public boolean verifyLaptopSetupNewHireTrackTag(String trackTag) {
        return basePage.verifyTrackTag(laptopSetupNewHireTrackTag, trackTag);
    }

    public boolean verifyPasswordNotWorkingColumn(String columnName) {
        return basePage.verifyColumn(passwordNotWorkingColumn, columnName);
    }

    public boolean verifyPasswordNotWorkingPriorityTag(String priorityTag) {
        return basePage.verifyPriorityTag(passwordNotWorkingPriorityTag, priorityTag);
    }

    public boolean verifyPasswordNotWorkingTrackTag(String trackTag) {
        return basePage.verifyTrackTag(passwordNotWorkingTrackTag, trackTag);
    }

    public boolean verifyNewKeycardDanielaVColumn(String columnName) {
        return basePage.verifyColumn(newKeycardDanielaVColumn, columnName);
    }

    public boolean verifyNewKeycardDanielaVPriorityTag(String priorityTag) {
        return basePage.verifyPriorityTag(newKeycardDanielaVPriorityTag, priorityTag);
    }

    public boolean verifyNewKeycardDanielaVTrackTag(String trackTag) {
        return basePage.verifyTrackTag(newKeycardDanielaVTrackTag, trackTag);
    }
}
