package com.qaprosoft.carina.demo.gui.amazon.pages;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.amazon.components.AmazonFooter;
import com.qaprosoft.carina.demo.gui.amazon.components.AmazonNavigationBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonAbstractPage extends AbstractPage {
    @FindBy(id = "navbar-main")
    protected AmazonNavigationBar navBar;

    @FindBy(id = "navfooter")
    protected AmazonFooter footer;

    public AmazonAbstractPage(WebDriver driver) {
        super(driver);
    }
}
