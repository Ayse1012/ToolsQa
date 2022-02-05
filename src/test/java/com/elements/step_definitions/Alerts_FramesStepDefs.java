package com.elements.step_definitions;

import com.elements.pages.Alerts_FramesPage;
import com.elements.utilities.BrowserUtils;
import com.elements.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class Alerts_FramesStepDefs {

    Alerts_FramesPage alerts_framesPage=new Alerts_FramesPage();
    Alert alert;
   // Alert alert= Driver.get().switchTo().alert();

    @When("user sees warning button and passes")
    public void user_sees_warning_button_and_passes() {
        BrowserUtils.clickWithJS(alerts_framesPage.okButton);
        BrowserUtils.waitFor(4) ;
        alert= Driver.get().switchTo().alert();
        BrowserUtils.waitFor(1);
        alert.accept();
    }

    @Then("The user enter {string} and verify {string}")
    public void the_user_enter_and_verify(String name, String expectedMesaj) {
        alerts_framesPage.promtButton.click();
        alert.sendKeys(name);
        alert.accept();
        String actualMesaj=alerts_framesPage.prompResult.getText();
        Assert.assertEquals(expectedMesaj,actualMesaj);
    }

    @And("the user sees the verifies {string} and passes and")
    public void theUserSeesTheVerifiesAndPassesAnd(String expectedMesaj) {
        alerts_framesPage.confirmButton.click();
        String actualMesaj=alert.getText();
        alert.dismiss();
        System.out.println("actualMesaj = " + actualMesaj);
        Assert.assertEquals(expectedMesaj,actualMesaj);
    }

    @Then("user verify with frame{string}")
    public void userVerifyWithFrame(String expectedmessage) {
        Driver.get().switchTo().frame("frame1");
        String actualmessage=alerts_framesPage.frameMessage.getText();
        System.out.println("actualmessage = " + actualmessage);

        Assert.assertEquals(expectedmessage,actualmessage);

    }
}
