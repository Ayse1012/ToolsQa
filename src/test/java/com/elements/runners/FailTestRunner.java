package com.elements.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import javax.annotation.processing.SupportedOptions;

//class adı pom.xml deki ile aynı olması çok önemli, fail olan testin tekrar çalışmaya zorlar

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/failed-html-report"},
        features= "@target/rerun.text",
        glue="com/elements/step_definitions"
)

public class FailTestRunner {


}
