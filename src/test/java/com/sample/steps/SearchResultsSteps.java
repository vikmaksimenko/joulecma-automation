package com.sample.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertTrue;

public class SearchResultsSteps {
    @When("I should see results")
    public void shouldSeeResults() {
        $$(".search-results li").shouldHave(sizeGreaterThan(0));
    }

    @And("I can open first search result")
    public void push() {
        String pageTitle = $$(".search-results li").first().$("a").getText();
        $$(".search-results li").first().$("a").click();
        $("h1.page-title").$x("//span[text()='" + pageTitle + "']").waitUntil(visible, 20 * 1000);
    }

    @Then("I should find {string} on page")
    public void shouldFndOnPage(String query) {
        assertTrue($("div.node__content").innerHtml().contains(query));
    }

    @Then("I should see message {string}")
    public void messageShouldBeDisplayed(String message) {
        $x("//h3[text()='" + message + "']").shouldBe(visible);
    }
}
