package testCase;

import base.BaseTest;
import org.testng.annotations.Test;
import pageEvents.SubmittedPageEvents;
import pageEvents.WebFormPageEvents;

public class WebFormTestCase extends BaseTest {
    WebFormPageEvents webFormPageEvents = new WebFormPageEvents();
    SubmittedPageEvents submittedPageEvents = new SubmittedPageEvents();

    @Test
    public void testWebForm() {
        webFormPageEvents.verifyPageTitle();
        webFormPageEvents.verifyHeading();
        webFormPageEvents.inputText();
        webFormPageEvents.inputPassword();
        webFormPageEvents.inputTextArea();
        webFormPageEvents.verifyDisabledInput();
        webFormPageEvents.verifyReadOnlyInput();

        webFormPageEvents.fillSelectDropdown();
        webFormPageEvents.fillDataListDropdown();

        webFormPageEvents.clickSubmitButton();

        submittedPageEvents.verifyPageTitle();
        submittedPageEvents.verifyHeading();
        submittedPageEvents.verifyMessageText();
    }
}
