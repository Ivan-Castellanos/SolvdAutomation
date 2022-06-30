package com.qaprosoft.carina.demo.gui.amazon.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonCartPage extends AmazonAbstractPage {
    @FindBy(xpath = "//span[contains(text(),'Sign in to your account')]")
    private ExtendedWebElement signInButton;

    @FindBy(xpath = "//*[text() = '\nYour Amazon Cart is empty\n']")
    private ExtendedWebElement emptyCartText;

    public AmazonCartPage(WebDriver driver) {
        super(driver);
    }

    public AmazonSignInPage clickSignIn() {
        signInButton.click();
        return new AmazonSignInPage(driver);
    }

    public boolean isCartPageTitleCorrect() {
        return getTitle().equalsIgnoreCase("Amazon.com Shopping Cart");
    }

    public boolean isCartEmpty() {
        return emptyCartText.isElementPresent();
    }
}
