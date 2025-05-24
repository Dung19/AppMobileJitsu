package com.jitsu.utils;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Common extends PageObject {
    public static final String ID = "ID";
    public static final String XPATH = "XPATH";
    public static final String ANDROID = "ANDROID";
    public static final String IOS = "IOS";


    public WebElementFacade findElementFacade(String findBy, String elementLC) {
        By by = null;
        switch (findBy) {
            case "ID":
                by = By.id(elementLC);
                break;
            case "XPATH":
                by = By.xpath(elementLC);
                break;
        }

        return $(by);
    }

    public static WebElement findElement(String findBy, String elementLC) {
        By by = null;
        switch (findBy) {
            case "ID":
                by = By.id(elementLC);
                break;
            case "XPATH":
                by = By.xpath(elementLC);
                break;
        }
        return ThucydidesWebDriverSupport.getDriver().findElement(by);
    }

//    public static JSONObject readFileJsonByPlatFormApp(String path) {
//        String platform;
//        if (DataUtils.getValueConf("appium.platformName").equals("ANDROID")) {
//            platform = Common.ANDROID;
//        } else {
//            platform = Common.IOS;
//        }
//        JSONObject fileObject = Utilities.readFileJson(path);
//        return fileObject.getJSONObject(platform);
//    }

    public interface PATH_FILE {
        String billPaymentView = "src/test/resources/data/view/BillPaymentView.json";
    }
}
