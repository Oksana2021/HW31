package com.studentapp.cucumber.steps;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;


@RunWith(SerenityRunner.class)


public class PlayMixSteps {
	 @Managed  WebDriver driver;
	
@Test	 

 @Given("^User navigates to Mixcloud website$")
 public void user_navigates_to_mixcloud_website() {
 	driver.get("https://www.mixcloud.com/");
    driver.manage().window().maximize();
 }
 @When("^User clicks on the login button on page$")
 public void user_clicks_on_the_login_button_on_page() throws Throwable {
 driver.findElement(By.xpath("//*[contains(text(), 'Login')]")).click();
 }
 @When("^User enters a valid username$")
 public void user_enters_a_valid_username() {
 	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("oksanakirichenko2014@gmail.com");
  }
 @When("^User enters a valid password$")
 public void user_enters_a_valid() {
 	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Qwerty123");
  }
 @When("^User clicks on the log in button$")
 public void user_clicks_on_the_log_in_button() throws Throwable {
 	Thread.sleep(3000);
 	driver.findElement(By.xpath("//*[contains(text(),  'Log In')]")).click();
    }	
 @When("^User should be successfully logged in$")
 public void user_should_be_logged_in() throws Throwable {
 	Thread.sleep(2000);
 	WebElement QaLab=driver.findElement(By.xpath("//*[contains(text(), 'Ksyu2021')]"));
 	Assert.assertEquals(true,  QaLab.isDisplayed());
 }
 @When("^User clicks Search field$")
	public void user_clicks_Search_field() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input['mixcloud_query']")).click();
		driver.findElement(By.xpath("//div/input['mixcloud_query']")).sendKeys("Martin Garrix");
	}

    @When("^User clicks on the artistname profile button$")
    public void user_clicks_on_the_artistname_profile_button() throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@href='/MartinGarrix/']")).click();
        Thread.sleep(3000);

    }

    @When("^User clicks on the add artistname show to favorites$")
    public void user_clicks_on_the_add_artistname_show_to_favorites() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[3]/div/div/div[3]/div/div[3]/main/div[1]/div/div/div/div[1]/div[1]/div/div/div[3]/div/div[1]")).click();
    }

    @When("^User clicks on the your profile button$")
    public void user_clicks_on_the_your_profile_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[3]/div/div/div[2]/div/div[3]/div[3]")).click();
        driver.findElement(By.xpath("//a[@href='/Ksyu2021/']")).click();
    }
    @Then("^User should have artistname show in favorites$")
    public void user_should_have_artistname_show_in_favorites() throws Throwable {
        Thread.sleep(5000);
        WebElement Garrix =driver.findElement(By.xpath("//*[contains(text(), 'The Martin Garrix Show')]"));
        Assert.assertEquals(true,  Garrix.isDisplayed());
    }

    @When("^User clicks on the delete artistname show from favorites$")
    public void user_clicks_on_the_delete_artistname_show_from_favorites() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[3]/div/div/div[3]/div/div[3]/main/div[1]/div/div/div[1]/div/div/div/div[3]/div/div[1]")).click();
    }

    @Then("^User should'n have artistname show in favorites$")
    public void user_should_n_have_artistname_show_in_favorites() throws Throwable {
        Thread.sleep(5000);
        WebElement NOGarrix =driver.findElement(By.xpath("//*[contains(text(), 'Oh no, this user hasn’t favorited anything yet!')]"));
        Assert.assertEquals(true,  NOGarrix.isDisplayed());
    }
}

