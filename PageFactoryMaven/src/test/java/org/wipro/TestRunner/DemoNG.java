package org.wipro.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\Feature\\Sample3.feature",
glue= {"org.wipro.stepDefenition","org.wipro.Hooks"},
plugin= {"pretty","html:target/CucumberReport/report.html"},
//tags=("@SmokeTest or @SystemTest"),
monochrome=true)


public class DemoNG extends AbstractTestNGCucumberTests{

}