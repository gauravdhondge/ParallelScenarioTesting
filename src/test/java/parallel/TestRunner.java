package parallel;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
(
		
features =  {"C:\\Users\\Jayesh.Kulkarni\\eclipse-workspace\\guru99ParallelScenarioTesting\\src\\test\\resources\\parallel"},
glue = {"parallel"},
monochrome = true,
//plugin = {"pretty", "html: test-output"}
//plugin = {"pretty", "json:json_output/cucumber.json"}
//plugin = {"pretty","junit: junit_xml/cucumber.xml "}
plugin  = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
           "timeline:test-output-thread/",}
                                                    

//dryRun = true

)		


public class TestRunner  extends AbstractTestNGCucumberTests {
	
@Override
@DataProvider(parallel = true)	
	 
public Object [] [] scenarios(){
return super.scenarios();	

}
}