


@Login
Feature:Testing the login functionality
Scenario Outline:To go the firstcry website and testing the login link
Given I open the browser
Then I enter the Url
Then I click on Login Link
Then I enter the email as <emailid>
Then I click on continue button
Then I wait for the otp
Then I  click on submit button
Then I go to my account link and my profile
And check my profile
Examples:
         |emailid|
         |"endproject04@gmail.com"|

