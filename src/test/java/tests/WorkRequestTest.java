package tests;

import com.ecommerce.base.BaseTest;
import com.ecommerce.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.CrossFunctionalProjectPage;
import pom.WorkRequestPage;

@Deprecated
public class WorkRequestTest extends BaseTest {

    @Test
    public void testLaptopSetupNewHire() {
        WorkRequestPage workRequestPage = new WorkRequestPage(page);
        workRequestPage.navigateToWorkRequests();

        Assert.assertTrue(workRequestPage.verifyLaptopSetupNewHireColumn("New Requests"));
        Assert.assertTrue(workRequestPage.verifyLaptopSetupNewHirePriorityTag("Medium priority"));
        Assert.assertTrue(workRequestPage.verifyLaptopSetupNewHireTrackTag("Low effort"));
        Assert.assertTrue(workRequestPage.verifyLaptopSetupNewHireTrackTag("New hardware"));
        Assert.assertTrue(workRequestPage.verifyLaptopSetupNewHireTrackTag("Not Started"));
    }
    @Test
    public void testPasswordNotWorking() {
        WorkRequestPage workRequestPage = new WorkRequestPage(page);
        workRequestPage.navigateToWorkRequests();

        Assert.assertTrue(workRequestPage.verifyPasswordNotWorkingColumn("In Progress"));
        Assert.assertTrue(workRequestPage.verifyPasswordNotWorkingPriorityTag("Low priority"));
        Assert.assertTrue(workRequestPage.verifyPasswordNotWorkingTrackTag("Low effort"));
        Assert.assertTrue(workRequestPage.verifyPasswordNotWorkingTrackTag("Password reset"));
        Assert.assertTrue(workRequestPage.verifyPasswordNotWorkingTrackTag("Waiting"));
    }
    @Test
    public void testNewKeycardDanielaV() {
        WorkRequestPage workRequestPage = new WorkRequestPage(page);
        workRequestPage.navigateToWorkRequests();

        Assert.assertTrue(workRequestPage.verifyNewKeycardDanielaVColumn("Completed"));
        Assert.assertTrue(workRequestPage.verifyNewKeycardDanielaVPriorityTag("High Priority"));
        Assert.assertTrue(workRequestPage.verifyNewKeycardDanielaVTrackTag("Low effort"));
        Assert.assertTrue(workRequestPage.verifyNewKeycardDanielaVTrackTag("New hardware"));
        Assert.assertTrue(workRequestPage.verifyNewKeycardDanielaVTrackTag("Done"));
    }
}


