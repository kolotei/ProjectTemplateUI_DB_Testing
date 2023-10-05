package com.templateProject.steps;

import com.templateProject.pages.FirstPage;
import com.templateProject.utility.BrowserUtil;
import com.templateProject.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Wait;

public class UserStepDefs {

    FirstPage  firstPage= new FirstPage();
    @Given("user click on CONTACT US module")
    public void user_click_on_contact_us_module() {
        BrowserUtil.waitFor(3);
        firstPage.contactUs.click();
    }
    @When("user click on email link")
    public void user_click_on_email_link() {
        firstPage.emailBtnƒ.click();
    }

    @When("user enters url {string}")
    public void user_enters_url(String url) {
        // Write code here that turns the phrase above into concrete actions
        firstPage.pageUrl.sendKeys(url);
    }

    @When("user enters a  message {string}")
    public void user_enters_a_message(String message) {
        // Write code here that turns the phrase above into concrete actions
        firstPage.yourMessage.sendKeys(message);
    }

    @When("user enters First Name {string}")
    public void user_enters_first_name(String firsName) {
        // Write code here that turns the phrase above into concrete actions
        firstPage.firstName.sendKeys(firsName);
    }

    @When("user enters Last Name {string}")
    public void user_enters_last_name(String lastName) {
        // Write code here that turns the phrase above into concrete actions
        firstPage.lastName.sendKeys(lastName);
    }

    @When("user enters valid Email Address {string}")
    public void user_enters_valid_email_address(String email) {
        // Write code here that turns the phrase above into concrete actions
        firstPage.email.sendKeys(email);
    }

    @When("user enters valid Phone Number {string}")
    public void user_enters_valid_phone_number(String phoneNumber) {
        // Write code here that turns the phrase above into concrete actions
        firstPage.phone.sendKeys(phoneNumber);
    }

    @When("user clicks reCAPTCHA")
    public void user_clicks_re_captcha() {
        Driver.getDriver().switchTo().frame(0);
        firstPage.checkBox.click();
        Driver.getDriver().switchTo().defaultContent();
        BrowserUtil.waitFor(3);
    }

    @When("user click send")
    public void user_click_send() {
        firstPage.sendBtn.click();
    }

    @Then("user should see confirmation message")
    public void user_should_see_confirmation_message() {

    }

}
