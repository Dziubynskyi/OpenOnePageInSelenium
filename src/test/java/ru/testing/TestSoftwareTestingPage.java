package ru.testing;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.testing.pages.SoftwareTestingPage;

/**
 * Created by Comp on 2/23/2017.
 */
public class TestSoftwareTestingPage extends TestNgTestBase {
    public SoftwareTestingPage softwareTestingPage;
    String website = "http://software-testing.ru/forum/index.php?/forum/129-selenium-functional-testing/";

    @BeforeMethod
    public void initPageObjects() {
        softwareTestingPage = PageFactory.initElements(driver, SoftwareTestingPage.class);
    }
    @Test
    public void PressButtonOnTestSoftwareTestingPage(){
        driver.get(website);
        softwareTestingPage.GoToPortal();
        driver.close();

    }

}
