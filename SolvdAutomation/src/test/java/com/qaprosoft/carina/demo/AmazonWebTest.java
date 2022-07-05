package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.demo.gui.amazon.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AmazonWebTest implements IAbstractTest {
    @Test
    public void testFooterLinks() {
        SoftAssert softAssert = new SoftAssert();
        //This test was made in order to check the functionality of the footer bar. Firsts it opens the main amazon page
        //Preconditions: no preconditions.
        AmazonHomePage homePage = new AmazonHomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened.");

        //This part of the test go to the different pages listed in the footer with a soft assert
        AmazonConditionOfUsePage conditionsOfUsePage = homePage.goToConditionOfUsePage();
        softAssert.assertTrue(conditionsOfUsePage.isConditionsOfUseTitlePresent(), "conditions of use page was not opened during the footer test.");

        AmazonPrivacyPage privacyPage = homePage.goToPrivacyPage();
        softAssert.assertTrue(privacyPage.isPrivacyTitlePresent(), "privacy page was not opened during the footer test.");

        AmazonInterestBasedPage interestBasedPage = homePage.goToInterestPage();
        softAssert.assertTrue(interestBasedPage.isConditionsOfUseTitlePresent(), "interest page was not opened during the test.");
        softAssert.assertAll();
    }

    @Test //this test must fail
    public void testSignUpFailureThroughCart() {
        //this test was made in order to probe the navigation through several pages before failing trying to register with different passwords.
        //preconditions: The cart is empty, not signed in an account, data added in _testdata.properties .
        AmazonHomePage homePage = new AmazonHomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened.");

        AmazonCartPage cartPage = homePage.goToCartWithoutRegister();
        Assert.assertTrue(cartPage.isCartPageTitleCorrect(), "Cart page was not opened during the test.");
        Assert.assertTrue(cartPage.isCartEmpty(), "the cart has products in it.");

        AmazonSignInPage signIn = cartPage.clickSignIn();
        Assert.assertTrue(signIn.isSignInTitleCorrect(), "Sign in page was not opened during the test.");

        AmazonCreateAccountPage createAccountPage = signIn.createAccount();
        Assert.assertTrue(createAccountPage.isCreateAccountTitlePresent(), "Sign Up page was not opened during the test.");
        Assert.assertTrue(createAccountPage.failedSignUp(), "the alert message didn't show.");
    }

    @Test
    public void testQuantityOfTodayDealsProduct() {
        //this test check the quantity of items displayed on Today Deals Amazon Page is the correct. Expected 55, 11 rows, 5 columns.
        //preconditions: no preconditions.
        AmazonHomePage homePage = new AmazonHomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened.");

        AmazonTodayDealsPage todayDealsPage = homePage.goToTodayDeals();
        Assert.assertTrue(todayDealsPage.isPageTitleCorrect());
        Assert.assertEquals(todayDealsPage.countProducts(), R.TESTDATA.getInt("expected_items"),
                "the number of element displayed is different from the expected.");
    }

    @Test
    public void testSearchResults() {
        //this test search for a word with the searchbar, verifies is the first given option is correct.
        //preconditions: no empty searchbar, search word added in _testdata.properties.
        AmazonHomePage homePage = new AmazonHomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened.");

        AmazonResultPage amazonResultPage = homePage.searchStoredWord();
        Assert.assertTrue(amazonResultPage.isSearchedWordPresent()); //if the searched word is not in the fir result this test will fail.
    }

    @Test
    public void testCustomerServiceHelp() {
        //this test search for a video in the Customer Service Page, go through navigating, and see if the button to start an important video is there.
        //preconditions: no preconditions.
        AmazonHomePage homePage = new AmazonHomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened.");

        AmazonCustomerServicePage amznCustomerPage = homePage.goToCustomerService();
        amznCustomerPage.clickMissingPacketButton();
        Assert.assertTrue(amznCustomerPage.isTheVideoVisible());
    }
}
