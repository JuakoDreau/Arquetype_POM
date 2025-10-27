package com.testGroup.testProject.pom.testCases;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(publish = false, glue = {"com/testGroup/testProject"},
        features = "src/test/resources/features/test.feature",
        tags = "@test03"
)
public class baseTest {
}
