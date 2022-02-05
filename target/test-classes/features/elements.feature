Feature: Elements

  @element
  Scenario: text Box
    Given The user tools page and click to demo site
    When The user navigate to "Elements"
    And  The user click to "Text Box"
    Then The user enter "Ayse Akkoca" and "ayse@gmail.com" and "Kayseri" and "Adana"
    And the user verify "Name:Ayse Akkoca"

    @check
    Scenario: Check Box
      Given The user tools page and click to demo site
      When The user navigate to "Elements"
      And  The user click to "Check Box"
      Then  The user desktop is selected
      And  The user verify "desktop notes commands"
      And user verify that desktop is selected

  Scenario: Web Tables
    Given The user tools page and click to demo site
    When The user navigate to "Elements"
    And  The user click to "Web Tables"
    Then  The user see following Titles
    |First Name|
    |Last Name|
    |Age|
    |Email|
    |Salary|
    |Department|
    |Action|
    And user searches for "Cierra" and click edit
    And user salary updates "50000"

  Scenario: Links
    Given The user tools page and click to demo site
    When The user navigate to "Elements"
    And  The user click to "Links"
    Then The user click to link "Home"


