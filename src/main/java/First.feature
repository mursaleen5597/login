Feature: feature to test the google test functionality
Scenario: To validate if google search is working
Given Browser is open
And user is on search page
When user enters the text in search box
And hits enter button
Then user is navigated to the sea\rch result