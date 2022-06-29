package com.qaprosoft.carina.demo.gui.amazon.components;

import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonProduct extends AbstractUIObject {

    @FindBy(id = ".a-image-container img")
    private WebElement productImage;

    public AmazonProduct(WebDriver driver) {
        super(driver);
    }

    public AmazonProduct(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}
