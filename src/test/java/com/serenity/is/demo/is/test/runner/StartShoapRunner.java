package com.serenity.is.demo.is.test.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/startsharp.feature"},
        tags = "",
        glue = "",
        snippets = SnippetType.CAMELCASE
)


public class StartShoapRunner {
}
