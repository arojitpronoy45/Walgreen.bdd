package pageObject;

import static common.CommonAction.*;


import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ScheduleVaccination {

	public ScheduleVaccination(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	//@FindBy(xpath = "(//div[@class='btn btn__neutral'])[1]")
	//WebElement scheduleButton;
	
	@FindBy(xpath = "//h1[@class='font_fify schedulecovid-title']")
	WebElement pageAppointments;
	
	@FindBy(xpath = "//select[@id='gender-dropdown'']")
	WebElement drop;

	@FindBy(xpath = "//input[@id='userDob']")
	WebElement dateOfBirth;
	
	@FindBy(xpath = "//input[@id='field-email']")
	WebElement email;

	@FindBy(xpath = "//input[@name='userPhone']")
	WebElement clickphone;
	
	@FindBy(name = "cdcguestcheck")
	WebElement checkbox;
	
	@FindBy(xpath = "//span[@id='nextBtn']")
	WebElement next;
	
	@FindBy(xpath = "//input[@id='check-1']")
	WebElement FluCheckBox;
	
	@FindBy(xpath = "//span[text()='Next']")
	WebElement btnNext;
	
	@FindBy(xpath = "//a[text()='No Thanks']")
	WebElement noThanksButton;
	
	//@FindBy(xpath = "//*[@id=\"wag-body-main-container\"]/section/section[2]/section/section/form/section[1]/section/section[1]/div/span[1]/label[2]") WebElement emailplaceholderElement;
	//*[@id="wag-body-main-container"]/section/section[2]/section/section/form/section[1]/section/section[1]/div/span[1]/label[2]/text()
	
	
		
		//handleDropDownwithVal("Male", drop);
	
	public void pageAppointments() {
		click(pageAppointments);
	}
	
	public void clickdob() {
		click(dateOfBirth);
		
	}
	
	public void inputdob(String dob) {
		input(dateOfBirth, dob);
	}
public void clickEmail() {
	click(email);
}
public void inputEmail(String userEmail) {
	input(email, userEmail);
}
public void clickOnPhone() {
	click(clickphone);
}
public void inputPhone(String phone) {
	input(clickphone, phone);
}
public void clickCheckBox() {
	click(checkbox);
	
}
//abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ


public void nextPage() {
	click(next);
}

public void Flu() {
	click(FluCheckBox);
}

public void blueNextButton() {
	click(btnNext);
}
public void noBlueThanksButton() {
	click(noThanksButton);
}

}