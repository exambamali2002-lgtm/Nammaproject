package runnerpenta;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"C:\\Users\\Divya\\Documents\\workspace-spring-tools-for-eclipse-4.32.2.RELEASE\\Pentalife\\futurefile"},
		
		glue= {"pentalifepro"},
		dryRun = false,
		 monochrome = true,
		 plugin = {
				        "pretty",
				        "html:reports/cucumber-html-report.html",
				        "json:reports/cucumber.json",
				        "junit:reports/cucumber.xml"
		}
		
		)

public class regrunner  extends AbstractTestNGCucumberTests{

}
