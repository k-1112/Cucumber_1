Feature: Login to HRM Application

	Scenario: Login with valid credentials
			Given User is on HRMLogin page
			When User enters valid username and password
			And User clicks login button
			Then User should be able to login sucessfully and Home page opens