package com.qaprosoft.carina.demo.gui.amazon.pages;

import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.utils.R;
import org.openqa.selenium.WebDriver;

public class AmazonHomePage extends AmazonAbstractPage {

    public AmazonHomePage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(R.CONFIG.get(Configuration.Parameter.URL.getKey()));
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
}
