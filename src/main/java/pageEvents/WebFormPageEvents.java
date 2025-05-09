package pageEvents;

import org.testng.Assert;
import pageObjects.WebFormPageElements;
import utils.ElementFetch;

public class WebFormPageEvents {

    ElementFetch el = new ElementFetch();

    public void verifyPageTitle() {
        Assert.assertEquals(el.getPageTitle(), "Web form", "Page title is not as expected");
    }

    public void inputText() {
        el.getWebElement("ID", WebFormPageElements.textInputId).sendKeys("Lorem ipsum dolor sit amet");
    }

    public void inputPassword() {
        el.getWebElement("NAME", WebFormPageElements.passwordInputName).sendKeys("password");
    }

    public void inputTextArea() {
        el.getWebElement("NAME", WebFormPageElements.textAreaInputName).sendKeys("Lorem ipsum dolor sit amet");
    }

    public void verifyDisabledInput() {
        Assert.assertNotNull(
                el.getWebElement("NAME", WebFormPageElements.disableInputName).getDomAttribute("disabled"),
                "Input is enabled"
        );
    }

    public void verifyReadOnlyInput() {
        Assert.assertNotNull(
                el.getWebElement("NAME", WebFormPageElements.readOnlyInputName).getDomAttribute("readonly"),
                "Input is not read-only"
        );
    }

    public void clickSubmitButton() {
        el.getWebElement("XPATH", WebFormPageElements.submitButtonXPath).click();
    }
}
