Feature: contact us feature

  @wip @ui
  Scenario: user should be able to fill out the CONTACT US form
    Given user click on CONTACT US module
    When user click on email link
    And user enters url "test.com"
    And user enters a  message "test message"
    And user enters First Name "Hans"
    And user enters Last Name "Zaimer"
    And user enters valid Email Address "hanszaimer@gmail.com"
    And user enters valid Phone Number "111-222-4455"
    And user clicks reCAPTCHA
    And user click send
    Then user should see confirmation message


