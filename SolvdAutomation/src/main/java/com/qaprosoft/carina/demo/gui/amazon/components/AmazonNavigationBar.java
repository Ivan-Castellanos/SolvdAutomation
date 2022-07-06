package com.qaprosoft.carina.demo.gui.amazon.components;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.amazon.pages.AmazonCartPage;
import com.qaprosoft.carina.demo.gui.amazon.pages.AmazonCustomerServicePage;
import com.qaprosoft.carina.demo.gui.amazon.pages.AmazonResultPage;
import com.qaprosoft.carina.demo.gui.amazon.pages.AmazonTodayDealsPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonNavigationBar extends AbstractUIObject {

    @FindBy(id = "nav-cart")
    private ExtendedWebElement cartButton;

    @FindBy(xpath = ".//a[contains(text(),\"Today's Deals\")]")
    private ExtendedWebElement todaysDealsButton;

    @FindBy(xpath = ".//a[contains(text(),\"Customer Service\")]")
    private ExtendedWebElement customerServiceButton;

    @FindBy(xpath = ".//a[contains(text(),\"Registry\")]")
    private ExtendedWebElement registryButton;

    @FindBy(id = "twotabsearchtextbox")
    private ExtendedWebElement searchBar;

    public AmazonNavigationBar(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public AmazonCartPage clickCartButton() {
        cartButton.click();
        return new AmazonCartPage(driver);
    }

    public AmazonTodayDealsPage clickTodayDealsButton() {
        todaysDealsButton.click();
        return new AmazonTodayDealsPage(driver);
    }

    public AmazonCustomerServicePage clickAmazonCustomerServicePage() {
        customerServiceButton.click();
        return new AmazonCustomerServicePage(driver);
    }

    public AmazonResultPage search() {
        searchBar.type(R.TESTDATA.get("search"));
        searchBar.sendKeys(Keys.ENTER);
        return new AmazonResultPage(driver);
    }
}
