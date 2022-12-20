package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(Computer.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(css = "div[class='page-title'] h1")
    WebElement pageTitle;

    @CacheLookup
    @FindBy(xpath = "//div[@class='category-grid sub-category-grid']//h2/a")
    List<WebElement> subMenuLinks;
    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/child::ul[1]/li/a")
    List<WebElement> topMenuList;


    public String getPageTitleText() {
        String message = getTextFromElement(pageTitle);
        log.info("Get PageTitle Text" + pageTitle.toString());
        return message;
    }

    public void clickOnSubMenu(String subTab) {
        for (WebElement menu : subMenuLinks) {
            if (menu.getText().contains(subTab)) {
                clickOnElement(menu);
                log.info("click On SubMenu " + menu.toString());
                break;
            }
        }
    }
    public void clickOnMenuTab(String tab) {
        for (WebElement menu : topMenuList) {
            if (menu.getText().contains(tab)) {
                clickOnElement(menu);
                log.info("click On MenuTab " + menu.toString());
                break;
            }
        }
    }

}
