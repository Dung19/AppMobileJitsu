@ANDROID
Feature:Check Ui App Mobie

  @app
  Scenario:Check Ui App Mobie
    Given user opens jitsu app
    When user login with username:"auto_244332" and password:"Testing1!"
    And user click on tab profile
    And user click on button tutorials
    And user check screen tutorial display
    And user click on button assigned route
#    And user click button start tutorial
    And user check button quit tutorial display