CyshieldWeb Automation Project

This project is an automation framework for web testing using Selenium WebDriver, Maven, and TestNG. It is designed to work with the Chrome browser and is configured to run tests on a remote Selenium Grid.

Project Structure
BasePage: Contains common methods for interacting with web elements, including waiting for visibility, clicking elements, and handling alerts.
HomePage: Contains methods specific to interactions on the Home Page of the application.
RegisterPage: Contains methods for interacting with the registration form, including form field inputs and submission.
TestScenarioPage: Contains methods for accessing the test scenario page and registering for the form.
BaseTest: Sets up and tears down the WebDriver for each test method, managing browser configuration and navigation.
POM File: Defines project dependencies and configurations for Maven.
Prerequisites
Java 15
Maven
Selenium WebDriver
Access to a remote Selenium Grid (or local Selenium Server)
Chrome browser installed
Setup
1. Install Dependencies
Ensure Maven is installed. To install the project dependencies, run:

bash
Copy code
mvn clean install
2. WebDriver Setup
Ensure that the WebDriver is correctly set up and accessible. The project uses a remote Selenium Grid configured at http://192.168.1.103:4444. Update the BaseTest class if you need to use a different Selenium Grid or local WebDriver.

3. Configure ChromeDriver
Ensure you have the Chrome browser installed on your local machine or the environment where the Selenium Grid is running.

Running Tests
1. Test Execution
To run the tests, use Maven commands. The tests are structured using TestNG. Execute the following command to run the tests:

bash
Copy code
mvn test
2. Test Configuration
You can configure test parameters and browsers in the testng.xml file located in the resources directory. Ensure that the configurations are appropriate for your testing environment.

Key Dependencies
Selenium Java: Provides bindings for Java to interact with web browsers.
TestNG: Framework for structuring and running test cases.
Allure TestNG: For generating reports and integrating with the Allure reporting tool.
POI: For working with Excel files if data-driven testing is involved.
Gson: For parsing JSON data files.
JSON: For handling JSON data in test cases.
Test Workflow
Setup: Before each test, the setup method in BaseTest initializes the WebDriver, navigates to the base URL, and maximizes the browser window.
Test Execution: Tests are defined in various test classes (e.g., RegisterTest), which use page objects to interact with the application.
Teardown: After each test, the tearDown method in BaseTest closes the browser and cleans up the WebDriver session.
Troubleshooting
WebDriver Issues: Ensure the remote Selenium Grid or local WebDriver server is running and accessible.
Browser Issues: Verify that the Chrome browser version is compatible with the WebDriver version.
Timeout Errors: Adjust the wait time in the BasePage class if there are issues with element visibility.
Contributing
Feel free to fork the repository and submit pull requests. For significant changes, please open an issue first to discuss the proposed changes.

License
This project is licensed under the MIT License - see the LICENSE file for details.







