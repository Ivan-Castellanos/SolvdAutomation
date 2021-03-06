package com.qaprosoft.carina.demo.gui.amazon.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonProduct extends AbstractUIObject {
    @FindBy(id = ".a-image-container img")
    private ExtendedWebElement productImage;

    public AmazonProduct(WebDriver driver) {
        super(driver);
    }

    public AmazonProduct(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}
