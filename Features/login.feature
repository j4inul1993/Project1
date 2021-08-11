Feature: Login functionality test
Scenario: Login with valid username and password
Given Open browser
When Open url
And Put valid username
And Put valid password
And Open the home page
And Open the transfer page
Then Validate the page title