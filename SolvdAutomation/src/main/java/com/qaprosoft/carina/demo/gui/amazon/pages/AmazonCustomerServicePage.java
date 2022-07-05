package com.qaprosoft.carina.demo.gui.amazon.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.amazon.components.AmazonMissingPackageVideo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonCustomerServicePage extends AmazonAbstractPage {
    @FindBy(xpath = "//*[text() = 'Recommended Topics']")
    public ExtendedWebElement recommendedTopicButton;
    @FindBy(xpath = "//div[text()='About Prime Day']")
    public ExtendedWebElement missingPacketButton;
    @FindBy(xpath = "//*[text() = 'Welcome to Amazon Customer Service']")
    private ExtendedWebElement amazonCustomerServicePageTitle;

    private AmazonMissingPackageVideo missingPackageVideo;

    public AmazonCustomerServicePage(WebDriver driver) {
        super(driver);
    }

    public boolean isCustomerServicePageTitlePresent() {
        return amazonCustomerServicePageTitle.isElementPresent();
    }

    public void clickMissingPacketButton() {
        recommendedTopicButton.click();
        missingPacketButton.click();
    }

    public boolean isTheVideoVisible(){
        return (missingPackageVideo.isUIObjectPresent(5)); //the video appears sometimes 2 or 3 second after the page is fully charged.
    }
}
