Feature: Application Login

Scenario: Home Page default login
Given User is on Netbanking landing page
When User login into application with "jin" and "1234"
Then Home page is populated
And cards displayed are "true"

Scenario: Home Page default login
Given User is on Netbanking landing page
When User login into application with "john" and "4321"
Then Home page is populated
And cards displayed are "false"
