package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.Electronics;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ElectronicsTest {
    @When("^mousehoveronelectronicstab$")
    public void mousehoveronelectronicstab() {
        new Electronics().mouseHoverOnElectronics1();
    }
    @And("^mouseHoverOnCellPhonesAndClick$")
    public void mousehoveroncellphonesandclick() {
        new Electronics().mouseHoverOnCellPhonesAndClick();
    }

    @And("^verifyTextCellPhones$")
    public void verifytextcellphones() {
        new Electronics().verifyTextCellPhones();
    }

    @And("^mouseHoverOnElectronics$")
    public void mousehoveronelectronics() {
        new Electronics().mouseHoverOnElectronics();
    }

    @And("^mouseHoverOnCellPhones$")
    public void mousehoveroncellphones() {
        new Electronics().mouseHoverOnCellPhones1();
    }

    @And("^clickOnListViewTab$")
    public void clickonlistviewtab() {
        new Electronics().clickOnListViewTab();
    }

    @And("^clickOnProductNameNokia$")
    public void clickonproductnamenokia() throws InterruptedException {
        Thread.sleep(5000);
        new Electronics().clickOnProductNameNokia();
    }

    @And("^verifyTextNokiaLumia$")
    public void verifytextnokialumia() {
        new Electronics().verifyTextNokiaLumia();
    }

    @And("^verifyNokiaPrice$")
    public void verifynokiaprice() {
        new Electronics().verifyNokiaPrice();
    }

    @And("^clearQuantity$")
    public void clearquantity() {
        new Electronics().clearQuantity();
    }

    @And("^changeQuantityTo$")
    public void changequantityto(int quantity) {
        new Electronics().changeQuantityTo2("2");
    }
//    @And("^clickOnAddToCartButton$")
//    public void clickonaddtocartbutton() {
//        new ComputerPage1().clickOnAddToCartButton();
//    }

    @And("^verifyGreenBarMessage$")
    public void verifygreenbarmessage() {
        new Electronics().verifyGreenBarMessage();
    }

    @And("^clickOnGreenBar$")
    public void clickongreenbar() {
        new Electronics().clickOnGreenBar();
    }

    @And("^mouseHoverOnShoppingCart$")
    public void mousehoveronshoppingcart() {
        new Electronics().mouseHoverOnShoppingCart();
    }

    @And("^hoverAndClickOnGoToCart$")
    public void hoverandclickongotocart() {
        new Electronics().hoverAndClickOnGoToCart();
    }

    @And("^verifyMessageShoppingCart$")
    public void verifymessageshoppingcart() {
        new Electronics().verifyMessageShoppingCart();
    }

    @And("^verifyQuantity$")
    public void verifyquantity() {
        new Electronics().verifyQuantity();
    }

//    @And("^verifyTotal$")
//    public void verifytotal() {
//        new Electronics().verifyTotal();
//    }


    @And("^clickOnCheckboxx$")
    public void clickoncheckbox() {
        new Electronics().clickOnCheckbox();
    }

    @And("^clickOnCheckoutt$")
    public void clickoncheckout() {
        new Electronics().clickOnCheckout();
    }

    @And("^verifyTextWelcomePlease$")
    public void verifytextwelcomeplease() {
        new Electronics().verifyTextWelcomePlease();
    }

    @And("^clickOnRegister$")
    public void clickonregister() {
        new Electronics().clickOnRegister();
    }

    @And("^verifyTextRegister$")
    public void verifytextregister() {
        new Electronics().verifyTextRegister();
    }
//    @And("^sendTextToFirstNameField$")
//    public void sendtexttofirstnamefield() {
//        new ComputerPage1().sendTextToFirstNameField("Manan");
//    }
//
//    @And("^sendTextToLastNameField$")
//    public void sendtexttolastnamefield() {
//        new ComputerPage1().sendTextToLastNameField("Shah");
//    }

    @And("^sendTextToDay$")
    public void sendtexttoday() {
        new Electronics().sendTextToDay("12");
    }

    @And("^sendTextToMonth$")
    public void sendtexttomonth() {
        new Electronics().sendTextToMonth("10");
    }

    @And("^sendTextToYear$")
    public void sendtexttoyear() {
        new Electronics().sendTextToYear("2024");
    }
//    @And("^sendTextToEmailField$")
//    public void sendtexttoemailfield() {
//        new ComputerPage1().sendTextToEmailField("123test@gmail.com");
//    }

    @And("^sendTextToPasswordField$")
    public void sendtexttopasswordfield() {
        new Electronics().sendTextToPasswordField("123456");
    }

    @And("^sendTextToConfirmPasswordField$")
    public void sendtexttoconfirmpasswordfield() {
        new Electronics().sendTextToConfirmPasswordField("123456");
    }

    @And("^clickOnRegisterone$")
    public void clickonregister1() {
        new Electronics().clickOnRegister1();
    }

    @And("^verifyMessageYourRegistrationCompleted$")
    public void verifymessageyourregistrationcompleted() {
        new Electronics().verifyMessageYourRegistrationCompleted();
    }

    @And("^clickOnContinueone$")
    public void clickoncontinue() {
        new Electronics().clickOnContinue();
    }

    @And("^verifyTextShoppingCart$")
    public void verifytextshoppingcart() {
        new Electronics().verifyTextShoppingCart();
    }

    @And("^clickOnCheckboxone$")
    public void clickoncheckbox1() {
        new Electronics().clickOnCheckbox1();
    }

    @And("^clickOnCheckout$")
    public void clickoncheckout1() {
        new Electronics().clickOnCheckout1();
    }

    @And("^countryByVisibleText$")
    public void countrybyvisibletext() {
        new Electronics().countryByVisibleText("UK");
    }

    @And("^sendTextToCity$")
    public void sendtexttocity() {
        new Electronics().sendTextToCity("Luton");
    }

    @And("^sendTextToAddress$")
    public void sendtexttoaddress() {
        new Electronics().sendTextToAddress("34,Luton Road");
    }

    @And("^sendTextToPostelCode$")
    public void sendtexttopostelcode() {
        new Electronics().sendTextToPostelCode("HA9 8LD");
    }

    @And("^sendTextToPhoneNumber$")
    public void sendtexttophonenumber() {
        new Electronics().sendTextToPhoneNumber("02033453");
    }

    @And("^clickOnContinue$")
    public void clickoncontinue1() {
        new Electronics().clickOnContinue1();
    }

    @And("^clickOn(\\d+)ndDayAir$")
    public void clickonNdDayAir() {
        new Electronics().clickOn2ndDayAir();
    }
//    @And("^clickOnContinueButtonAgain$")
//    public void clickoncontinuebuttonagain() {
//        new ComputerPage1().clickOnContinueButtonAgain();
//    }

    @And("^clickOnCreditCard$")
    public void clickoncreditcard() {
        new Electronics().clickOnCreditCard();
    }

    @And("^clickOnContinueTab$")
    public void clickoncontinuetab() {
        new Electronics().clickOnContinueTab();
    }

    @And("^clickOnSelectCreditCard$")
    public void clickonselectcreditcard() {
        new Electronics().clickOnSelectCreditCard();
    }

    @And("^clickOnVisa$")
    public void clickonvisa() {
        new Electronics().clickOnVisa();
    }

//    @And("^sendTextToCardholderName$")
//    public void sendtexttocardholdername() {
//        new Electronics().sendTextToCardholderName("Manan");
//    }

//    @And("^sendTextToCardNumber$")
//    public void sendtexttocardnumber() {
//        new Electronics().sendTextToCardNumber("1111222233334444");
//    }

    @And("^sendTextToExpirationMonth$")
    public void sendtexttoexpirationmonth() {
        new Electronics().sendTextToExpirationMonth("08");
    }

    @And("^sendTextToExpirationYear$")
    public void sendtexttoexpirationyear() {
        new Electronics().sendTextToExpirationYear("2024");
    }
//    @And("^sendTextToCardCode$")
//    public void sendtexttocardcode() {
//        new ComputerPage1().sendTextToCardCode("453");
//    }

    @And("^verifyPaymentMethod$")
    public void verifypaymentmethod() {
        new Electronics().verifyPaymentMethod();
    }

    @And("^verifyShoppingMethod$")
    public void verifyshoppingmethod() {
        new Electronics().verifyShoppingMethod();
    }

    @And("^clickOnConfirm$")
    public void clickonconfirm() {
        new Electronics().clickOnConfirm();
    }

    @And("^verifyTextThankYou$")
    public void verifytextthankyou() {
        new Electronics().verifyTextThankYou();
    }

    @And("^verifySuccessfully$")
    public void verifysuccessfully() {
        new Electronics().verifySuccessfully();
    }
//    @And("^clickOnContinueButton(\\d+)$")
//    public void clickoncontinuebutton2() {
//        new ComputerPage1().clickOnContinueButton2();
//    }

    @And("^verifyWelcomeToOurStore$")
    public void verifywelcometoourstore() {
        new Electronics().verifyWelcomeToOurStore();
    }

    @Then("^clickOnLogout$")
    public void clickonlogout() {
        new Electronics().clickOnLogout();
    }


    //************************************************************************************************

}
