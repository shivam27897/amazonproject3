Feature: Register

  @Register
  Scenario Outline: User should create new account
    Given I am on homepage
    When I click on sign in
    And I click on register
    And I enter name "<name>"
    And I enter email "<email>"
    And I enter password "<password>"
    And I enter confirm password "<confirmpassword>"
    Then I click on continue button
    Examples:
      | name   | email            | password | confirmpassword |
      | qwerty | fyfasy@gmail.com | tyui5678 | tyui5678        |