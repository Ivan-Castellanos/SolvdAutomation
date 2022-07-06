package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.mobile.gui.pages.devicehealthservices.commons.BatteryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.devicehealthservices.commons.SettingsHomePageBase;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeviceHealthServiceTest implements IAbstractTest {
    @Test()
    @MethodOwner(owner = "test")
    @TestLabel(name = "feature", value = {"mobile"})
    public void TestBatteryCharge() {
        //this test navigates though the settings of the phone and checks if the battery is fully charged with the device health service info.
        //preconditions: no preconditions.
        SettingsHomePageBase homePage = initPage(getDriver(), SettingsHomePageBase.class);
        Assert.assertTrue(homePage.isPageOpened(), "Settings  home page isn't opened.");

        BatteryPageBase batteryPage = homePage.clickBatteryButton();
        Assert.assertTrue(batteryPage.isPageOpened(), "Settings battery page isn't opened." );
        Assert.assertEquals(batteryPage.checkbatteryPercentage(), 100, "The battery is not fully charged.");
    }
}
