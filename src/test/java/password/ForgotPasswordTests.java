package password;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.HomePage;
import pages.RetrievePasswordPage;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testForgotPassword(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("tau@example.com");
        RetrievePasswordPage retrievePasswordPage = forgotPasswordPage.clickRetrievePassword();
        assertTrue(retrievePasswordPage.getAlertText().contains("Internal Server Error"), "An error occurred");
    }
}
