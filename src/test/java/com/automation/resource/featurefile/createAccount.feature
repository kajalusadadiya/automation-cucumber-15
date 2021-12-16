Feature: Create account test

  @Smoke
  Scenario: Verify that user should create account successfully
    Given User is on homepage
    When User click on sign-in link
    And User enter email for registration
    And User click on create account link
    And User fill personal information form <"George"> <"Smith"> <"Hello1234">
    And User fill address details <"1 Nice Building"> <"Maryland"> <"Ohio"> <"12345"> <"United States"> <"0123456789"> <"main home">
    And User click on register button
    Then User should create account successfully and get <"My account"> text