Feature: Alerts,Frame

  @alert
  Scenario: Alerts
    Given The user tools page and click to demo site
    When The user navigate to "Alerts, Frame & Windows"
    And  The user click to "Alerts"
    And user sees warning button and passes
    And the user sees the verifies "Do you confirm action?" and passes and
    Then The user enter "Ayşe" and verify "You entered Ayşe"

  Scenario: Frames
    Given The user tools page and click to demo site
    When The user navigate to "Alerts, Frame & Windows"
    And  The user click to "Frames"
    Then user verify with frame"This is a sample page"
