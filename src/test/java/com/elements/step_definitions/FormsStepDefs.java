package com.elements.step_definitions;

import com.elements.pages.FormsPage;
import com.elements.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FormsStepDefs {
    FormsPage formsPage=new FormsPage();

    @When("the user enter {string} and {string} and {string}")
    public void the_user_enter_and_and(String name, String lastName, String email) {
        formsPage.firstName.sendKeys(name);
        formsPage.lastName.sendKeys(lastName);
        formsPage.email.sendKeys(email);

    }

    @When("the user radio button famela click")
    public void the_user_radio_button_famela_click() {
      // formsPage.genderRadio.click();
        BrowserUtils.clickWithJS(formsPage.genderRadio);
    }

    @When("the user enter {string} and enter dateBird")
    public void the_user_enter_and_enter_dateBird(String number) {
        formsPage.mobilNumber.sendKeys(number);
        formsPage.dateBirth.click();
        formsPage.dateDay.click();

    }

    @When("the user enter\"C:\\Users\\ayse1\\Desktop\" and currend address\"Kayseri\"")
    public void the_user_enter_C_Users_ayse1_Desktop_and_currend_address_Kayseri() {
       formsPage.upload.click();
    }

    @Then("the user select sity and click submit")
    public void the_user_select_sity_and_click_submit() {
       formsPage.sity.click();
       formsPage.submit.click();

    }


    @And("the user enter subject{string} and check box click")
    public void theUserEnterSubjectAndCheckBoxClick(String subje) {
        formsPage.subject.sendKeys(subje);
       // formsPage.subject.click();
        formsPage.getSubject.click();
        formsPage.clickToCheckBox();
    }

    @And("the user enter {string} and current address {string}")
    public void theUserEnterAndCurrentAddress(String path, String cty) {
        path="C:\\Users\\ayse1\\Desktop";

        formsPage.upload.sendKeys(path);



    }
}
