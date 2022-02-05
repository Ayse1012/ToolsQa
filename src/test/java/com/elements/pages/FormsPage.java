package com.elements.pages;

import com.elements.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormsPage extends BasePage {

    @FindBy(css = "#firstName")
    public WebElement firstName;
    @FindBy(css = "#lastName")
    public WebElement lastName;
    @FindBy(css = "#userEmail")
    public WebElement email;
    @FindBy(css = "#gender-radio-2")
    public WebElement genderRadio;
    @FindBy(css = "#userNumber")
    public WebElement mobilNumber;
    @FindBy(css = "#dateOfBirthInput")
    public WebElement dateBirth;
    @FindBy(xpath = "(//div[@class='react-datepicker__week'])[1]//div[1]")
    public WebElement dateDay;
    @FindBy(css= ".subjects-auto-complete__value-container.subjects-auto-complete__value-container--is-multi.css-1hwfws3")
    public WebElement subject;
    @FindBy(xpath = "//div[@id='subjectsContainer']/div/div[2]//span")
    public WebElement getSubject;
    @FindBy(css = "#hobbies-checkbox-3")
    public WebElement checkBox;
    @FindBy(css = "#uploadPicture")
    public WebElement upload;
    @FindBy(css = "#currentAddress")
    public WebElement address;
    @FindBy(xpath = "(//div[@class=' css-tlfecz-indicatorContainer'])[1]")
    public WebElement sity;
    @FindBy(css = "#submit")
    public WebElement submit;

    public void clickToCheckBox() {

        for (int i = 1; i <=3; i++) {
            WebElement element = Driver.get().findElement(By.cssSelector("#hobbies-checkbox-" +i+ ""));
            element.click();
        }

    }
}
