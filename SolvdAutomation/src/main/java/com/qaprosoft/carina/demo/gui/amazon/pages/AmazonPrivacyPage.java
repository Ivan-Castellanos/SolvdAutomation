package com.qaprosoft.carina.demo.gui.amazon.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonPrivacyPage extends AmazonGeneralPage {
    @FindBy(xpath = "//*[text() = 'Amazon.com Privacy Notice']")
    public ExtendedWebElement privacyTitle;

    public AmazonPrivacyPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPrivacyTitlePresent() {
        return privacyTitle.isElementPresent();
    }

}
