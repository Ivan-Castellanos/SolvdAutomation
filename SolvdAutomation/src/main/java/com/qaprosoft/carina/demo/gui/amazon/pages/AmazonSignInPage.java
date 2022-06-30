package com.qaprosoft.carina.demo.gui.amazon.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonSignInPage extends AmazonAbstractPage {
    @FindBy(xpath = "//*[text() = '\nSign-In\n']")
    public WebElement signInText;
    @FindBy(id = "createAccountSubmit")
    private ExtendedWebElement signUpButton;

    public AmazonSignInPage(WebDriver driver) {
        super(driver);
    }

    public AmazonCreateAccountPage createAccount() {
        signUpButton.click();
        return new AmazonCreateAccountPage(driver);
    }

    public boolean isSignInTitleCorrect() {
        return signInText.isDisplayed();
    }
}
