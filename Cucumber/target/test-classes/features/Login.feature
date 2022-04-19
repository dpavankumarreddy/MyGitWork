
Feature: Application Login

Scenario: Home page default login
    Given user is on Netbanking landing page
    When user login into application with username and password
    Then Home page is populated
    And cards are displaued

  

    
