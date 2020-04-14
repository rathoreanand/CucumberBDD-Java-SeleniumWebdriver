$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/angular.automation.practise.feature");
formatter.feature({
  "name": "Automation practise on Angular application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Enter details on Angular practise web app",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@angularPractise"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Angular practise home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.given.userIsOnAngularPractiseHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters his \"Name\", \"Email\", \"Password\", \"Gender\" and \"Date of Birth\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.when.userEntersHisAnd(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.and.userClicksOnSubmitButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see a Success message",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.then.userShouldSeeASuccessMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});