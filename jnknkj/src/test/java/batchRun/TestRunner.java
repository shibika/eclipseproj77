package batchRun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

 

@RunWith(Cucumber .class)
@CucumberOptions(features="aprdemo.feature",glue= {"com.jnknkj"},tags= {"@RegressionTest"},
plugin="html:target/cucumber-report.html")

public class TestRunner {
    
    //\src\test\java\defineStep\StepDefine.java

 

}