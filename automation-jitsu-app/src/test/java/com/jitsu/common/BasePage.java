package com.jitsu.common;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;

import com.jitsu.utils.*;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.WebDriverFacade;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.lang.Thread.sleep;
import static java.time.Duration.ofMillis;
import static org.assertj.core.api.Assertions.assertThat;

public class BasePage extends PageObject {
    @iOSXCUITFindBy(id = "Next")
    private WebElementFacade nextButtonNumberKeyboard;

    private Dimension screenSize;

    public void startApplication() {
    }

    public void closeAppThenReopen() {
        if (Utilities.isCurrentPlatformAndroid()) {
            mobileDriver().closeApp();
            waitABit(5000);
            mobileDriver().launchApp();
        } else {
            mobileDriverIOS().closeApp();
            waitABit(5000);
            mobileDriverIOS().launchApp();
        }
    }

    public void closeApp() {
        mobileDriver().closeApp();
    }

    public void waitASeconds(int miliseconds) {
        waitABit(miliseconds);
    }

    public AppiumDriver<AndroidElement> mobileDriver() {
        return (AppiumDriver<AndroidElement>) ((WebDriverFacade) getDriver()).getProxiedDriver();
    }

    public AppiumDriver<IOSElement> mobileDriverIOS() {
        return (AppiumDriver<IOSElement>) ((WebDriverFacade) getDriver()).getProxiedDriver();
    }

    public void scrollDownByAction() {
        if (screenSize == null) {
            screenSize = getDriver().manage().window().getSize();
        }
        int deviceHeight = screenSize.getHeight();
        int deviceWidth = screenSize.getWidth();

        TouchAction action = new TouchAction(mobileDriver());
        action.longPress(PointOption.point(deviceWidth / 2, (deviceHeight / 2) - 100))
                .moveTo(PointOption.point(deviceWidth / 2, 0))
                .release()
                .perform();
    }

    public void scrollDownByAction(int startPoint, int endPoint) {
        if (screenSize == null) {
            screenSize = getDriver().manage().window().getSize();
        }
        int deviceHeight = screenSize.getHeight();
        int deviceWidth = screenSize.getWidth();

        TouchAction action = new TouchAction(mobileDriver());
        action.longPress(PointOption.point(deviceWidth / 2, (int) (deviceHeight * startPoint / 100)))
                .moveTo(PointOption.point(deviceWidth / 2, (int) (deviceHeight * endPoint / 100)))
                .release()
                .perform();
    }

    public void scrollDownByAction(int startX, int startY, int endX, int endY) {
        if (screenSize == null) {
            screenSize = getDriver().manage().window().getSize();
        }
        int deviceHeight = screenSize.getHeight();
        int deviceWidth = screenSize.getWidth();
        try {
            if (startX > deviceWidth
                    || startY > deviceHeight
                    || endX > deviceWidth
                    || endY > deviceHeight) throw new Exception("PointOption is wrong");
        } catch (Exception e) {
            e.printStackTrace();
        }
        TouchAction action = new TouchAction(mobileDriver());
        action.longPress(PointOption.point(startX, startY))
                .moveTo(PointOption.point(endX, endY))
                .release()
                .perform();
    }

    public void scrollUpToClosePopup() {
        if (screenSize == null) {
            screenSize = getDriver().manage().window().getSize();
        }
        int deviceHeight = screenSize.getHeight();
        int deviceWidth = screenSize.getWidth();

        TouchAction action = new TouchAction(mobileDriver());
        action.longPress(PointOption.point(deviceWidth / 2, deviceHeight / 4))
                .moveTo(PointOption.point(deviceWidth / 2, deviceHeight - 10))
                .release()
                .perform();
    }

    public void tapOnElementByAction(WebElement e) {
        TouchAction touchAction = new TouchAction(mobileDriver());
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(e))).perform();
    }

    public String getStringByXpath(String xpath) {
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String value = getDriver().findElement(By.xpath(xpath)).getText();
        return value;
    }
    public void clickNextButtonNumberKeyboard() {
        nextButtonNumberKeyboard.click();
    }


    public static String formatMoneyWithoutComma(String value) {
        value = value.replaceAll("[^\\d-]", "");
        return value;
    }
    public void tabOnCoordinate(int x, int y) {
        TouchAction touchAction = new TouchAction(mobileDriver());
        touchAction.tap(PointOption.point(x, y)).perform();
    }
    public void scrollUpByAction() {
        if (screenSize == null) {
            screenSize = getDriver().manage().window().getSize();
        }
        int deviceHeight = screenSize.getHeight();
        int deviceWidth = screenSize.getWidth();

        TouchAction action = new TouchAction(mobileDriver());
        action.longPress(PointOption.point(deviceWidth / 2, deviceHeight / 4))
                .moveTo(PointOption.point(deviceWidth / 2, deviceHeight / 2))
                .release()
                .perform();
    }

    public void waitElementEnable(int timeoutInSeconds, WebElementFacade e) {
        FluentWait<WebDriver> wait =
                new FluentWait<>(getDriver())
                        .withTimeout(Duration.of(timeoutInSeconds, ChronoUnit.SECONDS))
                        .pollingEvery(Duration.of(50, ChronoUnit.MILLIS));

        wait.until(
                (ExpectedCondition<Boolean>)
                        d -> {
                            try {
                                return e.isEnabled();
                            } catch (Exception exception) {
                                return false;
                            }
                        });
    }
    public void swipeToRight(int x, int y) {
        TouchAction swipe =
                new TouchAction(mobileDriver())
                        .press(PointOption.point(0, y))
                        .waitAction(waitOptions((ofMillis(300))))
                        .moveTo(PointOption.point(x, y))
                        .release()
                        .perform();
    }

    public static String formatBlankSpace(String s) {
        return s.replaceAll("[ \\s+]", "").replaceAll("[ \\s+\\n]", "");
    }

    public void hideKeyboard() {
        try {
            mobileDriver().hideKeyboard();
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }

    public void waitClearAndType(WebElementFacade elementFacade, String value) {
        elementFacade.click();
        elementFacade.clear();
        elementFacade.type(value);
    }

    public boolean checkElementDisplayed(WebElementFacade element) {
        if (Utilities.isCurrentPlatformAndroid()) return element.isPresent();
        else return element.isVisible();
    }

    String xpathIOS = "//*[@name=\"%s\"]";
    String xpathAndroid = "//*[@text=\"%s\"]";


    public boolean isElementDisplayed(String element) {
        String xpath =
                String.format(
                        Utilities.isCurrentPlatformAndroid() ? xpathAndroid : xpathIOS, element);
        return $(xpath).isDisplayed();
    }

}

