package org.example.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.DocsPage;
import org.example.pages.HomePage;
import static org.assertj.core.api.Assertions.assertThat;
public class MenuSteps {

    private final HomePage homePage = new HomePage();
    public static DocsPage docsPage = new DocsPage();
    @When("the user opens Cucumber website.")
    public void openCucumberWebsite() {
        homePage.openCucumberWebsite();
    }

    @When("the user clicks on the {string} section.")
    public void clicksOnTheSection(String section) {
        homePage.menuSection(section).click();
    }

    @When("the user clicks on the {string} icon.")
    public void clicksOnTheIcon(String icon) {
        homePage.menuChildIcon(icon).click();
    }

    @Then("page with title {string} is displayed.")
    public void verifyPageTitleIsDisplayed(String pageTitle) {
        assertThat(docsPage.isPageWithTitleDisplayed(pageTitle))
                .overridingErrorMessage("Page with title '{}' is not displayed ", pageTitle)
                .isTrue();

    }
}
