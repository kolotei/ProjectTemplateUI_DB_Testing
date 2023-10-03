Feature: contact us feature

  @wip @ui
  Scenario: user should be able to fill out the CONTACT US form
    Given user click on CONTACT US module
    When user click on email link
    And user enters "url"
    And user enters a "message"
    And user enters "First Name"
    And user enters "Last Name"
    And user enters valid "Email Address"
    And user enters valid "Phone Number"
    And user clicks reCAPTCHA
    And user click send
    Then user should see confirmation message


