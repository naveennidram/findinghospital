package stepDefinations;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjects.HomePage;
import PageObjects.SurgeriesPage;
import PageObjects.healthWillnessForm;
import PageObjects.specialistPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testBase.Base;
import utilites.ExcelUtility;

public class stepDefination_3 {
	public WebDriver driver;
	public Base b;
	public HomePage hp;
	public specialistPage sp;
	public SurgeriesPage surgeries;
	public healthWillnessForm hf;
	
	/*@Given("practo website is open and working")
	public void practo_website_is_open_and_working() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		driver=Hooks.getDriver();
		b=new Base();
		String title=driver.getTitle();
		Assert.assertEquals(title,b.getProperties().getProperty("title") );
		
	}	*/
	
	@When("taking demo form is opened")
	public void taking_demo_form_is_open() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver=Hooks.getDriver();
        b=new Base();
		sp=new specialistPage(driver);
		hf=new healthWillnessForm(driver);
		sp.openHealthform();
	   
	}

	@When("set valid detials for all fields")
	public void set_detials_for_all_fields() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		Hooks.scroll(hf.scroll);
		hf.formDetials(ExcelUtility.getData(System.getProperty("user.dir")+"\\testData\\testInputData.xlsx", "Sheet1",6 , 1));
	    
	}


	@Then("check whether the submit button enabled or not")
	public void check_whether_the_submit_button_enabled_or_not() {
	    // Write code here that turns the phrase above into concrete actions
		boolean status=hf.submitButtonStatus();
	    
		   Assert.assertEquals(status, true);
	   
	}
	
	@Then("check thank you message displayed")
	public void check_thank_you_message_displayed() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		hf.clickSubmit();
		Assert.assertEquals(hf.getMsg(), b.getProperties().getProperty("msg"));
	}

	



}
