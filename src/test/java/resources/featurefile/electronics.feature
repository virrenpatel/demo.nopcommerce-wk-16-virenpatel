Feature: Electronics Test
  As a User I want to Add Product To Shopping Cart
  @smoke
  @regression
  Scenario: verify User Should able to Add Product from Electronics To Shopping Cart SuccessFully
    Given I am on homepage
    When mousehoveronelectronicstab
    And mouseHoverOnCellPhonesAndClick
    And verifyTextCellPhones
    And mouseHoverOnElectronics
    And mouseHoverOnCellPhones
   # And verifyTextCellphones
    And clickOnListViewTab
    And clickOnProductNameNokia
    And verifyTextNokiaLumia
    And verifyNokiaPrice
    And clearQuantity
    And changeQuantityTo
   # And clickOnAddToCart
    And verifyGreenBarMessage
    And clickOnGreenBar
    And mouseHoverOnShoppingCart
    And hoverAndClickOnGoToCart
    And verifyMessageShoppingCart
    And verifyQuantity
    And verifyTotal
    And clickOnCheckboxx
    And clickOnCheckoutt
    And verifyTextWelcomePlease
    And clickOnRegister
    And verifyTextRegister
    And sendTextToFirstNameField
    And sendTextToLastNameField
    And sendTextToDay
    And sendTextToMonth
    And sendTextToYear
    And sendTextToEmailField
    And sendTextToPasswordField
    And sendTextToConfirmPasswordField
    And clickOnRegisterone
    And verifyMessageYourRegistrationCompleted
    And clickOnContinueone
    And verifyTextShoppingCart
    And clickOnCheckboxone
    And clickOnCheckout
    And countryByVisibleText
    And sendTextToCity
    And sendTextToAddress
    And sendTextToPostelCode
    And sendTextToPhoneNumber
    And clickOnContinue
    And clickOn2ndDayAir
    And clickOnContinue
    And clickOnCreditCard
    And clickOnContinueTab
    And clickOnSelectCreditCard
    And clickOnVisa
    And sendTextToCardholderName
    And sendTextToCardNumber
    And sendTextToExpirationMonth
    And sendTextToExpirationYear
    And sendTextToCardCode
    And clickOnContinue
    And verifyPaymentMethod
    And verifyShoppingMethod
    And verifyTotalPrice
    And clickOnConfirm
    And verifyTextThankYou
    And verifySuccessfully
    And clickOnContinue
    And verifyWelcomeToOurStore
    Then clickOnLogout
