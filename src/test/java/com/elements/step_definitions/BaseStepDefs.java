package com.elements.step_definitions;

import com.elements.pages.ElementsPage;
import com.elements.utilities.BrowserUtils;
import com.elements.utilities.ConfigurationReader;
import com.elements.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BaseStepDefs {

    ElementsPage elementsPage=new ElementsPage();

    @Given("The user tools page and click to demo site")
    public void the_user_tools_page_and_click_to_demo_site() {
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitFor(2);
    }

    @When("The user verify url {string}")
    public void the_user_verify_url(String expectedUrl) {
      String actualUrl=Driver.get().getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);
        Assert.assertEquals(expectedUrl,actualUrl);

    }
    @When("The user see following options")
    public void the_user_see_following_options(List<String> expectedList) {

      //  List<WebElement> book = Driver.get().findElements(By.xpath("//h5"));

       // BrowserUtils.waitFor(2);
       // BrowserUtils.clickWithJS(elementsPage.elements);

        List<String> actualList= BrowserUtils.getElementsText(elementsPage.menuList);
        System.out.println("actualList = " + actualList);
        Assert.assertEquals(expectedList,actualList);

    }

    @Then("The user navigate to {string}")
    public void the_user_navigate_to(String menu) {

      //  BrowserUtils.clickWithJS(elementsPage.elements);
        elementsPage.navigateBaseMenu(menu);

    }

}
