Feature:

@SmokeTest
Scenario: To check title of the Application
Given User opens the Browser
And User navigate to the "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" web page
Then User verifies the title of web page
And User closes the Browser

@RegressionTest
Scenario Outline: To check login functionality of the Application
Given User opens the Browser
And User navigate to the "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" web page
When User enters '<Username>' the username
And User enters '<Password>' the password
And User clicks the login button
Then User verifies the profile account
And User closes the Browser
Examples: 
|Username|Password|
|Admin|admin123|

