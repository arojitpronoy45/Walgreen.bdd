package pageObject;

import static common.CommonAction.*;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[@class='btn btn__neutral'])[1]")
	WebElement scheduleButton;
	
	@FindBy(xpath = "(//input[@class='blue-shadow ellipsis'])[1]")
	WebElement searchBar;

	@FindBy(id = "pf-icon__search")
	WebElement clickSearch;
	
	@FindBy(xpath = "//h1[text()='water ']")
	WebElement springWater;
	
	@FindBy (id = "pickup-ship-btncompare_sku6191330")
	WebElement select2ndWater;
	
	@FindBy (xpath = "//button[@id='closeoverlayBtn']")
	WebElement closeOverlay;
	
	public void clickSearchBar() {
		click(searchBar);

	}
	public void clickScheduleButton() {
		click(scheduleButton);
	}

	public void inputWater() {
		input(searchBar, "water");
	}
	public void clickSearch() {
		click(clickSearch);
	}

public void springWater() {
	click(springWater);
}
public void addWaterToCart() {
	click(select2ndWater);
}
public void closeOverlay() {
	click(closeOverlay);
}
}