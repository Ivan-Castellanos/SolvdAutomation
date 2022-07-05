package com.qaprosoft.carina.demo.gui.amazon.pages;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.amazon.components.AmazonProduct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AmazonResultPage extends AmazonAbstractPage {

    @FindBy(css = "div[class~='widgetId=search-results_1'] h2 span")
    public ExtendedWebElement firstSearchResult;
    @FindBy(css = "[data-testid = 'deal-card']")
    private List<AmazonProduct> products;

    public AmazonResultPage(WebDriver driver) {
        super(driver);
    }

    public int countProducts() {
        return products.size();
    }

    public boolean isSearchedWordPresent() {
        return firstSearchResult.isElementWithTextPresent(R.TESTDATA.get("search"));
    }
}
