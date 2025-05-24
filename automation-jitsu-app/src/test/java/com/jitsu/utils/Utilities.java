/* (C)2023 */
package com.jitsu.utils;

import net.serenitybdd.core.Serenity;
import org.assertj.core.util.Strings;

public class Utilities {

    public static boolean isCurrentPlatformAndroid() {
        return DataUtils.getValueConf("appium.platformName").equalsIgnoreCase("android");
    }

    public static String getCurrentLanguage() {
        String currentLanguage = Serenity.sessionVariableCalled("currentLanguage");
        if (Strings.isNullOrEmpty(currentLanguage)) return DataUtils.getValueConf("serenity.lang");
        else return currentLanguage;
    }

    public static boolean isCurrentLanguageVi() {
        return getCurrentLanguage().equalsIgnoreCase("vi");
    }


    public static String processAccountNumberFormat(String account, String length) {
        return account.replaceAll("(.{" + length + "})", "$0 ").trim();
    }

    public static String getPasscodeConfig() {
        String currentPasscode = Serenity.sessionVariableCalled("currentPasscode");
        if (Strings.isNullOrEmpty(currentPasscode))
            return DataUtils.getValueConf("serenity.passcode");
        else return currentPasscode;
    }

    public static boolean checkFirstTimeLogin() {
        if (DataUtils.getValueConf("serenity.firstTimeLogin").equalsIgnoreCase("true")) {
            return true;
        }
        return false;
    }

    public static String removeSpace(String text) {
        return text.replaceAll("\\s+", "");
    }


}
