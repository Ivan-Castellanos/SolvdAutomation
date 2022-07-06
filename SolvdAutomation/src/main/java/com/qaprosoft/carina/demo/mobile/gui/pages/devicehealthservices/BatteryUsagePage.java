package com.qaprosoft.carina.demo.mobile.gui.pages.devicehealthservices;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.devicehealthservices.commons.BatteryUsagePageBase;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = BatteryUsagePageBase.class)
public class BatteryUsagePage {
    @FindBy(xpath = "android.widget.FrameLayout[@content-desc='Battery usage']")
    private ExtendedWebElement batteryUsageTitle;

    public boolean isPageOpened() {
        return batteryUsageTitle.isElementPresent();
    }
}
