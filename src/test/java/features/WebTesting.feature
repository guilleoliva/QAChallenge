Feature: QA Coding Challenge - III
  Verify via the UI that as a borrower - you are seeing loan offers, upon filling the required form fields with valid inputs

@testingsteps
Scenario: Automate via the UI, the web scenario mentioned in User Story, and include any validations you deem necessary

  Given I navigate to the Credify page
  When I enter the loan amount "2,000"
  And I select the loan purpose "Business"
  And I click on Check Your Rate button
  And I enter my personal information on page
    |  First Name  |   Last Name   |   Home Adress                           | DOB         |Annual Income |Additional Income |                     Email                     | Password  |
    |  Tester      | PatchApiTest  |533 South 3rd Street, Columbus, OH, USA  | 01/01/1979  | 100,000      |   5,000          |  diazOlivaGuillermo2222@upgrade-challenge.com  | Catalo12  |
  And I click on check Rate to submit the information
  Then I am on the Offer Page
  And I store values of Loan Amount, APR, Loan Term and Loan Term
  And I click on Sign out on menu
  When I navigate to the Credify login page
  When I enter the following valid credentials
    |                   username                      |    password   |
    | diazOlivaGuillermo2222@upgrade-challenge.com    |     Catalo12 |
  And I click on login Button
  Then I am on the Offer Page
  And Validate that Loan Amount, APR, Loan Term and Loan Term matches with the info stored previously
