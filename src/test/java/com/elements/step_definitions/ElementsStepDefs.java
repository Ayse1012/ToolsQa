package com.elements.step_definitions;

import com.elements.pages.ElementsPage;
import com.elements.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class ElementsStepDefs {
    ElementsPage elementsPage=new ElementsPage();

    @When("The user click to {string}")
    public void the_user_click_to(String menu2) {
        BrowserUtils.waitFor(2);
        elementsPage.navigateElementsMenu(menu2);

    }

    @Then("The user enter {string} and {string} and {string} and {string}")
    public void the_user_enter_and_and_and(String fulName, String Email, String curAddr, String perAddr) {

        elementsPage.loginIn(fulName,Email, curAddr,perAddr);
    }

    @Then("the user verify {string}")
    public void the_user_verify(String expectedText) {

        BrowserUtils.waitFor(2);
        Assert.assertEquals(expectedText,elementsPage.textName.getText());

    }


    @Then("The user desktop is selected")
    public void theUserDesktopIsSelected() {
        elementsPage.plus.click();
        elementsPage.checkBox.click();

    }

    @And("The user verify {string}")
    public void theUserVerify(String expectedText) {
        Assert.assertFalse(elementsPage.textResault.getText().contains(expectedText));
    }

    @And("user verify that desktop is selected")
    public void userVerifyThatDesktopIsSelected() {
        Assert.assertTrue(elementsPage.checkBox.isEnabled());
    }

    @And("user searches for {string} and click edit")
    public void userSearchesForAndClickEdit(String name) {
        elementsPage.searchInput.sendKeys(name);
        BrowserUtils.waitFor(2);
        elementsPage.editButton.click();
    }

    @And("user salary updates {string}")
    public void userSalaryUpdates(String salary) {
        elementsPage.salaryInput.clear();
        elementsPage.salaryInput.sendKeys(salary);
        elementsPage.editSubmit.click();

        int salry=Integer.parseInt(elementsPage.salaryText.getText());
        System.out.println("salry = " + salry);



    }

    @Then("The user see following Titles")
    public void theUserSeeFollowingTitles(List<String> expectedTitle) {
        List<String> actualTitle=BrowserUtils.getElementsText(elementsPage.teblesTitle);
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Then("The user click to link {string}")
    public void theUserClickToLink(String linkText) {
        elementsPage.link.click();
        BrowserUtils.waitFor(2);
    }
}
