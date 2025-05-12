package pageObjects;

public interface WebFormPageElements {
    String headingXPath = "/html/body/main/div/div/div/h1";
    String bodyXPath = "//body";
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

    String inputDateXPath = "//input[@type='text'][@name='my-date']";
    String datePickerSwitch1XPath = "//div[@class='datepicker-days']//th[@class='datepicker-switch']";
    String datePickerSwitch2XPath = "//div[@class='datepicker-months']//th[@class='datepicker-switch']";
    String prevButtonClass = "//div[@class='datepicker-years']//th[@class='prev']";
    String targetYearXPath = "//div[@class='datepicker-years']//span[@class='year' and text()='2014']";
    String targetMonthXPath = "//div[@class='datepicker-months']//span[@class='month' and text()='Feb']";
    String targetDayXPath = "//div[@class='datepicker-days']//td[@class='day' and text()='13']";

    String inputRangeXPath = "//input[@type='range'][@name='my-range']";
    String inputHiddenXPath = "//input[@type='hidden'][@name='my-hidden']";

    String submitButtonXPath = "//button[@type='submit']";
}
