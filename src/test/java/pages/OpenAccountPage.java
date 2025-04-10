package pages;

import helpMethods.ElementHelper;
import org.openqa.selenium.WebDriver;
import pageLocators.OpenAccountLocators;

public class OpenAccountPage {
    private WebDriver driver;
    private ElementHelper elementHelper;

    public OpenAccountPage(WebDriver driver){
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }
    public void selectCustomerName(String fullNameValue){
        elementHelper.selectLocator(OpenAccountLocators.customerNameElement, fullNameValue);
    }
}
