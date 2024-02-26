Feature: Case 2

  Scenario: It should be verified that the product added to the cart is free of charge shipping
    Given Visit the hepsiburada.com
    And I click the login button
    And Enter username and click login button
    And Enter password and click login button
    When I should see the my name on homepage
    And Search another product and click search button
    And I click two add to cart button
    And I click the basket button
    When I should see the cargo free message