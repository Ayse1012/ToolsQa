Feature: Forms

  @forms
  Scenario:Enter Forms
    Given The user tools page and click to demo site
    When The user navigate to "Forms"
    And  The user click to "Practice Form"
    And the user enter "Ayşe" and "Akkoca" and "ayse@gmail.com"
    And  the user radio button famela click
    And the user enter "1234567890" and enter dateBird
    And the user enter subject"e" and check box click
    And the user enter "path" and current address "Kayseri"
    Then the user select sity and click submit