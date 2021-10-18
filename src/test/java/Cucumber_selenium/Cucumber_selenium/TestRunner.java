package Cucumber_selenium.Cucumber_selenium;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/Mursaleen/eclipse-workspace/Cucumber_selenium/src/main/java/com/demoblaze",
glue= {"com.demoblaze3"}
//plugin = {"json:target/reports/report.json", "junit:target/reports/report.xml"},
//monochrome=true

 

        )

public class TestRunner 
{

}