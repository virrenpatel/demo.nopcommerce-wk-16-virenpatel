package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.ComputerPage1;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ComputerPage1Test {

    @When("^click On Computer$")
    public void clickOnComputer() {
        new ComputerPage1().clickOnComputer();
    }


    @And("^click On Desktop$")
    public void clickOnDesktop() {
        new ComputerPage1().clickOnDesktop();
    }

    @And("^getSelectByValue$")
    public void getselectbyvalue() {
        new ComputerPage1().getSelectByValue("5");
    }
    @And("^click on build your own computer$")
    public void clickOnBuildYourOwnComputer() {
        new ComputerPage1().selectBuildYourOwn();
    }

    @And("^clickOnAddToCart$")
    public void clickonaddtocart() {
        new ComputerPage1().clickOnAddToCart();

    }

    @And("^getVerifyBuildYourOwn$")
    public void getverifybuildyourown() {
        new ComputerPage1().getVerifyBuildYourOwn();
    }

    @And("^selectProcessorByValue$")
    public void selectprocessorbyvalue() {
        new ComputerPage1().selectProcessorByValue("1");
    }

    @And("^selectRamByValue$")
    public void selectrambyvalue() {
        new ComputerPage1().selectRamByValue("5");
    }
    @And("^clickOnHDDGB$")
    public void clickonhddgb() {
        new ComputerPage1().clickOnHDD400GB();
    }

//    @And("^clickOnHDD(\\d+)GB$")
//    public void clickonhddGB() {
//        new ComputerPage1().clickOnHDD400GB();
//    }

    @And("^clickOnOsVistaPremium$")
    public void clickonosvistapremium() {
        new ComputerPage1().clickOnOsVistaPremium();
    }

    @And("^clickOnSoftwareTotalCommander$")
    public void clickonsoftwaretotalcommander() {
        new ComputerPage1().clickOnSoftwareTotalCommander();
    }

    @And("^verifyTotalPrice$")
    public void verifytotalprice() {
        new ComputerPage1().verifyTotalPrice();
    }

    @And("^clickOnAddToCartButton$")
    public void clickonaddtocartbutton() {
        new ComputerPage1().clickOnAddToCartButton();
    }

    @And("^verifyCartMessage$")
    public void verifycartmessage() {
        new ComputerPage1().verifyCartMessage();
    }

    @And("^closeMessageBar$")
    public void closemessagebar() {
        new ComputerPage1().closeMessageBar();
    }

    @And("^verifyShoppingCartMessage$")
    public void verifyshoppingcartmessage() {
        new ComputerPage1().verifyShoppingCartMessage();
    }

    @And("^mouseHoverOnElementShoppingCart$")
    public void mousehoveronelementshoppingcart() throws InterruptedException {
        Thread.sleep(5000);
        new ComputerPage1().mouseHoverOnElementShoppingCart();
    }

    @And("^clickOnGoToCart$")
    public void clickongotocart() {
        new ComputerPage1().clickOnGoToCart();
    }

    @And("^clearTextInQuantityField$")
    public void cleartextinquantityfield() {
        new ComputerPage1().clearTextInQuantityField();
    }

    @And("^sendTextToQuantityField$")
    public void sendtexttoquantityfield() {
        new ComputerPage1().sendTextToQuantityField();
    }

    @And("^clickOnUpdateShoppingCartButton$")
    public void clickonupdateshoppingcartbutton() {
        new ComputerPage1().clickOnUpdateShoppingCartButton();
    }

    @And("^verifyTotal$")
    public void verifytotal() {
        new ComputerPage1().verifyTotal1();
    }

    @And("^clickOnCheckBoxIAgreeWithTermsAndCondition$")
    public void clickoncheckboxiagreewithtermsandcondition() {
        new ComputerPage1().clickOnCheckBoxIAgreeWithTermsAndCondition();
    }

    @And("^clickOnCheckOutButton$")
    public void clickoncheckoutbutton() {
        new ComputerPage1().clickOnCheckOutButton();
    }

    @And("^verifyWelcomeText$")
    public void verifywelcometext() {
        new ComputerPage1().verifyWelcomeText();
    }

    @And("^clickOnCheckOutAsGuest$")
    public void clickoncheckoutasguest() {
        new ComputerPage1().clickOnCheckOutAsGuest();
    }

    @And("^sendTextToFirstNameField$")
    public void sendtexttofirstnamefield() {
        new ComputerPage1().sendTextToFirstNameField("Manan");
    }

    @And("^sendTextToLastNameField$")
    public void sendtexttolastnamefield() {
        new ComputerPage1().sendTextToLastNameField("Shah");
    }

    @And("^sendTextToEmailField$")
    public void sendtexttoemailfield() {
        new ComputerPage1().sendTextToEmailField("123test@gmail.com");
    }

    @And("^sendTextToCompanyField$")
    public void sendtexttocompanyfield() {
        new ComputerPage1().sendTextToCompanyField("Testing");
    }

    @And("^selectCountryFromDropDownList$")
    public void selectcountryfromdropdownlist() {
        new ComputerPage1().selectCountryFromDropDownList();
    }

    @And("^sendTextToCityField$")
    public void sendtexttocityfield() {
        new ComputerPage1().sendTextToCityField("London");
    }

    @And("^sendTextToAddressLine$")
    public void sendtexttoaddressline() {
        new ComputerPage1().sendTextToAddressLine1("Luton");
    }

    @And("^sendTextToPostcode$")
    public void sendtexttopostcode() {
        new ComputerPage1().sendTextToPostcode("HA8 9LM");
    }

    @And("^sendTextToPhoneNumberField$")
    public void sendtexttophonenumberfield() {
        new ComputerPage1().sendTextToPhoneNumberField("020398383");
    }

    @And("^clickOnContinueButton$")
    public void clickoncontinuebutton() {
        new ComputerPage1().clickOnContinueButton();
    }

    @And("^clickOnNextDayAirButton$")
    public void clickonnextdayairbutton() {
        new ComputerPage1().clickOnNextDayAirButton();
    }

    @And("^clickOnContinueButtonAgain$")
    public void clickoncontinuebuttonagain() {
        new ComputerPage1().clickOnContinueButtonAgain();
    }

    @And("^clickOnCreditCardButton$")
    public void clickoncreditcardbutton() {
        new ComputerPage1().clickOnCreditCardButton();
    }

    @And("^selectClickOnContinue$")
    public void selectclickoncontinue() {
        new ComputerPage1().selectClickOnContinue1();
    }

    @And("^selectMasterCardFromCreditCardDropdown$")
    public void selectmastercardfromcreditcarddropdown() {
        new ComputerPage1().selectMasterCardFromCreditCardDropdown("MasterCard");
    }

    @And("^sendTextTOCardHolderName$")
    public void sendtexttocardholdername() {
        new ComputerPage1().sendTextTOCardHolderName("M Shah");
    }

    @And("^sendTextTOCardNumber$")
    public void sendtexttocardnumber() {
        new ComputerPage1().sendTextTOCardNumber("1111222233334444");
    }

    @And("^selectMonthAndYearForCreditCardExpireData$")
    public void selectmonthandyearforcreditcardexpiredata() {
        new ComputerPage1().selectMonthAndYearForCreditCardExpireData();
    }

    @And("^sendTextToCardCode$")
    public void sendtexttocardcode() {
        new ComputerPage1().sendTextToCardCode("453");
    }

    @And("^clickOnContinueButtonone$")
    public void clickoncontinuebutton2() {
        new ComputerPage1().clickOnContinueButton2();
    }

    @And("^getVerifyText$")
    public void getverifytext() {
        new ComputerPage1().getVerifyText3();
    }

    @Then("^clickOnConfirmButton$")
    public void clickonconfirmbutton() {
        new ComputerPage1().clickOnConfirmButton();
    }



}
