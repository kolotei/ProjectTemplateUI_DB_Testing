package com.templateProject.steps;

import com.templateProject.pages.FirstPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserStepDefs {

    FirstPage  firstPage= new FirstPage();
    @Given("user click on CONTACT US module")
    public void user_click_on_contact_us_module() {
    firstPage.contactUs.click();
    }
    @When("user click on email link")
    public void user_click_on_email_link() {
    firstPage.emailBtnƒ.click();
    }
    @When("user enters {string}")
    public void user_enters(String pageUrl) {
    firstPage.pageUrl.sendKeys("https://www.finra.org/member-firm-hub");
    }
    @When("user enters a {string}")
    public void user_enters_a(String string) {
    firstPage.firstName.sendKeys("Crazy");
    }
    @When("user enters valid {string}")
    public void user_enters_valid(String string) {
    firstPage.lastName.sendKeys("lucky");
    }
    @When("user clicks reCAPTCHA")
    public void user_clicks_re_captcha() {

    }
    @When("user click send")
    public void user_click_send() {

    }
    @Then("user should see confirmation message")
    public void user_should_see_confirmation_message() {

    }
}
