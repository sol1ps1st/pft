Feature: YandexSearch
  Scenario: Search
    Given yandex site
    When I search with text пылесосы
    Then I have search's results