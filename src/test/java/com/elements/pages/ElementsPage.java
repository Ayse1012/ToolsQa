package com.elements.pages;

import com.elements.utilities.BrowserUtils;
import com.elements.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ElementsPage extends BasePage{

    @FindBy(xpath = "(//h5)[6]")
    public WebElement elements;

    @FindBy(xpath = "//div[text()='Elements']//span")
    public WebElement elements1Menu;  //**

    @FindBy(xpath = "//span[text()='Text Box']")
    public WebElement elements2Menu;  //**

    @FindBy(css = "#userName")
    public WebElement fullName;
    @FindBy(css = "#userEmail")
    public WebElement email;
    @FindBy(css = "#currentAddress")
    public WebElement currentAddress;
    @FindBy(css = "#permanentAddress")
    public WebElement permanentAddress;
    @FindBy(css = "#submit")
    public WebElement submit;
    @FindBy(css = "#name")
    public WebElement textName;

    @FindBy(css = ".rct-option.rct-option-expand-all>svg")
    public WebElement plus;
    @FindBy(xpath = "(//span[@class='rct-checkbox'])[2]")
    public WebElement checkBox;
    @FindBy(css = "#result")
    public WebElement textResault;

    @FindBy(xpath = "//div[@class='rt-th rt-resizable-header -cursor-pointer']")
    public List<WebElement> teblesTitle;
    @FindBy(css = "#searchBox")
    public WebElement searchInput;
    @FindBy(xpath = "//div[@class='rt-tr-group'][1]//div[7]//span[1]")
    public WebElement editButton;
    @FindBy(xpath = "//div[@class='mt-2 row'][5]//div[2]//input")
    public WebElement salaryInput;
    @FindBy(css = "#submit")
    public WebElement editSubmit;
    @FindBy(xpath = "//div[@class='rt-tr-group'][1]//div[5]")
    public WebElement salaryText;

    @FindBy(linkText = "Home")
    public WebElement link;


    public void navigateElementsMenu(String menu){
        WebElement element= Driver.get().findElement(By.xpath("//span[text()='"+menu+"']"));
        BrowserUtils.clickWithJS(element);
      //  element.click();
    }

    public void navigateElements(String menu){
        WebElement menuElement=Driver.get().findElement(By.xpath("//div[text()='"+menu+"']//span"));
        menuElement.click();
    }

    public void loginIn(String fulName,String Email,String currAddres,String permAddres){
        fullName.sendKeys(fulName);
        email.sendKeys(Email);
        currentAddress.sendKeys(currAddres);
        permanentAddress.sendKeys(permAddres);
       BrowserUtils.clickWithJS(submit);

    }
}
