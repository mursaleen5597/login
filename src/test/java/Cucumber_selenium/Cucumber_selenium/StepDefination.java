package Cucumber_selenium.Cucumber_selenium;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

 

public class StepDefination {
    
    WebDriver driver = null;
    
    
    @Given("Browser is open")
    public void browser_is_open() {
        System.out.println("Inside the first step");
        System.setProperty("webdriver.chrome.driver", "D:\\Destination\\chromedriver.exe");
		driver=new ChromeDriver();
        driver.navigate().to("https://google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        
        // Write code here that turns the phrase above into concrete actions
     //   throw new io.cucumber.java.PendingException();
    }
    @And("user is on search page")
    public void user_is_on_search_page() {
        System.out.println("User is on home page");
        // Write code here that turns the phrase above into concrete actions
    //    throw new io.cucumber.java.PendingException();
    }
    @When("user enters the text in search box")
    public void user_enters_the_text_in_search_box() {
        driver.findElement(By.name("q")).sendKeys("Automation Testing");
        
        // Write code here that turns the phrase above into concrete actions
     //   throw new io.cucumber.java.PendingException();
    }
    @And("hits enter button")
    public void hits_enter_button() {
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        
        
        // Write code here that turns the phrase above into concrete actions
    //    throw new io.cucumber.java.PendingException();
    }
    @Then("user is navigated to the search result")
    public void user_is_navigated_to_the_search_result() {
        System.out.println("OPeration is done");
        // Write code here that turns the phrase above into concrete actions
    //    throw new io.cucumber.java.PendingException();
    }
    

 
}
