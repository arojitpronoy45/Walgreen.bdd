package stepdefs;



import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyWater extends BaseClass{
	
	@Given("user clicks on the Search")
	public void userClicksOnTheSearch() {
	    homePage.clickSearchBar();
	}

	@Then("user type in {string} as value")
	public void userTypeInAsValue(String string) {
	    homePage.inputWater();
	}

	@When("user click on search")
	public void userClickOnSearch() {
	  homePage.clickSearch();
	}

	@Then("user will see {string} from the result")
	public void userWillSeeFromTheResult(String string) {
	    homePage.springWater();
	}

	@When("user click add to cart button")
	public void userClickAddToCartButton() {
	  homePage.addWaterToCart();
	}

	@Then("cart result will not increase")
	public void cartResultWillNotIncrease() {
	    homePage.closeOverlay();
	}


}