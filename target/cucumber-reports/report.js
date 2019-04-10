$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("WebTesting.feature");
formatter.feature({
  "line": 1,
  "name": "QA Coding Challenge",
  "description": "Verify Create Accounts and Login Features for Goalsetter",
  "id": "qa-coding-challenge",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4520313275,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Automate via the UI, the web scenario ,mentioned in User Story (Create Account) and include any validations you seem necessary",
  "description": "",
  "id": "qa-coding-challenge;automate-via-the-ui,-the-web-scenario-,mentioned-in-user-story-(create-account)-and-include-any-validations-you-seem-necessary",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@testingsteps"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I navigate to the Goalsetter Create Users page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I am on Goalsetter Create Users page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should see the Goalsetter icon on the top of the Page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter the FirstName \"MiguelG\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I enter the LastName \"DiazO\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I enter the Email \"Guillermooliva7@yopmail.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I enter the Password \"wgY6j55VR2AZAWf\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I click on Create Your Free Goalsetter Account button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I am on Goalsetter Add Kids page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I should see the Goalsetter icon on the top of the Add Kids Page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter the Kid\u0027s Name \"Benjamin\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I click on The stork is on the way",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on Continue button on Add Kids Page",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I am on Goalsetter List Kids page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I should see the Goalsetter icon on the top of the List Kids Page",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I should see You´ve added Benjamin on page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.iNavigateToPage()"
});
formatter.result({
  "duration": 11110234518,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.iAmOnCreateUsersPage()"
});
formatter.result({
  "duration": 24608947,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.iShouldSeeTheGoalsetterIconOnTheTopOfThePage()"
});
formatter.result({
  "duration": 39631566,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MiguelG",
      "offset": 23
    }
  ],
  "location": "StepDef.iEnterTheFirstName(String)"
});
formatter.result({
  "duration": 131148539,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DiazO",
      "offset": 22
    }
  ],
  "location": "StepDef.iEnterTheLastName(String)"
});
formatter.result({
  "duration": 91684226,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Guillermooliva7@yopmail.com",
      "offset": 19
    }
  ],
  "location": "StepDef.iEnterTheEmail(String)"
});
formatter.result({
  "duration": 159089461,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "wgY6j55VR2AZAWf",
      "offset": 22
    }
  ],
  "location": "StepDef.iEnterThePassword(String)"
});
formatter.result({
  "duration": 117785934,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.iClickOnCreateYourFreeGoalsetterAccountButton()"
});
formatter.result({
  "duration": 14283166156,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.iAmOnGoalsetterAddKidsPage()"
});
formatter.result({
  "duration": 15107383,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.iShouldSeeTheGoalsetterIconOnTheTopOfTheAddKidsPage()"
});
formatter.result({
  "duration": 35406436,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Benjamin",
      "offset": 24
    }
  ],
  "location": "StepDef.iEnterTheKidSName(String)"
});
formatter.result({
  "duration": 119295193,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.iClickOnTheStorkIsOnTheWay()"
});
formatter.result({
  "duration": 66618463,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.iClickOnContinueButtonOnPage()"
});
formatter.result({
  "duration": 941817574,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.iAmOnGoalsetterListKidsPage()"
});
formatter.result({
  "duration": 24529871,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.iShouldSeeTheGoalsetterIconOnTheTopOfTheListKidsPage()"
});
formatter.result({
  "duration": 53121601,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.iShouldSeeYouVeAddedBenjaminOnPage()"
});
formatter.result({
  "duration": 36246684,
  "status": "passed"
});
formatter.after({
  "duration": 1037050521,
  "status": "passed"
});
});