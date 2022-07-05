package com.qaprosoft.carina.demo.gui.amazon.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonMissingPackageVideo extends AbstractUIObject {

    @FindBy(css = ".playBox")
    protected ExtendedWebElement video;

    public AmazonMissingPackageVideo(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}
