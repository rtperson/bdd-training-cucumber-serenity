package com.example.acceptancetests;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/",
        snippets = CucumberOptions.SnippetType.CAMELCASE, glue="com.example")
public class AcceptanceTestSuite {}
