Feature:As a test player, I should be able to play games free
  Scenario:As a test player, I should be able to play games free
    Given I am on GameDuell website
    When I want to play for free
    And I log in as a registered user
    Then I should be on "Welcome" page
    And I should see emailValidation link
    When I navigate to "My GameDuell"
    Then I should be on "My GameDuell" page
    And account balance should be same in overview and account