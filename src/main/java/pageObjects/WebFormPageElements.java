package pageObjects;

public interface WebFormPageElements {
    String headingXPath = "/html/body/main/div/div/div/h1";
    String textInputId = "my-text-id";
    String passwordInputName = "my-password";
    String textAreaInputName = "my-textarea";
    String disableInputName = "my-disabled";
    String readOnlyInputName = "my-readonly";

    String dropdownSelectName = "my-select";
    String inputDataListName = "my-datalist";
    String optionDataListXPath = "//datalist[@id='my-options']/option";
    String uploadFileName = "my-file";

    String submitButtonXPath = "/html/body/main/div/form/div/div[2]/button";
}
