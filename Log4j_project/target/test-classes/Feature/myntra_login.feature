Feature: Login to Myntra Application

	Scenario: Login with valid credentials
			Given User is on Myntra Login page
			When User enters valid username and password
			And User clicks login button
			Then User should be able to login sucessfully and Home page opens