package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage1 extends Utility {
    private static final Logger log = LogManager.getLogger(Computer.class.getName());
    public ComputerPage1(){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@href='/computers']")
    WebElement computerMenu;
    @CacheLookup
    @FindBy(xpath = "//h2[@class='title']//a")
    WebElement desktopMenu;
    @CacheLookup
    @FindBy(xpath = "//select[@name='products-orderby']")
    WebElement selectByValue;
    @CacheLookup
    @FindBy(xpath = "//button[@class ='button-2 product-box-add-to-cart-button']")
    WebElement selectBuildYourOwn;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement verifyBuildYourOwn;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement selectProcessor;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement selectRam;
    @CacheLookup
    @FindBy(xpath = "//input[@id ='product_attribute_3_7']")
    WebElement selectHDD;
    @CacheLookup
    @FindBy(xpath = "//label[text()='Vista Premium [+$60.00]']")
    WebElement selectOS;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement totalCommander;
    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement verifyTotal;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement verifyCartMsg;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement closeMsg;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]\");////a[@class='ico-cart']")
    WebElement shoppingCartMessage;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement mouseHoverOnShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement clickOnGoToCart;
    @CacheLookup
    @FindBy(xpath = "//input[@value='1']")
    WebElement sendTextToQuantity;
    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement clickOnUpdateShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]")
    WebElement verifyTotal1;
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement clickOnCheckbox;
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement clickOnCheckout;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement verifyWelcome;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Checkout as Guest')]")
    WebElement clickOnCheckoutAsGuest;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement sendTextToFirstName;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement sendTextToLastName;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement sendTextToEmail;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Company")
    WebElement sendTextToCompany;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement sendTextToCity;
    @CacheLookup
    @FindBy(css = "#BillingNewAddress_Address1")
    WebElement sendTextToAddress1;
    @CacheLookup
    @FindBy(css = "#BillingNewAddress_Address2")
    WebElement sendTextToAddress2;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement sendTextToPostalCode;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement sendTextToPhoneNumber;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]")
    WebElement clickOnContinue;
    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_1']")
    WebElement clickOnNextDayAir;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]")
    WebElement clickOnContinueTab;
    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement clickOnCreditCard;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement clickOnMasterCard;
    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderName;
    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;
    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCode;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueButton2;
    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']/span[2]")
    WebElement verifyText1;
    public String getVerifyText1() {
        return getTextFromElement(verifyText1);
    }
    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']//span[2]")
    WebElement verifyText2;
    @CacheLookup
    @FindBy(xpath = "//tr[@class='order-total']/td[2]/span/strong")
    WebElement verifyText3;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 confirm-order-next-step-button']")
    WebElement confirm;
    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']/h1")
    WebElement verifyText4;
    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement verifyText5;
    @CacheLookup
    @FindBy(css = "div.master-wrapper-page:nth-child(6) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.checkout-page.order-completed-page div.page-body.checkout-data div.section.order-completed div.buttons > button.button-1.order-completed-continue-button")
    WebElement continueButton3;

    //******************************************************************************************************//

    public String getVerifyText2() {
        log.info("get Verify Text2 : " + verifyText2.toString());
        return getTextFromElement(verifyText2);
    }
    public void clickOnComputer() {
        log.info("click On Computer : " + computerMenu.toString());
        clickOnElement(computerMenu);
    }

    public void clickOnDesktop() {
        log.info("Click On Desktop : " + desktopMenu.toString());
        clickOnElement(desktopMenu);
    }
    public void getSelectByValue(String value) {
        log.info("get Select By Value : " + value +selectByValue.toString());
        selectByValueFromDropDown(selectByValue, value);
    }

    public void selectBuildYourOwn() {
        log.info("get Select By Value : " + selectByValue.toString());
        clickOnElement(selectBuildYourOwn);
    }

    public void clickOnAddToCart() {
        log.info("click On Add To Cart : " + addToCart.toString());
        try {
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        } catch (StaleElementReferenceException e) {
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        }
        clickOnElement(addToCart);
    }

    public String getVerifyBuildYourOwn() {
        log.info("get Verify Build Your Own : " + verifyBuildYourOwn.toString());
        return getTextFromElement(verifyBuildYourOwn);
    }
    public void selectProcessorByValue(String value) {
        log.info("select Processor By Value : " + selectProcessor.toString());
        selectByValueFromDropDown(selectProcessor, value);
    }

    public void selectRamByValue(String value) {
        log.info("select Ram By Value : " + selectRam.toString());
        selectByValueFromDropDown(selectRam, value);
    }
    public void clickOnHDD400GB() {
        log.info("click On HDD 400GB : " + selectHDD.toString());
        clickOnElement(selectHDD);
    }

    public void clickOnOsVistaPremium() {
        log.info("click On Os Vista Premium : " + selectOS.toString());
        clickOnElement(selectOS);
    }
    public void clickOnSoftwareTotalCommander() {
        log.info("click On Software Total Commander : " + totalCommander.toString());
        clickOnElement(totalCommander);
    }
    public String verifyTotalPrice() {
        log.info("verify Total Price : " + verifyTotal.toString());
        return getTextFromElement(verifyTotal);
    }

    public void clickOnAddToCartButton() {
        log.info("click On Add To Cart Button : " + addToCartButton.toString());
        clickOnElement(addToCartButton);
    }

    public String verifyCartMessage() {
        log.info("verify Cart Message : " + verifyCartMsg.toString());
        return getTextFromElement(verifyCartMsg);
    }
    public void closeMessageBar() {
        log.info("close Message Bar : " + closeMsg.toString());
        clickOnElement(closeMsg);
    }

    public String verifyShoppingCartMessage(){
        log.info("verify Shopping Cart Message : " + shoppingCartMessage.toString());
        return getTextFromElement(shoppingCartMessage);
    }
    public void mouseHoverOnElementShoppingCart() {
        log.info("Mouse Hover On Element Shopping Cart : " + mouseHoverOnShoppingCart.toString());
        mouseHoverToElement(mouseHoverOnShoppingCart);
    }
    public void clickOnGoToCart() {
        log.info("click On Go To Cart : " + clickOnGoToCart.toString());
        clickOnElement(clickOnGoToCart);
    }

    public void clearTextInQuantityField() {
        Actions actions = new Actions(driver);
        WebElement quantity = driver.findElement(By.xpath("//input[@value='1']"));
        quantity.clear();
    }

    public void sendTextToQuantityField() {
        log.info("send Text To Quantity Field : " + sendTextToQuantity.toString());
        sendTextToElement(sendTextToQuantity, "2");
    }

    public void clickOnUpdateShoppingCartButton() {
        log.info("click On Update Shopping Cart Button : " + clickOnUpdateShoppingCart.toString());
        clickOnElement(clickOnUpdateShoppingCart);
    }
    public String verifyTotal1(){
        log.info("verify Total1 : " + verifyTotal1.toString());
        return getTextFromElement(verifyTotal1);
    }
    public void clickOnCheckBoxIAgreeWithTermsAndCondition() {
        log.info("click On Check Box I Agree With Terms And Condition : " + clickOnCheckbox.toString());
        clickOnElement(clickOnCheckbox);
    }
    public void clickOnCheckOutButton() {
        log.info("click On Check Out Button : " + clickOnCheckout.toString());
        clickOnElement(clickOnCheckout);
    }
    public String verifyWelcomeText(){
        log.info("verify Welcome Text : " + verifyWelcome.toString());
        return getTextFromElement(verifyWelcome);
    }

    public void clickOnCheckOutAsGuest() {
        log.info("click On Check Out As Guest : " + clickOnCheckoutAsGuest.toString());
        clickOnElement(clickOnCheckoutAsGuest);
    }
    public void sendTextToFirstNameField(String name) {
        log.info("send Text To First Name Field : " + name + sendTextToFirstName.toString());
        sendTextToElement(sendTextToFirstName, name);
    }
    public void sendTextToLastNameField(String lastName) {
        log.info("send Text To Last Name Field : " + lastName +sendTextToLastName.toString());
        sendTextToElement(sendTextToLastName, lastName);
    }
    public void sendTextToEmailField(String email) {
        log.info("send Text To Email Field : " + email + sendTextToEmail.toString());
        sendTextToElement(sendTextToEmail, email);
    }
    public void sendTextToCompanyField(String company) {
        log.info("send Text To Company Field : " + company + sendTextToCompany.toString());
        sendTextToElement(sendTextToCompany, company);
    }
    public void selectCountryFromDropDownList() {
        selectByValueFromDropDown(By.xpath("//select[@id='BillingNewAddress_CountryId']"), "158");
    }
    public void sendTextToCityField(String city) {
        log.info("send Text To City Field : " + sendTextToCity.toString());
        sendTextToElement(sendTextToCity, city);
    }
    public void sendTextToAddressLine1(String address) {
        log.info("send Text To Address Line1 : " + sendTextToAddress1.toString());
        sendTextToElement(sendTextToAddress1, address);
    }
    public void sendTextToAddressLine2(String address) {
        log.info("send Text To Address Line2 : " + sendTextToAddress2.toString());
        sendTextToElement(sendTextToAddress2, address);
    }
    public void sendTextToPostcode(String postcode) {
        log.info("send Text To Postcode : " + sendTextToPostalCode.toString());
        sendTextToElement(sendTextToPostalCode, postcode);
    }
    public void sendTextToPhoneNumberField(String number) {
        log.info("send Text To Phone Number Field : " + sendTextToPhoneNumber.toString());
        sendTextToElement(sendTextToPhoneNumber, number);
    }
    public void clickOnContinueButton() {
        log.info("click On Continue Button : " + clickOnContinue.toString());
        clickOnElement(clickOnContinue);
    }
    public void clickOnNextDayAirButton() {
        log.info("click On Next Day Air Button : " + clickOnNextDayAir.toString());
        clickOnElement(clickOnNextDayAir);
    }
    public void clickOnContinueButtonAgain() {
        log.info("click On Continue Button Again : " + clickOnContinueTab.toString());
        clickOnElement(clickOnContinueTab);
    }
    public void clickOnCreditCardButton() {
        log.info("click On Credit Card Button : " + clickOnCreditCard.toString());
        clickOnElement(clickOnCreditCard);
    }
    public void selectClickOnContinue1() {
        log.info("select Click On Continue1 : " + continueButton.toString());
        clickOnElement(continueButton);
    }
    public void selectMasterCardFromCreditCardDropdown(String value) {
        log.info("Select Master Card : " + clickOnMasterCard.toString());
        selectByValueFromDropDown(clickOnMasterCard,value);
    }
    public void sendTextTOCardHolderName(String name) {
        log.info("send Text TO Card Holder Name : " + cardHolderName.toString());
        sendTextToElement(cardHolderName, name);
    }
    public void sendTextTOCardNumber(String num) {
        log.info("send Text TO CardNumber : " + num + cardNumber.toString());
        sendTextToElement(cardNumber, num);
    }
    public void selectMonthAndYearForCreditCardExpireData() {
        selectByValueFromDropDown(By.id("ExpireMonth"), "5");
        selectByValueFromDropDown(By.id("ExpireYear"), "2024");
    }

    public void sendTextToCardCode(String code) {
        log.info("send Text To Card Code : " + code + cardCode.toString());
        sendTextToElement(cardCode, code);
    }
    public void clickOnContinueButton2() {
        log.info("click On Continue Button2 : " + continueButton2.toString());
        clickOnElement(continueButton2);
    }
    public String getVerifyText3() {
        log.info("get Verify Text3 : " + verifyText3.toString());
        return getTextFromElement(verifyText3);
    }
    public void clickOnConfirmButton() {
        log.info("click On Confirm Button : " + confirm.toString());
        clickOnElement(confirm);
    }
    public String getVerifyText4() {
        log.info("get Verify Text4 : " + verifyText4.toString());
        return getTextFromElement(verifyText4);
    }
    public String getVerifyText5() {
        log.info("get Verify Text5 : " + verifyText5.toString());
        return getTextFromElement(verifyText5);
    }
    public void clickOnContinueButton3() {
        log.info("click On Continue Button3 : " + continueButton3.toString());
        clickOnElement(continueButton3);
    }

}