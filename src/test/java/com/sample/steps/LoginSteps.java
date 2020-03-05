package com.sample.steps;

import cucumber.api.java.en.Then;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class LoginSteps {
    @Then("I should be on login page")
    public void searchBy() {
        $x("//button[text()='Log in']").shouldBe(visible);
    }
}
