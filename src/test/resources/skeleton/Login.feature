Feature: Login Feature
Background:
Given Thr URL of the aaplication

Scenario: Valid User
When user enters mercury as username
And user enters mercury as password
And user click on Submit button
Then User is valid

Scenario: InValid User
When user enters ABS as username
And user enters ABCD as password
And user click on Submit button
Then User is Invalid