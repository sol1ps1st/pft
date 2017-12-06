Feature: YandexSearch
  Scenario Outline: Search
    Given yandex site
    When I search with text <text>
    Then I have search's results
    Examples:
    |text |
    |kzkk1|
    |sdfff|
    |много|