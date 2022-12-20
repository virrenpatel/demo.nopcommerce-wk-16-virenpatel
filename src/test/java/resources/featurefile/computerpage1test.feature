Feature: Computer Test
  As a User I want to Add Product To Shopping Cart
  @smoke
  @regression
  Scenario: verify User Should Product Added To Shopping Cart SuccessFully
    Given I am on homepage
    When click On Computer
    And click On Desktop
    And getSelectByValue
    And clickOnAddToCart
    And getVerifyBuildYourOwn
    And selectProcessorByValue
    And selectRamByValue
    And clickOnHDDGB
    And clickOnOsVistaPremium
    And clickOnSoftwareTotalCommander
    And verifyTotalPrice
    And clickOnAddToCartButton
    And verifyCartMessage
    And closeMessageBar
    #And verifyShoppingCartMessage
    And mouseHoverOnElementShoppingCart
    And clickOnGoToCart
    And clearTextInQuantityField
    And sendTextToQuantityField
    And clickOnUpdateShoppingCartButton
    And verifyTotal
    And clickOnCheckBoxIAgreeWithTermsAndCondition
    And clickOnCheckOutButton
    And verifyWelcomeText
    And clickOnCheckOutAsGuest
    And sendTextToFirstNameField
    And sendTextToLastNameField
    And sendTextToEmailField
    And sendTextToCompanyField
    And selectCountryFromDropDownList
    And sendTextToCityField
    And sendTextToAddressLine
    And sendTextToAddressLine
    And sendTextToPostcode
    And sendTextToPhoneNumberField
    And clickOnContinueButton
    And clickOnNextDayAirButton
    And clickOnContinueButtonAgain
    And clickOnCreditCardButton
    And selectClickOnContinue
    And selectMasterCardFromCreditCardDropdown
    And sendTextTOCardHolderName
    And sendTextTOCardNumber
    And selectMonthAndYearForCreditCardExpireData
    And sendTextToCardCode
    And clickOnContinueButtonone
    And getVerifyText
    And clickOnConfirmButton
    And getVerifyText
    And getVerifyText
    #Then clickOnContinueButton
