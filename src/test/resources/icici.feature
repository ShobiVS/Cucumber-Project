@Feature1
Feature: To validate the login page of icici application
@sanity
Scenario: To validate the login with valid username and valid password
Given To launch the chrome browser and maximize the window
When To launch the url
And To pass the valid userID
And To pass the valid password
And To click the login
Then To close the browser