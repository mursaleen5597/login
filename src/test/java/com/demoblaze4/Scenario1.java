package com.demoblaze4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.demoblaze3.PageObjectModelConcept;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario1 
{
	WebDriver driver = null;
  @Test
  @Given("Browser is open")
 
       public void browser_is_open() throws InterruptedException  
  {
	  PageObjectModelConcept p = PageFactory.initElements(driver, PageObjectModelConcept.class);
      System.out.println("Inside the first step");
      System.setProperty("webdriver.chrome.driver", "D:\\Destination\\chromedriver.exe");
      driver=new ChromeDriver();
      driver.get("https://www.demoblaze.com/");
      driver.manage().window().maximize();
    /*  driver.findElement(By.xpath("//a[@id='login2']")).click();
      Thread.sleep(3000);
      driver.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys("shershah");
  	  driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("shershah@123");
  	  p.login_button.click();
      */
  }
  @Test
  @And("user is on Demoblaze login page")
  public void user_is_on_Demoblaze_login_page() throws InterruptedException 
  {
	  PageObjectModelConcept p = PageFactory.initElements(driver, PageObjectModelConcept.class);
      //System.out.println("User is on login page");
      driver.findElement(By.xpath("//a[@id='login2']")).click();
   //   p.username.sendKeys("shershah");
   	 //p.password.sendKeys("shershah@123");
   	 //p.login_button.click();
      Thread.sleep(3000);

  }
  @Test
  @When("user enters the username and password in respective text boxes")
  public void user_enters_the_username_and_password_in_respective_text_boxes() throws InterruptedException 
  {
  	//PageObjectModelConcept p = PageFactory.initElements(driver, PageObjectModelConcept.class);
  	
	//p.username.sendKeys("shershah");
  	// p.password.sendKeys("shershah@123");
  	//driver.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys("shershah");
  	//driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("shershah@123");
  	Thread.sleep(3000);
   
  }
  @Test
  @And("user hits login button")
  public void user_hits_login_button()
  {
  	PageObjectModelConcept p = PageFactory.initElements(driver, PageObjectModelConcept.class);
      //driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
  	//driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
  	// p.login_button.click();
  	// Thread.sleep(3000);
  	 
  
  }
  @Test
  @Then("user is navigated to the home page successfully")
  public void user_is_navigated_to_the_home_page_successfully()
  {
      System.out.println("Successfully LogIn");
    //  driver.close();
     
  }
  
}
