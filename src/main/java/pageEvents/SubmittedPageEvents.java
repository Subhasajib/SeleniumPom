package pageEvents;

import org.testng.Assert;
import utils.ElementFetch;

public class SubmittedPageEvents {

    ElementFetch el = new ElementFetch();

    public void verifyPageTitle() {
        Assert.assertEquals(el.getPageTitle(), "Web form - target page", "Page title is not as expected");
    }

    public void verifyHeading() {
        Assert.assertEquals(
                el.getWebElement("XPATH", "/html/body/main/div/div/div/h1").getText(),
                "Form submitted",
                "Heading is not as expected"
        );
    }

    public void verifyMessageText() {
        Assert.assertEquals(
                el.getWebElement("ID", "message").getText(),
                "Received!",
                "Message text is not as expected"
        );
    }
}
