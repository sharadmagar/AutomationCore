package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		publish = true,
		features="src//test//resources//feature",
		glue = {"stepDefinations"},
		//dryRun = true,
		monochrome=true,
		plugin = {"pretty",
				"html:target/report/report.html",
				//"usage:target/report/usageReport",
				//"json:target/report/jsonReport.json",
				//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				}
		//tags = "@RegressionTests"  will execute only regression tags cases
		////tags = "not @RegressionTests"  will execute other than regression tags cases
		//tags = "@RegressionTests and @SmokeTest"  will execute regression and sanity mentioned tags cases
		//tags = "@RegressionTests and not @SmokeTest"  will execute only regression tags cases and the sanity test
		//tags = "@SmokeTest or @RegressionTests"  //will execute regression and sanity both tags cases
		)
public class testRunner extends AbstractTestNGCucumberTests{

}
