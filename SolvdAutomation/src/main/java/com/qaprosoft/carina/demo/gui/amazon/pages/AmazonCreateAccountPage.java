package com.qaprosoft.carina.demo.gui.amazon.pages;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonCreateAccountPage extends AmazonAbstractPage {
    @FindBy(xpath = "//h1[contains(text(),'Create account')]")
    private ExtendedWebElement createAccountTitle;

    @FindBy(css = "#ap_customer_name")
    private ExtendedWebElement nameInput;

    @FindBy(xpath = "//*[@id='ap_email']")
    private ExtendedWebElement emailInput;

    @FindBy(name = "password")
    private ExtendedWebElement passwordInput;

    @FindBy(name = "passwordCheck")
    private ExtendedWebElement passwordConfirmationInput;

    @FindBy(id = "continue")
    private ExtendedWebElement submitButton;

    @FindBy(className = "a-alert-content")
    private ExtendedWebElement passwordNotMatchingError;


    public AmazonCreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean isCreateAccountTitlePresent() {
        return createAccountTitle.isElementPresent();
    }

    public void typeName() {
        nameInput.type(R.TESTDATA.get("name"));
    }

    public void typeEmail() {
        emailInput.type(R.TESTDATA.get("email"));
    }

    public void typePasswordCorrect() {
        passwordInput.type(R.TESTDATA.get("password"));
        passwordConfirmationInput.type(R.TESTDATA.get(("password")));
    }

    public void typePasswordIncorrect() {
        passwordInput.type(R.TESTDATA.get("password"));
        passwordConfirmationInput.type("");
    }

    public AmazonConfirmationPage correctSignUp() {
        typeName();
        typeEmail();
        typePasswordCorrect();
        submitButton.click();
        return new AmazonConfirmationPage(driver);
    }

    public boolean failedSignUp() {
        typeName();
        typeEmail();
        typePasswordIncorrect();
        return passwordNotMatchingError.isElementNotPresent(1);
    }
}
