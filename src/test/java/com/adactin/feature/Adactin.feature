Feature: Testing Adactin Application end to end process

Scenario: verify that user is able to login the application

Given user launch the application
When user enters the valid username in the username field
And user enters the valid password in the password field
And user is able to click the login button
Then user verify the homepage navigates to searchhotel