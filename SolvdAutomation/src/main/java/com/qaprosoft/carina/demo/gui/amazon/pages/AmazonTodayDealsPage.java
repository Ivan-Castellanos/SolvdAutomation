package com.qaprosoft.carina.demo.gui.amazon.pages;

import com.qaprosoft.carina.demo.gui.amazon.components.AmazonProduct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AmazonTodayDealsPage extends AmazonAbstractPage {
    @FindBy(css = "[data-testid = 'deal-card']")
    private List<AmazonProduct> products;

    public AmazonTodayDealsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageTitleCorrect() {
        return getTitle().equalsIgnoreCase("Amazon.com - Today's Deals");
    }

    public int countProducts() {
        return products.size();
    }
}
