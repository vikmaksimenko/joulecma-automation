package com.sample.steps;

import com.codeborne.selenide.Condition.*;
import cucumber.api.java.en.Given;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class CommonSteps {
    @Given("I search by {string}")
    public void searchBy(String query) {
        $("#edit-keys").sendKeys(query);
        $("#edit-keys").sendKeys(Keys.ENTER);

        $(".page-title").waitUntil(visible, 20 * 1000);
        $(".page-title").shouldHave(text("Search for " + query));
    }

    @Given("I click \"Login\" button")
    public void clickLoginButton() {
        $("#edit-openid-connect-client-generic-login").shouldBe(visible);
        $("#edit-openid-connect-client-generic-login").click();
    }
}
