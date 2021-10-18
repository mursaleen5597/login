Feature: feature to test the Demoblaze login functionality
Scenario: To validate if the login functionality is working
Given Browser is open
And user is on Demoblaze login page
When user enters the username and password in respective text boxes
And user hits login button
Then user is navigated to the home page successfully

Scenario: To validate that Login functionality is not working while providing both blank credentials
Given Browser is open
And user is on Demoblaze login page
When user will NOT enter the username and password in respective text boxes
And user hits login button
Then error message should be displayed to the user

Scenario: To validate that Login functionality is not working while providing any one invalid credentials
Given Browser is open
And user is on Demoblaze login page
When user will enter only the username and NOT password in respective text boxes
And user hits login button
Then error message should be displayed to the user

Scenario: To validate that Login functionality should not be working while providing both invalid credentials
Given Browser is open
And user is on Demoblaze login page
When user will enter invalid username and inavalid password in respective text boxes
And user hits login button
Then error message should be displayed to the user

Scenario: To validate that Login functionality that user should not be able to perform copy/paste operations on Password field
Given Browser is open
And user is on Demoblaze login page
When user will enter username and perform copy or paste operation on password field
And user hits login button
Then error message should be displayed to the user

Scenario: To validate that Login functionality should not be working while providing credentials beyond the specified length
Given Browser is open
And user is on Demoblaze login page
When user will enter username and password beyond the specified limit in respective text boxes
And user hits login button
Then error message should be displayed to the user

Scenario: To validate that Login functionality should not be working while providing credentials below the specified length
Given Browser is open
And user is on Demoblaze login page
When user will enter username and password below the specified limit in respective text boxes
And user hits login button
Then error message should be displayed to the user

Scenario: To validate that close button is working or not on login page
Given Browser is open
And user is on Demoblaze login page
When user hits on close button
Then login window must be closed


