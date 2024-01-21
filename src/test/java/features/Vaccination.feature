Feature: Walgreen schedule vaccine feature

  @smoke
  Scenario: schedule vaccine
    When user clicks on Schedule vaccines box
    And user will see appointments
    When user click on date of birth box
    And user type in DOB '08022001'
    When user click on email box
    And user type in email 'arojitpronoy@gmail.com'
    When user click on phone box
    And user  type in phone '9175957072'
    And user click on checkbox
    When user click on next
    And user should able to see the next page
    When user click on Flu
    And user click on bluenext 
    Then user click on No Thanks
