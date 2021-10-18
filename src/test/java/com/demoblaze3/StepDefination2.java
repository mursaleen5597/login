package com.demoblaze3;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination2 
{
    
    WebDriver driver = null;
    
      
    @Given("Browser is open")
    public void browser_is_open()  
    {
        System.out.println("Inside the first step");
        System.setProperty("webdriver.chrome.driver", "D:\\Destination\\chromedriver.exe");
		driver=new ChromeDriver();
        driver.navigate().to("https://www.demoblaze.com/");
        driver.manage().window().maximize();
  
    }
    @And("user is on Demoblaze login page")
    public void user_is_on_Demoblaze_login_page() throws InterruptedException 
    {
        //System.out.println("User is on login page");
        driver.findElement(By.xpath("//a[@id='login2']")).click();
        Thread.sleep(3000);
 
    }
    @When("user enters the username and password in respective text boxes")
    public void user_enters_the_username_and_password_in_respective_text_boxes() 
    {
    	PageObjectModelConcept p = PageFactory.initElements(driver, PageObjectModelConcept.class);
    	
    	 p.username.sendKeys("shershah");
    	 p.password.sendKeys("shershah@123");
    	//driver.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys("shershah");
    	//driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("shershah@123");
     
    }
    @And("user hits login button")
    public void user_hits_login_button()
    {
    	PageObjectModelConcept p = PageFactory.initElements(driver, PageObjectModelConcept.class);
        //driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    	//driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
    	 p.login_button.click();
    	// Thread.sleep(3000);
    	 
    
    }
    @Then("user is navigated to the home page successfully")
    public void user_is_navigated_to_the_home_page_successfully()
    {
        System.out.println("Successfully LogIn");
      //  driver.close();
       
    }
    
    @When("user will NOT enter the username and password in respective text boxes")
    public void user_will_NOT_enter_the_username_and_password_in_respective_text_boxes()
    {
    	PageObjectModelConcept p = PageFactory.initElements(driver, PageObjectModelConcept.class);
    	//driver.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys("");
    	//driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("");
    	 p.username.sendKeys("");
    	 p.password.sendKeys("");
    }
    
    @Then("error message should be displayed to the user")
    public void error_message_should_be_displayed_to_the_user()
    {
    	System.out.println("Invalid Credentials");
    }
    
    @When("user will enter only the username and NOT password in respective text boxes")
    public void user_will_enter_only_the_username_and_NOT_password_in_respective_text_boxes()
    {
    	PageObjectModelConcept p = PageFactory.initElements(driver, PageObjectModelConcept.class);
    	//driver.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys("shershah");
    	//driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("");
    	 p.username.sendKeys("shershah");
    	 p.password.sendKeys("");
    }
    
    @When("user will enter invalid username and inavalid password in respective text boxes")
    public void user_will_enter_invalid_username_and_inavalid_password_in_respective_text_boxes()
    {
    	PageObjectModelConcept p = PageFactory.initElements(driver, PageObjectModelConcept.class);
    	//driver.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys("sachin");
    	//driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("sachin@123");
    	 p.username.sendKeys("sachin");
    	 p.password.sendKeys("sachin@123");
    }
    
   
    
    @When("user will enter username and perform copy or paste operation on password field")
    public void user_will_enter_username_and_perform_copy_or_paste_operation_on_password_field()
    {
    	PageObjectModelConcept p = PageFactory.initElements(driver, PageObjectModelConcept.class);
    	Actions actions = new Actions(driver);
        
        // Clear existing value in the first name textbox
    	 p.password.sendKeys("Khan");
        
        //Setting a new name
        //driver.findElement(By.id("Richard")).clear(); 
       
        // Select the value of First Name using CTRL + A
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("a");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        
        // Copy the value of First Name using CTRL + C
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("c");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
 
        // Press the TAB Key to Switch Focus to Last Name
        actions.sendKeys(Keys.TAB);
        actions.build().perform(); 
 
        // Select the existing value of Last Name using CTRL + A
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("a");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
 
        // Paste the value of First Name using CTRL + V
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("v");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
    }
    
    @When("user will enter username and password beyond the specified limit in respective text boxes")
    public void user_will_enter_username_and_password_beyond_the_specified_limit_in_respective_text_boxes()
    {
    	PageObjectModelConcept p = PageFactory.initElements(driver, PageObjectModelConcept.class);
    	p.username.sendKeys("abcdedghijklmnopqrstuvwxyz");
    	p.password.sendKeys("abcdedghijklmnopqrstuvwxyz@123");
    }
    
    @When("user will enter username and password below the specified limit in respective text boxes")
    public void user_will_enter_username_and_password_below_the_specified_limit_in_respective_text_boxes()
    {
    	PageObjectModelConcept p = PageFactory.initElements(driver, PageObjectModelConcept.class);
    	p.username.sendKeys("Jam");
    	p.password.sendKeys("J@123");
    }
    
    @When("user hits on close button")
    public void user_hits_on_close_button() 
    {
    	PageObjectModelConcept p = PageFactory.initElements(driver, PageObjectModelConcept.class);
    	//*[@id="logInModal"]/div/div/div[1]/button/span
    	//driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[1]/button/span")).click();
    	//driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[1]")).click();
    	p.close_button.click();
    	//Thread.sleep(3000);
    }
    
    @Then("login window must be closed")
    public void login_window_must_be_closed() {
        System.out.println("Login window is closed successfully");
    }

 
}
