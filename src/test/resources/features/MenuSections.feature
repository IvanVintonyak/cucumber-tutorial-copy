Feature: As a user i want to get ability to use menu sections.

  @smoke
  Scenario Outline: Docs sections should contain appropriate columns.
    Given the user opens Cucumber website.
    When the user clicks on the "Docs" section.
    And the user clicks on the "<title>" icon.
    Then page with title "<titleTitle>" is displayed.
    Examples:
      | title           | titleTitle     |
      | Installation    | Installation   |
      | API Docs        | API Automation |
      | Gherkin Syntax  | Gherkin Syntax |
      | 3rd Party Tools | Related tools  |