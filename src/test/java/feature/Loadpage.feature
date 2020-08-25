Feature: Free load page

@smoke1
Scenario: Free load test LOAD FEATURE
Given user is on website "https://www.freecrm.com"
When title of login page is displayed
Then user enters details
And user clicks on testlink
Then user is on test page

@second
Scenario: Free load test
Given user is on website
When title of login page is displayed

@third
Scenario: Free load test
Given user is on website
When title of login page is displayed
Then user enters details