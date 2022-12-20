Feature: Computer Test
  As a use I want to go on computer page

  @smoke
  @regression
  Scenario:Verify user should navigate to computer page successfully
    Given I am on homepage
    When I click on Computer Tab
    Then I Verify Computer text

  @sanity
  @regression
  Scenario: Verify user should navigate to Desktops page successfully
    Given I am on homepage
    When I click on Computer Tab
    And I Click on Desktops link
    And I verify Desktops text
