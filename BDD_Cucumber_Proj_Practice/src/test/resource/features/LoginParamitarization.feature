Feature: Login Feature validating with param
Scenario: validate Login scenario with parametirization

Given user is  on Login page
When user enters <username> and <password>
And user clicks on login button in login screen
And user navigate to home after successfull login
 
Examples:
 |username | password |
 |Testuser1 | 12345 |
 |Testuser2 | 12345 |
