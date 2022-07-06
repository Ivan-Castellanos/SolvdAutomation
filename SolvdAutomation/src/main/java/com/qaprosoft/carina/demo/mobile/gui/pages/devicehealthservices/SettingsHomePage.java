package com.qaprosoft.carina.demo.mobile.gui.pages.devicehealthservices;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.devicehealthservices.commons.BatteryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.devicehealthservices.commons.SettingsHomePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SettingsHomePageBase.class)
public class SettingsHomePage extends SettingsHomePageBase {

    @FindBy(xpath = "//*[contains(text(),'Battery')]")
    private ExtendedWebElement batteryButton;

    public SettingsHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public BatteryPageBase clickBatteryButton() {
        batteryButton.click();
        return initPage(BatteryPageBase.class);
    }
}
