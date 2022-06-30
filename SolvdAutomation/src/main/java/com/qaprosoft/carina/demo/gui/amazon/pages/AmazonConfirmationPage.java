package com.qaprosoft.carina.demo.gui.amazon.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonConfirmationPage extends AmazonAbstractPage {

    @FindBy(xpath = "//span[contains(text(),'Solve this puzzle to protect your account')]")
    private ExtendedWebElement guide;


    public AmazonConfirmationPage(WebDriver driver) {
        super(driver);
    }

    public boolean isGuidePresent() {
        return guide.isElementPresent();
    }
}
