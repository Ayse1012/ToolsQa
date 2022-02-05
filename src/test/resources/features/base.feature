Feature:menu

  @vp
  Scenario:Navigate menu
     Given The user tools page and click to demo site
      When The user verify url "https://demoqa.com/"
       And The user see following options
       |Elements|
       |Forms|
       |Alerts, Frame & Windows|
       |Widgets|
       |Interactions|
       |Book Store Application|
    Then The user navigate to "Forms"
