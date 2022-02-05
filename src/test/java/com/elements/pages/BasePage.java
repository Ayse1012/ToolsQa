package com.elements.pages;

import com.elements.utilities.BrowserUtils;
import com.elements.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract   class BasePage {
    public BasePage() {

        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath = "//h5[text()='Elements']")
    public WebElement anaMenu;

    @FindBy(xpath = "//div[@class='card mt-4 top-card']")
    public List<WebElement> menuList;

    @FindBy(css = ".cbb.pea>svg")
    public WebElement reklam;

    public  void navigateBaseMenu(String menu){
      WebElement element=Driver.get().findElement(By.xpath("//h5[text()='"+menu+"']"));

      BrowserUtils.clickWithJS(element);

    }


}
