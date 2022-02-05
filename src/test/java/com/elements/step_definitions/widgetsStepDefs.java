package com.elements.step_definitions;

import com.elements.pages.WidgetsPage;
import com.elements.utilities.BrowserUtils;
import com.elements.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class widgetsStepDefs {
    WidgetsPage widgetsPage=new WidgetsPage();
    Actions actions=new Actions(Driver.get());

    @When("the user navigate to hoverButton and verify {string}")
    public void the_user_navigate_to_hoverButton_and_verify(String expectedMessage) {
        actions.moveToElement(widgetsPage.yellovButton).perform();
        BrowserUtils.waitFor(3);
        String actualMessage=widgetsPage.blackMassage1.getText();
        System.out.println("actualMessage = " + actualMessage);
        Assert.assertEquals(expectedMessage,actualMessage);

    }

    @Then("the user navigate to hoverInput and verify {string}")
    public void the_user_navigate_to_hoverInput_and_verify(String expectedMessage) {
       actions.moveToElement(widgetsPage.hoverInput).perform();
       BrowserUtils.waitFor(3);
       String actualMessage=widgetsPage.inputMessage2.getText();
        System.out.println("actualMessage = " + actualMessage);
        Assert.assertEquals(expectedMessage,actualMessage);

    }

    @And("the user chooses {string}")
    public void theUserChooses(String expectedTitle) {
        widgetsPage.selectValue.click();
       // widgetsPage.grup1.click();
        BrowserUtils.clickWithJS(widgetsPage.grup1);
        BrowserUtils.waitFor(2);
    }

    @And("the user chooses {string} and {string}")
    public void theUserChoosesAnd(String number, String choice) {
        widgetsPage.getselectOptions(number,choice);
    }

    @And("the user select One chooses {string}")
    public void theUserSelectOneChooses(String choice) {
        widgetsPage.selectOne.click();
        widgetsPage.mrs.click();
    }

    @And("user verifies the following list")
    public void userVerifiesTheFollowingList(List<String> expectedList) {
        Select select=new Select(widgetsPage.selectColor);

        List<WebElement> actualList=select.getOptions();
       // BrowserUtils.getElementsText(actualList); //aşağıdaki işlemi bu method yapıyor

        List<String> strActualList=new ArrayList<>();

        for (WebElement element : actualList) {
            System.out.println("element.getText() = " + element.getText());
             strActualList.add(element.getText());
        }
        Assert.assertEquals(expectedList,strActualList);
    }

    @And("the user multi select {string}")
    public void theUserMultiSelect(String expectedtext) {
        widgetsPage.getSelectCars(expectedtext);

    }

    @And("the user select color {string}")
    public void theUserSelectColor(String value) {
        widgetsPage.getSelectColor(value);
    }
}
