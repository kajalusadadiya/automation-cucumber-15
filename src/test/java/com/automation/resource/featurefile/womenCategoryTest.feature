Feature: Test women category page

  @Smoke
  Scenario: Verify that user should successfully navigate to women category page
    Given User is on homepage
    When User click on women tab
    Then User should successfully navigate to women category page and verify <"WOMEN">

  @Sanity @Regression
  Scenario Outline: Verify that user add product to cart successfully
    Given User is on homepage
    When User click on women tab
    Then User should successfully navigate to women category page and verify <"WOMEN">
    And User click on the product "<product>"
    And User change quantity "<qty>"
    And User select size "<size>"
    And User select colour "<colour>"
    And User click on Add To Cart Button
    Then Verify the message <"Product successfully added to your shopping cart">
    And Click on X button and close the popup
    Examples:
      | product               | qty | size | colour |
      | Blouse                | 2   | M    | White  |
      | Printed Dress         | 3   | L    | Orange |
      | Printed Chiffon Dress | 4   | S    | Green  |
      | Printed Summer Dress  | 2   | S    | Blue   |