package com.qaprosoft.carina.demo.gui.amazon.pages;

import org.openqa.selenium.WebDriver;

public class AmazonHomePage extends AmazonAbstractPage {

    public AmazonHomePage(WebDriver driver) {
        super(driver);
        setPageURL("");
    }

    public AmazonConditionOfUsePage goToConditionOfUsePage() {
        return footer.clickConditionsOfUseLink();
    }

    public AmazonPrivacyPage goToPrivacyPage() {
        return footer.clickPrivacyLink();
    }

    public AmazonInterestBasedPage goToInterestPage() {
        return footer.clickInterestLink();
    }

    public AmazonCartPage goToCartWithoutRegister() {
        return navBar.clickCartButton();
    }

    public AmazonTodayDealsPage goToTodayDeals() {
        return navBar.clickTodayDealsButton();
    }

    public AmazonCustomerServicePage goToCustomerService() {
        return navBar.clickAmazonCustomerServicePage();
    }

    public AmazonResultPage searchStoredWord() {
        return navBar.search();
    }
}
