@SmokeTest
Feature: feature to test google serach functionality

Scenario: Validate google serach is working

Given browser is open
And user is on google search page
When user enters a text in serach box
And hits enter
Then user is navigated to search results
