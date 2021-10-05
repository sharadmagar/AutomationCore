Feature: CRM Login Feature
this feature is to test login functionality

#Scenario: Validate Login
#Given User is on login page
#When user enters "sharadmagar450@gmail.com" and "Welcome@22" login details
#Then user is on the home page
#And close the browser

Scenario Outline: Validate Login
Given User is on login page
When user enters "<username>" and "<password>" login details
Then user is on the home page
And close the browser

Examples:
	| username | password |
	| sharadmagar450@gmail.com | Welcome@22 |
	| corpdevops@gmail.com | CrmPro123 |