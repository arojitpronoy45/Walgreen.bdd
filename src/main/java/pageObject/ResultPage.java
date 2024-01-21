package pageObject;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ResultPage {
	public ResultPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h1[@class='font_fify schedulecovid-title']")
	WebElement appointments;
	
	@FindBy(xpath = "//p[@class='cdc-checkbox']")
	WebElement checkBox;
	
	
	public void validateResult(String expected) {
		Assert.assertEquals("", appointments.getText());
	}
	
	public void validateCheckBox(String expected) {
		Assert.assertEquals(expected, checkBox.getClass());
	}
}
