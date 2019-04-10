Feature: QA Coding Challenge
  Verify Create Accounts and Login Features for Goalsetter

@testingsteps
Scenario: Automate via the UI, the web scenario ,mentioned in User Story (Create Account) and include any validations you seem necessary

  Given I navigate to the Goalsetter Create Users page
  And I am on Goalsetter Create Users page
  And I should see the Goalsetter icon on the top of the Page
  When I enter the FirstName "MiguelG"
  When I enter the LastName "DiazO"
  When I enter the Email "Guillermooliva7@yopmail.com"
  When I enter the Password "wgY6j55VR2AZAWf"
  And I click on Create Your Free Goalsetter Account button
  Then I am on Goalsetter Add Kids page
  And I should see the Goalsetter icon on the top of the Add Kids Page
  When I enter the Kid's Name "Benjamin"
  And I click on The stork is on the way
  And I click on Continue button on Add Kids Page
  Then I am on Goalsetter List Kids page
  And I should see the Goalsetter icon on the top of the List Kids Page
  And I should see You´ve added Benjamin on page



