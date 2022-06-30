package com.qaprosoft.carina.demo.gui.amazon.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonCustomerServicePage extends AmazonAbstractPage {
    @FindBy(xpath = "//*[text() = 'Welcome to Amazon Customer Service']")
    private ExtendedWebElement amazonCustomerServicePageTitle;

    public AmazonCustomerServicePage(WebDriver driver) {
        super(driver);
    }

    public boolean isCustomerServicePageTitlePresent() {
        return amazonCustomerServicePageTitle.isElementPresent();
    }
}
