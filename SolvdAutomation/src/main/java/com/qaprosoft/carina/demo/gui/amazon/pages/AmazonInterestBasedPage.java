package com.qaprosoft.carina.demo.gui.amazon.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonInterestBasedPage extends AmazonGeneralPage{
    @FindBy(xpath = "//*[text() = 'Interest-Based Ads']")
    private ExtendedWebElement interestBasedTitle;

    public AmazonInterestBasedPage(WebDriver driver) {
        super(driver);
    }

    public boolean isConditionsOfUseTitlePresent() {
        return interestBasedTitle.isElementPresent();
    }
}
