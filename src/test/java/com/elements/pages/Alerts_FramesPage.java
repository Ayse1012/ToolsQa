package com.elements.pages;

import com.elements.pages.BasePage;
import com.elements.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Alerts_FramesPage extends BasePage {


    @FindBy(xpath = "//span[text()='Alerts']")
    public WebElement alerts;
    @FindBy(xpath = "//Button[@id='alertButton']")
    public WebElement okButton;
    @FindBy(xpath = "//Button[@id='confirmButton']")
    public WebElement confirmButton;
    @FindBy(css = "#promtButton")
    public WebElement promtButton;
    @FindBy(css = "#promptResult")
    public WebElement prompResult;

    @FindBy(css = "frame1")
    public WebElement frame;
    @FindBy(css = "#sampleHeading")
    public WebElement frameMessage;


}
