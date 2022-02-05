Feature: widgets

  Scenario: verify black message
    Given The user tools page and click to demo site
    When The user navigate to "Widgets"
    And  The user click to "Tool Tips"
    And the user navigate to hoverButton and verify "You hovered over the Button"
    Then the user navigate to hoverInput and verify "You hovered over the text field"

  Scenario: Select Menu
    Given The user tools page and click to demo site
    When The user navigate to "Widgets"
    And  The user click to "Select Menu"
    And the user chooses "Group 1, option 2"
    And the user select One chooses "Mrs."
    And user verifies the following list
      | Red     |
      | Blue    |
      | Green   |
      | Yellow  |
      | Purple  |
      | Black   |
      | White   |
      | Voilet  |
      | Indigo  |
      | Magenta |
      | Aqua    |

  Scenario: Select Menu1
    Given The user tools page and click to demo site
    When The user navigate to "Widgets"
    And  The user click to "Select Menu"
    And the user select color "4"
    And the user multi select "Audi"