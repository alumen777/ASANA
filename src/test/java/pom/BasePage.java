package pom;

import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import java.util.List;

public class BasePage {
    private Page page;

    public BasePage(Page page) {
        this.page = page;
    }
    public static final String LOCATOR_MOB_APP ="//button/h2[contains(text(), 'Mobile Application')]";
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
    public void navigateToMobPage() {
        page.click(LOCATOR_MOB_APP);
    }

    public boolean verifyPriorityTag(Locator priorityTagLocator, String priorityTag) {
        priorityTagLocator.waitFor();
        return priorityTagLocator.textContent().contains(priorityTag);
    }

    public boolean verifyTrackTag(Locator trackTagLocator, String trackTag) {
        trackTagLocator.waitFor();
        return trackTagLocator.textContent().contains(trackTag);
    }
    public boolean isTicketInColumn(Page page, String columnName, String ticketName, String columnLocator) {
        List<ElementHandle> columns = page.querySelectorAll(columnLocator);
        for (ElementHandle column : columns) {
            ElementHandle titleElementH2 = column.querySelector("h2");
            String titleH2 = titleElementH2.textContent();
            System.out.println(titleH2);
            if (titleH2.contains(columnName)) {
                List<ElementHandle> titleElementsH3 = column.querySelectorAll("h3");
                for (ElementHandle titleElementH3 : titleElementsH3) {
                    String titleH3 = titleElementH3.textContent();
                    System.out.println(titleH3);
                    if (titleH3.contains(ticketName)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean isTagPresentOnTicket(Page page, String ticketName, String tagName, String ticketLocator, String tagLocator) {
        List<ElementHandle> tickets = page.querySelectorAll(ticketLocator);
        for (ElementHandle ticket : tickets) {
            String ticketText = ticket.textContent();
            if (ticketText.contains(ticketName)) {
                List<ElementHandle> tagElements = ticket.querySelectorAll(tagLocator);
                for (ElementHandle tagElement : tagElements) {
                    String tagText = tagElement.textContent();
                    if (tagName.contains(tagText)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
