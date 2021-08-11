package com.StepDef;







import org.openqa.selenium.support.PageFactory;

import GenericCode.Highlighter;

import Utility.TakeScreenshot;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pagefactory.MainPageFact;


public class StepDef extends BaseFile{

	MainPageFact obj;
	@Given("^Open browser$")
	public void open_browser()   {

		obj= PageFactory.initElements(driver, MainPageFact.class);
		 
	}

	
	  @When("^Open url$") public void open_url() throws  Exception {

	  driver.get(ps.getProperty("URL")); 
	  driver.manage().window().maximize();
	  
	  }
	 
	
	@When("^Put valid username$")
	public void put_valid_username() throws  Exception  {
		
		obj.getGetusername().sendKeys(ps.getProperty("User"));
		Highlighter.gethighlighter(driver);
	}
	
	@When("^Put valid password$")
	public void put_valid_password() throws  Exception  {
	
		obj.getGetpassword().sendKeys(ps.getProperty("Password"));
	
	}
	
	@When("^Open the home page$")
	public void open_the_home_page() throws  Exception  {
	
		obj.getGetbutton().click();

		TakeScreenshot.getScreenshot(driver, "HomePage");
		
	}
	
	@When("^Open the transfer page$")
	public void open_the_transfer_page() throws  Exception  {

		obj.getGetfundtransfer().click();
		
		obj.getGetamount().sendKeys(ps.getProperty("Amount"));
		
		obj.getGetsubmit().click();
		
		TakeScreenshot.getScreenshot(driver, "TransferComplete");
	}
		
	@Then("^Validate the page title$")
	public void validate_the_page_title() throws  InterruptedException  {

	
		String response =driver.getTitle();
		System.out.println(response);
		Assert.assertEquals(response, "ParaBank | Transfer Funds");
	

	}
	

}
