package ru.testing.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Comp on 2/23/2017.
 */
public class SoftwareTestingPage extends Page {

    @FindBy(xpath = ".//*[@id='portal-nav-portal']/a")
    public WebElement PortalButton;




    public SoftwareTestingPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void GoToPortal(){
        clickElement(PortalButton);
    }
}