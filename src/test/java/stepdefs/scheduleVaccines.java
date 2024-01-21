package stepdefs;





import org.junit.Assert;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.LoggerClass;

public class scheduleVaccines extends BaseClass {
	
	@Given("user is in the homepage")
	public void userIsInTheHomepage() {
	    
	}

	@When("user clicks on Schedule vaccines box")
	public void userClicksOnScheduleVaccinesBox() {
		homePage.clickScheduleButton();
	}

	@Given("user will see appointments")
	public void userWillSeeAppointments() {
		Assert.assertEquals("Schedule a Vaccination Appointment | Walgreens Immunization Services", driver.getTitle());
		//scheduleVaccination.nextPage();
		LoggerClass.log("----- Title is varified, appointment page  is shown -----");
		
		
	}
	

	@When("user click on date of birth box")
	public void userClickOnDateOfBirthBox() {
		scheduleVaccination.clickdob();
		LoggerClass.log("----- Date of Birth -----");
	}

	@When("user type in DOB {string}")
	public void userTypeInDOB(String dob) {
	   scheduleVaccination.inputdob(dob);
	   LoggerClass.log("----- Entered Date of Birth -----");
	}

	@When("user click on email box")
	public void userClickOnEmailBox() {
		scheduleVaccination.clickEmail();
		LoggerClass.log("----- Email -----");
	}

	@When("user type in email {string}")
	public void userTypeInEmail(String string) {
		scheduleVaccination.inputEmail(string);
		LoggerClass.log("----- Entered Email -----");
	}

	@When("user click on phone box")
	public void userClickOnPhoneBox() {
		scheduleVaccination.clickOnPhone();
		LoggerClass.log("----- Phone Number -----");
	}

	@When("user  type in phone {string}")
	public void userTypeInPhone(String string) {
		scheduleVaccination.inputPhone(string);
		LoggerClass.log("----- Entered Phone Number -----");
	}

	@When("user click on checkbox")
	public void userClickOnCheckbox() {
		scheduleVaccination.clickCheckBox();
		LoggerClass.log("----- Click CheckBox -----");
	}

	@When("user click on next")
	public void userClickOnNext() {
		scheduleVaccination.nextPage();
		
	}
	
	@When("user click on bluenext")
	public void userClickOnBluenext() {
	   scheduleVaccination.blueNextButton();
	   LoggerClass.log("----Blue Button----");
	}

	@When("user should able to see the next page")
	public void userShouldAbleToSeeTheNextPage() {

		Assert.assertEquals("Schedule a Vaccination Appointment | Walgreens Immunization Services", driver.getTitle());
		LoggerClass.log("titile matched.....");
	}

	@When("user click on Flu")
	public void userClickOnFlu() {
		scheduleVaccination.Flu();
	}

	@Then("user click on No Thanks")
	public void userClickOnNoThanks() {
		scheduleVaccination.noBlueThanksButton();
	}
}