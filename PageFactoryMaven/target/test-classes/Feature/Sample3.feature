Feature:

Scenario: To check login functionality of the Application
Given User opens the Browser
And User navigate to the "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" web page
When User enters Login credentilas
|TestData33.xlsx|
And User clicks the login button
Then User verifies the profile account
And User closes the Browser
