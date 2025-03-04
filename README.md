DEMOQA End-to-End Testing

Project Overview

This project automates end-to-end (E2E) testing for the DEMOQA website using Selenium. It validates different functionalities of the website to ensure a seamless user experience.

Features

Automated testing of various UI components

Validates form submissions, buttons, and other interactive elements

Generates test reports for analysis

Uses Selenium WebDriver for browser automation

Installation & Setup

Prerequisites

Java (JDK 11 or later)

Maven (for dependency management)

Selenium WebDriver

TestNG (if used for test execution)

A preferred browser (Chrome, Firefox, etc.) with its corresponding WebDriver

Steps to Set Up the Project

Clone this repository:

git clone https://github.com/Shripatil31/DEMOQA_e2e_testing.git
cd DEMOQA_e2e_testing

Install dependencies using Maven:

mvn clean install

Ensure the appropriate WebDriver is configured in the project.

Running Tests

To execute the test suite, run:

mvn test

For running specific test classes:

mvn -Dtest=TestClassName test

Test Reporting

If using TestNG, the test reports will be generated in the test-output directory.
To view detailed reports, open:

./test-output/index.html

Technologies Used

Selenium WebDriver – For browser automation

Java – For scripting test cases

TestNG/JUnit – For test execution and assertions

Maven – For dependency management

Contributing

Feel free to fork this repository, submit issues, or contribute via pull requests.

License

This project is open-source. Feel free to modify and use it as needed.
