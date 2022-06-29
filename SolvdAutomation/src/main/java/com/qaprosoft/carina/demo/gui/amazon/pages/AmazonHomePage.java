package com.qaprosoft.carina.demo.gui.amazon.pages;

import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.utils.R;
import org.openqa.selenium.WebDriver;

public class AmazonHomePage extends AmazonGeneralPage {

    public AmazonHomePage(WebDriver driver) {
        super(driver);
        setPageURL(R.CONFIG.get(Configuration.Parameter.URL.getKey()));
    }


}
