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

    String checkBox1Id = "my-check-1";
    String checkBox2Id = "my-check-2";
    String radioButton1Id = "my-radio-1";
    String radioButton2Id = "my-radio-2";

    String inputHiddenXPath = "//input[@type='hidden'][@name='my-hidden']";

    String submitButtonXPath = "//button[@type='submit']";
}
