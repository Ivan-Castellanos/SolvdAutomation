package com.qaprosoft.carina.demo.mobile.gui.pages.devicehealthservices.commons;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class SettingsHomePageBase extends AbstractPage {
    public SettingsHomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract BatteryPageBase clickBatteryButton();
}
