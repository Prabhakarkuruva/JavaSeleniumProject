package org.wipro.TestRunner;

import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

 
@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature",
glue = {"org.wipro.stepDefenition"},
plugin= {"junit:target/JunitReport/report.xml"})
public class DemoJunit {

}
