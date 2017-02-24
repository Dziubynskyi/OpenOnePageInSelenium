package ru.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.testing.pages.SoftwareTestingPage;

/**
 * Created by Comp on 2/24/2017.
 */
public class TestLocalhost extends TestNgTestBase {
    String website = "http://localhost/litecart/admin/login.php";
    @FindBy(xpath = ".//*[@id='sidebar']/div[1]/a/img")
    WebElement LiteCard;


    @BeforeMethod
    public void initPageObjects() {
        PageFactory.initElements(driver, SoftwareTestingPage.class);
    }

    @Test
    public void LoginLocalHost() {
        driver.get(website);
        driver.findElement(By.xpath(".//*[@id='box-login']/form/div[1]/table/tbody/tr[1]/td[2]/span/input")).sendKeys("admin");
        driver.findElement(By.xpath(".//*[@id='box-login']/form/div[1]/table/tbody/tr[2]/td[2]/span/input")).sendKeys("admin");
        driver.findElement(By.xpath(".//*[@id='box-login']/form/div[2]/button")).click();
        verifyElementIsPresent(LiteCard);
        driver.quit();

    }

    public boolean verifyElementIsPresent(WebElement element) {
        try {
            element.getTagName();
            return true;
        } catch (NoSuchElementException e) {
            //  Log.info("---------------------------------");
            //  Log.info("element " + element + " can not be found by  element.getTagName()");
            //   Log.info("---------------------------------");
            return false;
        }
    }
}





