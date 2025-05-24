/* (C)2023 */
package com.jitsu;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        plugin = {
                "pretty",
                "html:target/site/serenity/",
                "json:target/serenity-reports/cucumber_report.json",
                "rerun:rerun/serenity-reports/rerun.txt"
        })
public class TestSuite {
}
