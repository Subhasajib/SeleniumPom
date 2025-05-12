package pageEvents;

import base.BaseTest;
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

    public void fillCheckBox() {
        WebElement cb1 = el.getWebElement("ID", WebFormPageElements.checkBox1Id);
        WebElement cb2 = el.getWebElement("ID", WebFormPageElements.checkBox2Id);

        Assert.assertTrue(cb1.isSelected(), "Checkbox 1 should be checked by default");
        Assert.assertFalse(cb2.isSelected(), "Checkbox 2 should be unchecked by default");

        cb1.click();
        cb2.click();

        Assert.assertFalse(cb1.isSelected(), "Checkbox 1 should be unchecked");
        Assert.assertTrue(cb2.isSelected(), "Checkbox 2 should be checked");
    }

    public void fillRadioButton() {
        WebElement rb1 = el.getWebElement("ID", WebFormPageElements.radioButton1Id);
        WebElement rb2 = el.getWebElement("ID", WebFormPageElements.radioButton2Id);

        Assert.assertTrue(rb1.isSelected(), "Radio button 1 should be checked by default");
        Assert.assertFalse(rb2.isSelected(), "Radio button 2 should be unchecked by default");

        rb2.click();
        Assert.assertFalse(rb1.isSelected(), "Checkbox 1 should be unchecked");
        Assert.assertTrue(rb2.isSelected(), "Checkbox 2 should be checked");

        rb1.click();
        Assert.assertTrue(rb1.isSelected(), "Radio button 1 should be checked");
        Assert.assertFalse(rb2.isSelected(), "Radio button 2 should be unchecked");
    }

    public void fillRangeInput() {
        WebElement rangeInput = el.getWebElement("XPATH", WebFormPageElements.inputRangeXPath);

        BaseTest.js.executeScript("arguments[0].value = arguments[1]", rangeInput, 7);
        BaseTest.js.executeScript("arguments[0].value = arguments[1]", rangeInput, -5);
        BaseTest.js.executeScript("arguments[0].value = arguments[1]", rangeInput, 3);
    }

    public void verifyInputHidden() {
        WebElement inputHidden = el.getWebElement("XPATH", WebFormPageElements.inputHiddenXPath);
        String inputType = inputHidden.getDomAttribute("type");

        Assert.assertNotNull(inputType);
        Assert.assertEquals(inputType, "hidden", "Input type is not hidden");
    }

    public void clickSubmitButton() {
        el.getWebElement("XPATH", WebFormPageElements.submitButtonXPath).click();
    }
}
