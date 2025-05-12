# Selenium Web Form Automation using POM

This project demonstrates automated testing of various input elements on the official [Selenium Web Form](https://www.selenium.dev/selenium/web/web-form.html) using **Selenium WebDriver** with the **Page Object Model (POM)** design pattern in Java.

## 📂 Project Structure

SeleniumPom/
├── src/
│ ├── main/
│ │  ├── java/
│ │  │   ├── base
│ │  │   ├── pageEvents
│ │  │   ├── pageObjects
│ │  │   └── utils
│ │  └── resources
│ └── test/
│  └── java/
│   └── testCase/
│    └── WebFormTestCase.java
├── reports
├── screenshots
├── pom.xml
└── testng.xml

## 🚀 Features

- Implements Page Object Model (POM) to enhance code reusability and readability
- Tests a variety of form inputs: text fields, color pickers. date pickers, dropdowns, checkboxes, radio buttons, and file uploads
- Captures screenshots on failure
- Generates HTML test reports
- Uses **TestNG** for test management

## 🛠️ Technologies Used

- Java JDK 17
- IntelliJ IDEA Community Edition 2024.3.5
- Selenium WebDriver
- Maven
- TestNG (built-in with IntelliJ)
- ExtentReports

## 🚀 How to Run

1. **Clone the Repository**

    ```bash
    git clone https://github.com/otakmager/SeleniumPom.git
    ```

2. **Run the Test with IntelliJ IDEA**

- Open the project in **IntelliJ IDEA Community Edition 2024.3.5**
- Make sure you have **Java JDK 17** configured in your project SDK
- Right-click on `testng.xml` and select **Run 'testng.xml'**
- No need to install Maven or run tests via terminal

## 📄 View Reports
After running the tests, open the generated HTML report located in the `reports/` directory.

## 📸 Screenshots

Screenshots are saved in the `screenshots/` folder upon test failure for debugging purposes.

## 🔍 Test Coverage

The main test case is located in:

```
src/test/java/testCase/WebFormTestCase.java
```

It performs end-to-end interaction and assertion on all major elements in the [Selenium Web Form](https://www.selenium.dev/selenium/web/web-form.html).



