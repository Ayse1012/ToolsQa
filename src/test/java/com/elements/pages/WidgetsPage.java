package com.elements.pages;

import com.elements.utilities.BrowserUtils;
import com.elements.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class WidgetsPage extends BasePage{

    @FindBy(css = "#toolTipButton")
    public WebElement yellovButton;
    @FindBy(css = "#buttonToolTip")
    public WebElement blackMassage1;
    @FindBy(css = "#toolTipTextField")
    public WebElement hoverInput;
    @FindBy(css = ".fade.show.tooltip.bs-tooltip-bottom")
    public WebElement inputMessage2;

    @FindBy(xpath = "(//div[@class=' css-1wy0on6'])[1]")
    public WebElement selectValue;
    @FindBy(xpath = "//div[text()='Group 1, option 1']")
     public WebElement grup1;
    @FindBy(xpath = "(//div[@class=' css-1wy0on6'])[2]")
    public WebElement selectOne;
    @FindBy(xpath = "//div[text()='Group 1, option 1']")
    public WebElement mrs;
    @FindBy(css = "#oldSelectMenu")
    public WebElement selectColor;
    @FindBy(css = "#cars")
    public WebElement multiSelect;

    public void getSelectColor(String color){
        Select select=new Select(selectColor);
        System.out.println("select.getFirstSelectedOption()= " + select.getFirstSelectedOption().getText());
        select.selectByValue(color);

    }
    public void getSelectCars(String text){
        Select select=new Select(multiSelect);
        select.selectByVisibleText(text);
        System.out.println("select.getFirstSelectedOption()" + select.getFirstSelectedOption().getText());

    }


    public void getselectOptions(String number,String choice){
        WebElement element=Driver.get().findElement(By.xpath("(//div[@class=' css-1wy0on6'])["+number+"]"));
        WebElement selectChoice=Driver.get().findElement(By.xpath("//div[text()='"+choice+"']"));

        BrowserUtils.clickWithJS(element);
        BrowserUtils.clickWithJS(selectChoice);
       // element.click();
      //  selectChoice.click();
    }





}
