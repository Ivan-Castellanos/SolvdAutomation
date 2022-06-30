package com.qaprosoft.carina.demo.gui.amazon.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonConditionOfUsePage extends AmazonAbstractPage {
    @FindBy(xpath = "//h1[contains(text(),'Conditions of Use')]")
    private ExtendedWebElement conditionsOfUseTitle;

    public AmazonConditionOfUsePage(WebDriver driver) {
        super(driver);
    }

    public boolean isConditionsOfUseTitlePresent() {
        return conditionsOfUseTitle.isElementPresent();
    }
}
