$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("bdd/yandex.feature");
formatter.feature({
  "name": "YandexSearch",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Search",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "yandex site",
  "keyword": "Given "
});
formatter.step({
  "name": "I search with text \u003ctext\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I have search\u0027s results",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "text"
      ]
    },
    {
      "cells": [
        "kzkk1"
      ]
    },
    {
      "cells": [
        "sdfff"
      ]
    },
    {
      "cells": [
        "много"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "yandex site",
  "keyword": "Given "
});
formatter.match({
  "location": "YandexSearchStepDefinitions.openYandex()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search with text kzkk1",
  "keyword": "When "
});
formatter.match({
  "location": "YandexSearchStepDefinitions.search(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have search\u0027s results",
  "keyword": "Then "
});
formatter.match({
  "location": "YandexSearchStepDefinitions.isResultExists()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "yandex site",
  "keyword": "Given "
});
formatter.match({
  "location": "YandexSearchStepDefinitions.openYandex()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search with text sdfff",
  "keyword": "When "
});
formatter.match({
  "location": "YandexSearchStepDefinitions.search(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have search\u0027s results",
  "keyword": "Then "
});
formatter.match({
  "location": "YandexSearchStepDefinitions.isResultExists()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "yandex site",
  "keyword": "Given "
});
formatter.match({
  "location": "YandexSearchStepDefinitions.openYandex()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search with text много",
  "keyword": "When "
});
formatter.match({
  "location": "YandexSearchStepDefinitions.search(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have search\u0027s results",
  "keyword": "Then "
});
formatter.match({
  "location": "YandexSearchStepDefinitions.isResultExists()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});