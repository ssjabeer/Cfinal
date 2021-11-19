package runnable;

import java.io.File;
import java.io.FileReader;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.Reporter;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\Welcome\\eclipse-workspace\\Cfinal\\featurefile\\Cfinal.feature", glue = {"stepdefinition"},
monochrome = true, plugin = {"html:target/cucumberreprots.html",
							 "json:target/cucumberreprots.json" ,"pretty", 
"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})


public class Runner {

	
}
