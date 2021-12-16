Feature: SIgn in page test

  @Smoke
  Scenario: User should navigate to sign-in page successfully
    Given User is on homepage
    When User click on sign-in link
    Then User verify sign-in page text <"AUTHENTICATION">

  @Smoke @Sanity
  Scenario Outline: User should get error message when login in with invalid credentials
    Given  User is on homepage
    When User click on sign-in link
    And User sign in with invalid username and password "<email>" "<password>"
    And User click on sign-in button
    Then User should see error message "<message>"
    Examples:
      | email          | password    | message                    |
      |                | password123 | An email address required. |
      | abcd@gmail.com |             | Password is required.      |
      | adfdfgfg       | password12  | Invalid email address.     |
      | abcd@gmail.com | pass123     | Authentication failed.     |

  @Sanity @Regression
  Scenario: Verify that user should login successfully with valid credentials
    Given User is on homepage
    When User click on sign-in link
    And User verify sign-in page text <"AUTHENTICATION">
    And User enter valid email and password <"georgesmith@gmail.com"> and <"acd1234">
    And User click on sign-in button
    Then User should login successfully and see 'sign-out' button

  @Regression
  Scenario: Verify that user should logout successfully
    Given User is on homepage
    When User click on sign-in link
    And User verify sign-in page text <"AUTHENTICATION">
    And User enter valid email and password <"georgesmith@gmail.com"> and <"acd1234">
    And User click on sign-in button
    And User should login successfully and see 'sign-out' button
    And User should click on sign-out button
    Then User should signout successfully and see 'sign-in' button