$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SkyBlueBackground.feature");
formatter.feature({
  "line": 1,
  "name": "User should be able to change dashboard page color",
  "description": "",
  "id": "user-should-be-able-to-change-dashboard-page-color",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3260521600,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "1",
  "description": "Sky Blue Background",
  "id": "user-should-be-able-to-change-dashboard-page-color;1",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Set SkyBlue Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on the button on \"Sky Blue\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "ColorsStepDefinition.set_SkyBlue_Background_button_exists()"
});
formatter.result({
  "duration": 174047700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sky Blue",
      "offset": 26
    }
  ],
  "location": "ColorsStepDefinition.i_click_on_the_button_on(String)"
});
formatter.result({
  "duration": 2081572500,
  "status": "passed"
});
formatter.match({
  "location": "ColorsStepDefinition.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 2049777300,
  "status": "passed"
});
formatter.after({
  "duration": 766536800,
  "status": "passed"
});
});