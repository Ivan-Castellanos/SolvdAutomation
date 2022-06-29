package com.qaprosoft.carina.demo.gui.amazon.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.amazon.pages.AmazonConditionOfUsePage;
import com.qaprosoft.carina.demo.gui.amazon.pages.AmazonGeneralPage;
import com.qaprosoft.carina.demo.gui.amazon.pages.AmazonInterestBasedPage;
import com.qaprosoft.carina.demo.gui.amazon.pages.AmazonPrivacyPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonFooter extends AbstractUIObject {
    @FindBy(className = "nav_first")
    private ExtendedWebElement conditionsOfUseLink;
    @FindBy(xpath = "//a[text()='Privacy Notice']")
    private ExtendedWebElement privacyLink;
    @FindBy(className = "nav-last")
    private ExtendedWebElement interestBasedLink;



    public AmazonFooter(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public AmazonConditionOfUsePage clickConditionsOfUseLink() {
        conditionsOfUseLink.click();
        return new AmazonConditionOfUsePage(driver);
    }

    public AmazonPrivacyPage clickPrivacyLink(){
        privacyLink.click();
        return new AmazonPrivacyPage(driver);
    }

    public AmazonInterestBasedPage clickInterestLink(){
        interestBasedLink.click();
        return new AmazonInterestBasedPage(driver);
    }
}
