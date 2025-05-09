package pageEvents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pageObjects.WebFormPageElements;
import utils.ElementFetch;

import java.util.List;

public class WebFormPageEvents {

    ElementFetch el = new ElementFetch();

    public void verifyPageTitle() {
        Assert.assertEquals(el.getPageTitle(), "Web form", "Page title is not as expected");
    }

    public void verifyHeading() {
        Assert.assertEquals(
                el.getWebElement("XPATH", WebFormPageElements.headingXPath).getText(),
                "Web form",
                "Heading is not as expected"
        );
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

    public void fillSelectDropdown() {
        Select select = new Select(el.getWebElement("NAME", WebFormPageElements.dropdownSelectName));
        select.selectByValue("2");
    }

    public void fillDataListDropdown() {
        String optionToSelect = "New York";

        WebElement inputElement = el.getWebElement("NAME", WebFormPageElements.inputDataListName);
        inputElement.clear();
        inputElement.sendKeys(optionToSelect);

        List<WebElement> options = el.getWebElements("XPATH", WebFormPageElements.optionDataListXPath);
        boolean found = false;


        for (WebElement opt : options) {
            String optValue = opt.getDomAttribute("value");
            Assert.assertNotNull(optValue);
            if (optValue.equals(optionToSelect)) {
                found = true;
                break;
            }
        }

        Assert.assertTrue(found, "Option not found in the data list");
    }

    public void uploadFile() {
        String filePath = System.getProperty("user.dir") + "/src/main/resources/file/empty.txt";
        el.getWebElement("NAME", WebFormPageElements.uploadFileName).sendKeys(filePath);
    }

    public void clickSubmitButton() {
        el.getWebElement("XPATH", WebFormPageElements.submitButtonXPath).click();
    }
}
