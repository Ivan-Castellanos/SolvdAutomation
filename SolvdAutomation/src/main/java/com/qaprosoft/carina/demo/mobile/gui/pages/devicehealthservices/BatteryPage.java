package com.qaprosoft.carina.demo.mobile.gui.pages.devicehealthservices;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.devicehealthservices.commons.BatteryPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = BatteryPageBase.class)
public class BatteryPage extends BatteryPageBase {
    @FindBy(xpath = "android.widget.FrameLayout[@content-desc='Battery']")
    private ExtendedWebElement batteryPageTitle;
    @FindBy(id = "usage_summary")
    private ExtendedWebElement batteryPercentage;

    public BatteryPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public int checkbatteryPercentage() {
        return Integer.parseInt(batteryPercentage.getText().replace(" %", ""));
    }

    public boolean isPageOpened() {
        return batteryPageTitle.isElementPresent();
    }
}
