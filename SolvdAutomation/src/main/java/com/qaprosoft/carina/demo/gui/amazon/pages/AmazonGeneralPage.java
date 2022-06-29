package com.qaprosoft.carina.demo.gui.amazon.pages;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.amazon.components.AmazonFooter;
import com.qaprosoft.carina.demo.gui.amazon.components.AmazonNavigationBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonGeneralPage extends AbstractPage {
    @FindBy(id = "navbar-main")
    private AmazonNavigationBar navBar;

    @FindBy(id = "navfooter")
    private AmazonFooter amnFooter;

    public AmazonGeneralPage(WebDriver driver) {
        super(driver);
    }
}
