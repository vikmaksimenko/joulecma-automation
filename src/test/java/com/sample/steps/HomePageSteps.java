package com.sample.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePageSteps {
    @When("I open home page")
    public void openHomePage() {
        open("/");
        $("#block-octhemebs4-branding").shouldBe(visible);
    }

    @And("push \"Retrieve password\"")
    public void push() {
        $("button#form_submit").click();
    }


    @Then("message {string} should be displayed")
    public void messageShouldBeDisplayed(String message) {
        $("#content").shouldHave(text(message));
    }
}
